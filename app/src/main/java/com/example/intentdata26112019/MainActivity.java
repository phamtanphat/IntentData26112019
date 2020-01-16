package com.example.intentdata26112019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Button mBtnIntentString,mBtnIntentArray,mBtnIntentObject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnIntentString = findViewById(R.id.buttonIntentString);
        mBtnIntentArray = findViewById(R.id.buttonIntentArray);
        mBtnIntentObject = findViewById(R.id.buttonIntentObject);

        mBtnIntentString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
//                intent.putExtra("chuoi","Hello main 2");
//                startActivity(intent);
                sendData("chuoi","Hello main 2");
            }
        });
        mBtnIntentArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int [] arrayNumbers = {1,2,3,4,5,6,7,8,9,10};
//                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
//                intent.putExtra("mang so",arrayNumbers);
//                startActivity(intent);
                sendData("mang so",arrayNumbers);
            }
        });
        mBtnIntentObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sinhvien sinhvien = new Sinhvien("Nguyen Van a");
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("object", sinhvien);
                startActivity(intent);
            }
        });
    }
    private <T> void  sendData(String key,T value){
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        if (value instanceof String){
            intent.putExtra(key,(String) value);
        }
        if (value instanceof int[]){
            intent.putExtra(key,(int[]) value);
        }
        startActivity(intent);
    }
}
