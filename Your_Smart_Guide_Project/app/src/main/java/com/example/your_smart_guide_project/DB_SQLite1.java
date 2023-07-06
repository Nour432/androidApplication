package com.example.your_smart_guide_project;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DB_SQLite1 extends SQLiteOpenHelper {
   public static final String dbName="data.db";
    public DB_SQLite1(@Nullable Context context) {
        super(context, dbName, null, 5);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table Complaints (id INTEGER PRIMARY KEY AUTOINCREMENT,mail TEXT not null," +
                "national_ID TEXT not null,complaint Text not null,name TEXT not null)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS Complaints ");
        onCreate(sqLiteDatabase);

    }

    public boolean insert_Data_In_Complaints(String Name,String Mail ,String ID,String Complaint ){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("mail",Mail);
        contentValues.put("national_ID",ID);
        contentValues.put("complaint",Complaint);
        contentValues.put("name",Name);

        if(Name.isEmpty()||Mail.isEmpty()||ID.isEmpty()||Complaint.isEmpty())
            return false;

        long result= db.insert("Complaints",null,contentValues);


        if(result==-1)
            return false;

        else return true;
    }



}
