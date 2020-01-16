package com.example.intentdata26112019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mBtnIntentString,mBtnIntentArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnIntentString = findViewById(R.id.buttonIntentString);
        mBtnIntentArray = findViewById(R.id.buttonIntentArray);

        mBtnIntentString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("chuoi","Hello main 2");
                startActivity(intent);
            }
        });
        mBtnIntentArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int [] arrayNumbers = {1,2,3,4,5,6,7,8,9,10};
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("mang so",arrayNumbers);
                startActivity(intent);
            }
        });
    }
}
