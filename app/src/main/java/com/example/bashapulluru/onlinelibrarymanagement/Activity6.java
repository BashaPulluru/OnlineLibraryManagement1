package com.example.bashapulluru.onlinelibrarymanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity6 extends AppCompatActivity {
    TextView addbooktitle_tv,bookid_tv,bookname_tv,author_tv,technology_tv,booktype_tv;
    EditText bookid_et,bookname_et,author_et,technology_et,booktype_et;
     Button addbook_ok_btn,addbook_clear_btn;
    DBHelper helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);
        helper=new DBHelper(this);
        addbooktitle_tv=(TextView)findViewById(R.id.addbook_tv1);
        bookid_tv=(TextView)findViewById(R.id.bookid_txt);
        bookname_tv=(TextView)findViewById(R.id.bookname_txt);
        author_tv=(TextView)findViewById(R.id.author_txt);
        technology_tv=(TextView)findViewById(R.id.technology_txt);
        booktype_tv=(TextView)findViewById(R.id.booktype_txt);
        bookid_et=(EditText)findViewById(R.id.bookid_et);
        bookname_et=(EditText)findViewById(R.id.bookname_et);
        author_et=(EditText)findViewById(R.id.author_et);
        technology_et=(EditText)findViewById(R.id.technology_et);
        booktype_et=(EditText)findViewById(R.id.booktype_et);
        addbook_ok_btn=(Button)findViewById(R.id.addbook_btn);
        addbook_clear_btn=(Button)findViewById(R.id.book_details_clear_btn);
        insertdata();
    }
    public void insertdata()
    {
        addbook_ok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.insertbook(bookid_et.getText().toString(),bookname_et.getText().toString(),author_et.getText().toString(),
                        technology_et.getText().toString(),booktype_et.getText().toString());

            }
        });
    }
}
