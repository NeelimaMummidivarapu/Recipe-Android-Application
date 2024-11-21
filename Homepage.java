package com.example.mainchef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }

    public void rec1(View view) {
        Intent intent=new Intent(Homepage.this,NewActivity.class);
        startActivity(intent);
    }
    public void rec2(View view) {
        Intent intent=new Intent(Homepage.this,SecondActivity.class);
        startActivity(intent);
    }
    public void rec3(View view) {
        Intent intent=new Intent
                (Homepage.this,ThirdActivity.class);
        startActivity(intent);
    }

    public void rec4(View view) {
        Intent intent=new Intent
                (Homepage.this,FourthActivity.class);
        startActivity(intent);
    }

    public void rec5(View view) {
        Intent intent=new Intent
                (Homepage.this,FifthActivity.class);
        startActivity(intent);
    }

    public void rec6(View view) {
        Intent intent=new Intent
                (Homepage.this,SixthActivity.class);
        startActivity(intent);
    }

    public void rec7(View view) {
        Intent intent=new Intent
                (Homepage.this,SeventhActivity.class);
        startActivity(intent);
    }

    public void rec8(View view) {
        Intent intent=new Intent
                (Homepage.this,EigthActivity.class);
        startActivity(intent);
    }

    public void rec9(View view) {Intent intent=new Intent
            (Homepage.this,NinthActivity.class);
        startActivity(intent);
    }

    public void rec10(View view) {Intent intent=new Intent
            (Homepage.this,TenthActivity.class);
        startActivity(intent);
    }


    public void onProfileIconClick(View view) {
        Intent intent=new Intent
                (Homepage.this,ProfileActivity.class);
        startActivity(intent);

    }
}