package com.example.plantreningowy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        TextView textViewSummary = findViewById(R.id.textViewSummary);
        Button buttonConfirm = findViewById(R.id.buttonConfirm);
        Button buttonCancel = findViewById(R.id.buttonCancel);

        Intent intent = getIntent();
        String exercise = intent.getStringExtra(MainActivity.EXTRA_EXERCISE);
        int reps = intent.getIntExtra(MainActivity.EXTRA_REPS, 0);
        String type = intent.getStringExtra(MainActivity.EXTRA_TYPE);

        String summary = "Ćwiczenie: " + exercise + "\nPowtórzenia: " + reps + "\nTyp treningu: " + type;
        textViewSummary.setText(summary);

        buttonConfirm.setOnClickListener(v -> {
            setResult(Activity.RESULT_OK);
            finish();
        });

        buttonCancel.setOnClickListener(v -> {
            setResult(Activity.RESULT_CANCELED);
            finish();
        });
    }
}