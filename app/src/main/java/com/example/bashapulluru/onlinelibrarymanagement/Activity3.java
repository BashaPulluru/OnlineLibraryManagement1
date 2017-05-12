package com.example.bashapulluru.onlinelibrarymanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
    TextView admin_text,name_txt,pass_txt;
    EditText admin_name_et,admin_pass_et;
    Button admin_ok,admin_clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        admin_text=(TextView)findViewById(R.id.admin_tv);
        name_txt=(TextView)findViewById(R.id.admin_text);
        pass_txt=(TextView)findViewById(R.id.admin_pass);
        admin_name_et=(EditText)findViewById(R.id.username_et);
        admin_pass_et=(EditText)findViewById(R.id.pass_et);
        admin_ok=(Button)findViewById(R.id.ok_btn);
        admin_clear=(Button)findViewById(R.id.clear_btn);
        admin_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent admin=new Intent(Activity3.this,Activity5.class);
                startActivity(admin);
            }
        });
    }
}
