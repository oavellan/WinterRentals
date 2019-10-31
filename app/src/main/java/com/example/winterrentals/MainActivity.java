package com.example.winterrentals;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Button button;

    {
        button = new Button(R.id.button);
    }

    @Override
    public void onClickListener(button){
        Button = button(ActivitySecond());
    };
}
