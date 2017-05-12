package com.example.bashapulluru.onlinelibrarymanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {
TextView welcome_text,quote_text;
    Button enter_btn,quit_btn;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        frameLayout=(FrameLayout)findViewById(R.id.frame1);
        welcome_text=(TextView)findViewById(R.id.welcome_text);
        quote_text=(TextView)findViewById(R.id.quote_text);
        enter_btn=(Button)findViewById(R.id.enterbtn);
        quit_btn=(Button)findViewById(R.id.quitbtn);
        enter_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Activity1.this,Activity2.class);
                startActivity(i);
            }
        });
        quit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quitintent=new Intent(Intent.ACTION_MAIN);
                quitintent.addCategory(Intent.CATEGORY_HOME);
                quitintent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(quitintent);
            }
        });
    }
}
