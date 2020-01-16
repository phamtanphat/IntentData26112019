package com.example.intentdata26112019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // 1 : Lay du lieu dang chuoi
//        Intent intent = getIntent();
//        String value = intent.getStringExtra("chuoi");
//        Toast.makeText(this, value, Toast.LENGTH_SHORT).show();
        // 2 : Lay du lieu dang mang Array
//        Intent intent = getIntent();
//        int[] arrayNumbers = intent.getIntArrayExtra("mang so");
//        Toast.makeText(this, arrayNumbers.length + "", Toast.LENGTH_SHORT).show();
        // 3 : Lay du lieu dang object
        Intent intent = getIntent();
        Sinhvien sinhvien = (Sinhvien) intent.getSerializableExtra("object");
        Toast.makeText(this, sinhvien.getTen(), Toast.LENGTH_SHORT).show();

    }
}
