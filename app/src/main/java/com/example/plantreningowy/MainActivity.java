package com.example.plantreningowy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_EXERCISE = "com.example.plantreningowy.EXERCISE";
    public static final String EXTRA_REPS = "com.example.plantreningowy.REPS";
    public static final String EXTRA_TYPE = "com.example.plantreningowy.TYPE";

    private static final int REQUEST_SUMMARY = 1;

    private EditText editTextExercise, editTextReps;
    private Spinner spinnerType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextExercise = findViewById(R.id.editTextExercise);
        editTextReps = findViewById(R.id.editTextReps);
        spinnerType = findViewById(R.id.spinnerType);
        Button buttonSummary = findViewById(R.id.buttonSummary);

        buttonSummary.setOnClickListener(v -> {
            String exercise = editTextExercise.getText().toString().trim();
            String repsText = editTextReps.getText().toString().trim();
            String type = spinnerType.getSelectedItem() != null ? spinnerType.getSelectedItem().toString() : "";

            if (exercise.isEmpty()) {
                editTextExercise.setError("Wprowadź nazwę ćwiczenia");
                return;
            }

            if (repsText.isEmpty()) {
                editTextReps.setError("Wprowadź liczbę powtórzeń");
                return;
            }

            int reps;
            try {
                reps = Integer.parseInt(repsText);
                if (reps <= 0) {
                    editTextReps.setError("Liczba powtórzeń musi być większa od 0");
                    return;
                }
            } catch (NumberFormatException e) {
                editTextReps.setError("Nieprawidłowy format liczby powtórzeń");
                return;
            }

            Intent intent = new Intent(MainActivity.this, SummaryActivity.class);
            intent.putExtra(EXTRA_EXERCISE, exercise);
            intent.putExtra(EXTRA_REPS, reps);
            intent.putExtra(EXTRA_TYPE, type);
            startActivityForResult(intent, REQUEST_SUMMARY);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_SUMMARY) {
            if (resultCode == Activity.RESULT_OK) {
                Toast.makeText(this, "Plan treningowy potwierdzony!", Toast.LENGTH_SHORT).show();
            } else if (resultCode == Activity.RESULT_CANCELED) {
                Toast.makeText(this, "Plan treningowy anulowany!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}