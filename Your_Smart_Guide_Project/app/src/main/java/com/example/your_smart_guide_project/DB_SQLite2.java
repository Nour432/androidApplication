package com.example.your_smart_guide_project;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DB_SQLite2 extends SQLiteOpenHelper {
    public static final String dbName2="dataa.db";
    public DB_SQLite2(@Nullable Context context) {
        super(context, dbName2, null, 7);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table Student_Registration(id INTEGER PRIMARY KEY AUTOINCREMENT,national_id  TEXT not null," +
                "courses Text)");


        sqLiteDatabase.execSQL("create table Temp_Courses(courses TEXT)");

    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS Student_Registration");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS Temp_Courses");
        onCreate(sqLiteDatabase);

    }

  public   void insert_Courses_In_Temp(String course) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("courses", course);
         db.insert("Temp_Courses", null, contentValues2);

    }



    public boolean insert_in_Student_Registration(String id, ArrayList<String> courses) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        boolean success = true;

        for (String course : courses) {
            contentValues.put("national_id", id);
            contentValues.put("courses", course);

            long result = db.insert("Student_Registration", null, contentValues);

            if (result == -1) {
                success = false;
                break;
            }
        }
        if(id.isEmpty()||courses.size()==0)  return false;

        return success;
    }




    public void delete(String courseName) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("Temp_Courses", "courses=?", new String[]{courseName});
    }

    public ArrayList getAllRecords(){
        ArrayList arrayList =new ArrayList();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res=db.rawQuery("select courses from Temp_Courses",null);
        res.moveToFirst();
        while (res.isAfterLast()==false){
            String t1=res.getString(0);

            arrayList.add(t1);
            res.moveToNext();

        }
        return arrayList;
    }

    public void deleteAllRecords() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("Temp_Courses", null, null);
    }



}
