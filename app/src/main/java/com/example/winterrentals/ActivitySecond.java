package com.example.winterrentals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;

public class ActivitySecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    CheckBox checkBox;

    {
        CheckBox = new checkBox(R.id.checkBox2)
    }

    @Override
    public void checkBoxListener(checkBox2){
        checkBox = checkBox(snowBoard());
    }
}
