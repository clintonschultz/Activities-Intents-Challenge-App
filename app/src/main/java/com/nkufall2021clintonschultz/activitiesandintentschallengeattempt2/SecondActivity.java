package com.nkufall2021clintonschultz.activitiesandintentschallengeattempt2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    public TextView textView;

    public String passage1 = "This is passage 1. Word.";
    public String passage2 = "This is passage 2. Werd.";
    public String passage3 = "This is passage 3. Wyrd.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.passage);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        displayOnReturn(message);
    }

    public Boolean displayOnReturn(String message) {
        switch (message) {
            case "1":
                textView.setText(passage1);
                return true;
            case "2":
                textView.setText(passage2);
                return true;
            case "3":
                textView.setText(passage3);
                return true;
            default:
                textView.setText("There was an issue");
                return true;
        }
    }
}
