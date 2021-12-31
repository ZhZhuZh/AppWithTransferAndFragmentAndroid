package ru.rudn.appwithtransferandfragmentandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        String str = getIntent().getExtras().getString("msg",null);
        if(str != null){
            ((ThirdFragment)getSupportFragmentManager().findFragmentById(R.id.id)).setText(str);
        }
    }
}