package com.example.student.db2018031002;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
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
    public void clickSettings(View v)
    {
        Intent it = new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(it);
    }
    public void clickNick(View v)
    {
        TextView tv = findViewById(R.id.textView);
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        String str = sp.getString("sp_nickname", "Nickname");
        tv.setText(str);
    }
}
