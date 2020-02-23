package com.example.screen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private androidx.appcompat.widget.Toolbar toolbar;
    private Button applybtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);
        applybtn=findViewById(R.id.applybtn);
        applybtn.setOnClickListener(new View.OnClickListener()

        {
            public void onClick (View v)
            {
                Intent i = new Intent(MainActivity.this, Screen2.class);
                startActivity(i);
            }
        });
    }
}
