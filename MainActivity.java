package com.example.sectrainingapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager; // Imports the layout manager
import androidx.recyclerview.widget.RecyclerView; // Imports the list widget
import java.util.ArrayList; // Imports the list utility
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Define the variables for the list and the adapter
    private RecyclerView recyclerView;
    private CourseAdapter adapter;
    private List<CourseModel> courseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Links to your XML design

        // 1. Initialize the RecyclerView from the layout
        recyclerView = findViewById(R.id.recyclerView);

        // 2. Set how the items are arranged (Linear = a standard list)
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // 3. Create the list of data (Simulating the website content)
        courseList = new ArrayList<>();

        // Add specific courses based on Mahendra Training Portal
        // Technical Modules (With YouTube Links and Python.org)
        courseList.add(new CourseModel(
                "Python Programming - Module I",
                "Technical (TT)",
                "Intro to Python syntax, loops, and basic data structures.",
                "https://www.youtube.com/watch?v=_uQrJ0TkZlc", // Python Tutorial Video
                "https://www.python.org/doc/" // Official Docs
        ));

        courseList.add(new CourseModel(
                "Full Stack Development",
                "Technical (TT)",
                "Building dynamic web apps with Java Spring Boot and React.",
                "https://www.youtube.com/watch?v=nu_pCVPKzTk", // Full Stack Video
                "https://www.w3schools.com/whatis/"
        ));

        courseList.add(new CourseModel(
                "C Programming Mastery",
                "Technical (TT)",
                "Advanced pointers, memory management, and algorithms.",
                "https://www.youtube.com/watch?v=KJgsSFOSQv0", // C Programming Video
                "https://www.geeksforgeeks.org/c-programming-language/"
        ));

        // Placement (Aptitude Links)
        courseList.add(new CourseModel(
                "Quantitative Aptitude",
                "Placement",
                "Math shortcuts, number systems, and percentage problems.",
                "https://www.youtube.com/watch?v=fIM4M3d4wVc",
                "https://www.indiabix.com/aptitude/questions-and-answers/"
        ));
        // 4. Connect the Data to the Adapter, and the Adapter to the RecyclerView
        adapter = new CourseAdapter(courseList);
        recyclerView.setAdapter(adapter);
    }
}