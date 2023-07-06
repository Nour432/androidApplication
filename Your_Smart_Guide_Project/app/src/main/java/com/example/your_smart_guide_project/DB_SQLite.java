package com.example.your_smart_guide_project;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DB_SQLite  extends SQLiteOpenHelper {
    public static final String dbName="data.db";
    public DB_SQLite(@Nullable Context context) {
        super(context, dbName, null, 6);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {


        sqLiteDatabase.execSQL(
                "create  table Student_Information (id INTEGER PRIMARY KEY AUTOINCREMENT,student_name TEXT not null," +
                         "national_id TEXT UNIQUE not null, phone_number TEXT UNIQUE not null, email TEXT UNIQUE not null)");

        sqLiteDatabase.execSQL(
                "create  table Student_Profile (student_name TEXT not null," +
                        "national_id TEXT UNIQUE not null, phone_number TEXT UNIQUE not null, email TEXT UNIQUE not null,password TEXT)");

        sqLiteDatabase.execSQL(
                "create table Students_Passwords(id INTEGER PRIMARY KEY AUTOINCREMENT,national_id TEXT UNIQUE not null," +
                        "password TEXT )"
        );

        sqLiteDatabase.execSQL("create table Student_Complaints(id INTEGER PRIMARY KEY AUTOINCREMENT,national_ID TEXT not null," +
                "complaint TEXT not null  )");



    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS Student_Information");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS Students_Passwords");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS Student_Complaints ");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS Student_Profile ");


        onCreate(sqLiteDatabase); 
    }

    public boolean insert_Data_In_Student_Information(String name , String national_id , String phone_number , String email  ){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("student_name",name);
        contentValues.put("national_id",national_id);
        contentValues.put("phone_number",phone_number);
        contentValues.put("email",email);

        long result= db.insert("Student_Information",null,contentValues);

        if(result==-1)
            return false;
        else return true;
    }




    public boolean insert_Data_In_Student_Profile(String name , String national_id , String phone_number , String email,String pass  ){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("student_name",name);
        contentValues.put("national_id",national_id);
        contentValues.put("phone_number",phone_number);
        contentValues.put("email",email);
        contentValues.put("password",pass);

        long result= db.insert("Student_Profile",null,contentValues);

        if(result==-1)
            return false;
        else return true;
    }












    public boolean insert_Data_In_Student_Password( String national_id , String password ){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues1=new ContentValues();

        contentValues1.put("national_id",national_id);
        contentValues1.put("password",password);


        long result1= db.insert("Students_Passwords",null,contentValues1);

        if(result1==-1)
            return false;
        else return true;

    }
    public boolean searchOnStudentsPasswords(String national_id, String pass) {
        SQLiteDatabase db = this.getReadableDatabase();

        if(national_id.isEmpty()||pass.isEmpty()) {
            return false;

        }

        Cursor cursor = db.rawQuery("select * from Students_Passwords where national_id=? and password=?", new String[]{national_id, pass});

        if(cursor.getCount() >0) {
            cursor.close();
            return true;
        }
        else {
            cursor.close();
            return false;
        }
    }

    public boolean insert_Data_In_Complaints(String nationalId, String comp) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("national_ID", nationalId);
        contentValues2.put("complaint", comp);
        long result2 = db.insert("Student_Complaints", null, contentValues2);

        if (result2 == -1) {

            return false;
        }
        else {
            return true;
        }
    }

    public boolean search(String national_id) {
        SQLiteDatabase db = this.getReadableDatabase();

        if(national_id.isEmpty())
            return false;

        Cursor cursor = db.rawQuery("select national_id  from Students_Passwords where national_id=? ", new String[]{national_id});

        if(cursor.getCount() >0) {
            cursor.close();
            return true;
        }
        else {

            cursor.close();
            return false;
        }
    }

    public void deleteAllRecords() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("Student_Information", null, null);
    }

    public void deleteAllRecords1() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("Students_Passwords", null, null);
    }

    public void deleteAllRecordss() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("Student_Profile", null, null);
    }


    public ArrayList getAllRecords(){
        ArrayList arrayList =new ArrayList();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res=db.rawQuery("select * from Student_Profile",null);
        res.moveToFirst();
        while (res.isAfterLast()==false){
            String t1=res.getString(0);
            String t2=res.getString(1);
            String t3=res.getString(2);
            String t4=res.getString(3);
            String t5=res.getString(4);

            arrayList.add(t1);
            arrayList.add(t2);
            arrayList.add(t3);
            arrayList.add(t4);
            arrayList.add(t5);
            res.moveToNext();

        }
        return arrayList;



    }









}


