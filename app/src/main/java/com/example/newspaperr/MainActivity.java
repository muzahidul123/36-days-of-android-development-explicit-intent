package com.example.newspaperr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView newspaperTV, headlineTV, summaryTV;
    private ImageView hasinaIV;
    private Button readmoreBtn;
    private String FullNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newspaperTV = findViewById(R.id.newspaperTV);
        headlineTV = findViewById(R.id.headlineTV);
        summaryTV = findViewById(R.id.summaryTV);
        hasinaIV = findViewById(R.id.hasinaIV);
        readmoreBtn = findViewById(R.id.readmoreBtn);


        readmoreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent;
                intent = new Intent(MainActivity.this, NextActivity.class);
                startActivity(intent);

            }
        });
    }
}
