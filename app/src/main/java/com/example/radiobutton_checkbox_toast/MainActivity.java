package com.example.radiobutton_checkbox_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton rd1, rd2, rd3;
    CheckBox cb1, cb2, cb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        rd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rd1.isChecked()){
                    Toast.makeText(getApplicationContext(),"Bạn chọn Radio Button 1",Toast.LENGTH_SHORT).show();
                }
            }
        });
        rd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rd2.isChecked()){
                    Toast.makeText(getApplicationContext(),"Bạn chọn Radio Button 2",Toast.LENGTH_SHORT).show();
                }
            }
        });
        rd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rd3.isChecked()){
                    Toast.makeText(getApplicationContext(),"Bạn chọn Radio Button 3",Toast.LENGTH_SHORT).show();
                }
            }
        });

        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb1.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Bạn chọn Check Box 1", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Bạn không chọn Check Box 1",Toast.LENGTH_SHORT).show();
                }
            }
        });
        cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb2.isChecked()){
                    Toast.makeText(getApplicationContext(),"Bạn chọn Check Box 2",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Bạn không chọn Check Box 2",Toast.LENGTH_SHORT).show();
                }
            }
        });
        cb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb3.isChecked()){
                    Toast.makeText(getApplicationContext(),"Bạn chọn Check Box 3",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Bạn không chọn Check Box 3",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    void init(){
        rd1 = findViewById(R.id.radioButton1);
        rd2 = findViewById(R.id.radioButton2);
        rd3 = findViewById(R.id.radioButton3);
        cb1 = findViewById(R.id.checkBox1);
        cb2 = findViewById(R.id.checkBox2);
        cb3 = findViewById(R.id.checkBox3);
    }
}