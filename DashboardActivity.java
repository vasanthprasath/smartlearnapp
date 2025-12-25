package com.example.sectrainingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Define the Cards from the clean layout
        CardView cardCourses = findViewById(R.id.cardCourses);
        CardView cardAssessments = findViewById(R.id.cardAssessments);

        // 1. "My Courses" -> Opens the List
        cardCourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 2. "Assessments" (Just a placeholder for now)
        cardAssessments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "Assessments Locked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}