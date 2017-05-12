package com.example.bashapulluru.onlinelibrarymanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity5 extends AppCompatActivity {
    Button add_book,update_book,remove_book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        add_book=(Button)findViewById(R.id.addbook_btn);
        update_book=(Button)findViewById(R.id.update_book_btn);
        remove_book=(Button)findViewById(R.id.remove_book_btn);
        add_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addbook=new Intent(Activity5.this,Activity6.class);
                startActivity(addbook);
            }
        });
    }
}
