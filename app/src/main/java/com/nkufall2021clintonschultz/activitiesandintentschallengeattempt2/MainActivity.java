package com.nkufall2021clintonschultz.activitiesandintentschallengeattempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.nkufall2021clintonschultz.twoactivities.extra.MESSAGE";

    public static String message = "word";

    public static final String passage1 = "Some words - passage 1";
    public static final String passage2 = "Some words - passage 2";
    public static final String passage3 = "Some words - passage 3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button_passage1 = findViewById(R.id.button_passage_one);
        final Button button_passage2 = findViewById(R.id.button_passage_two);
        final Button button_passage3 = findViewById(R.id.button_passage_three);

        button_passage1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                message = "1";
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        });

        button_passage2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                message = "2";
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        });

        button_passage3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                message = "3";
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        });
    }
}