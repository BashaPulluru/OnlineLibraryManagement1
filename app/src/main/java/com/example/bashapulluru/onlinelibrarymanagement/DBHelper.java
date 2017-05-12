package com.example.bashapulluru.onlinelibrarymanagement;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by BASHA PULLURU on 11-05-2017.
 */

public class DBHelper extends SQLiteOpenHelper {
    private static final String DB_Name="Books_Repository.db";
    private static final String TB_Name="Table_Name";
    private static final String Book_id="book_id";
    private static final String Book_Name="book_name";
    private static final String Author="author";
    private static final String Book_type="book_type";
    private static final String Technology="technology";
    private static final String Create_table="SELECT"+TB_Name+"("+Book_id+"INTEGER PRIMARY KEY,"+Book_Name+"VARCHAR(46),"
            +Author+"VARCHAR(20)"+Book_type+"VARCHAR(50),"+Technology+"VARCHAR(50))";
    private static final int DB_Version=1;
Context context;
    //SQLiteDatabase db=this.getWritableDatabase();
    public DBHelper(Context context) {
        super(context, DB_Name, null, DB_Version);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Create_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS"+TB_Name);
        onCreate(db);

    }
    public void insertbook(String bookid, String bookName, String author1, String booktype, String technology1)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues c=new ContentValues();
        c.put(Book_id,bookid);
        c.put(Book_Name,bookName);
        c.put(Author,author1);
        c.put(Book_type,booktype);
        c.put(Technology,technology1);
        db.insert(TB_Name,null,c);
    }
}
