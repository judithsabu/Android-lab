package com.example.sjcet.insert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1, ed2, ed3;
    Button bt1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        ed3=findViewById(R.id.ed3);
        bt1=findViewById(R.id.bt1);
    }

    public void savedta(View view) {
        String userval =ed1.getText().toString();
        String Surval=ed2.getText().toString();
        int passval=Integer.parseInt(ed3.getText().toString());
        boolean result=database.insertdata(userval,Surval,passval);
        if (result==true)
            Toast.makeText(getApplicationContext(), "data inserted sucessfully", Toast.LENGTH_LONG).show();
        else{
            Toast.makeText(getApplicationContext(),"data insertion failed",Toast.LENGTH_LONG).show();
        }


        }

    }

