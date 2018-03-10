package com.example.student.db2018031002;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = getSharedPreferences("mydata", MODE_PRIVATE);
    }
    public void clickRead(View v)
    {
        String str = sp.getString("nickname", "teacher");

        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
    }
    public void clickWrite(View v)
    {
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("nickname", "Peter");
        editor.commit();
    }
}
