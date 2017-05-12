package com.example.bashapulluru.onlinelibrarymanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    Button admin_btn,emp_btn,other_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        admin_btn=(Button)findViewById(R.id.admin_btn);
        emp_btn=(Button)findViewById(R.id.employee_btn);
        other_btn=(Button)findViewById(R.id.other_btn);
        admin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(Activity2.this,Activity3.class);
                startActivity(i3);
            }
        });
        emp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(Activity2.this,Activity4.class);
                startActivity(i4);
            }
        });
        other_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6=new Intent(Activity2.this,Activity6.class);
                startActivity(i6);
            }
        });
    }
}
