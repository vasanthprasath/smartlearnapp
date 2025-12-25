package com.example.sectrainingapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CourseDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_detail);

        // 1. Get Data
        String title = getIntent().getStringExtra("title");
        String desc = getIntent().getStringExtra("description");
        String videoUrl = getIntent().getStringExtra("videoUrl");
        String webLink = getIntent().getStringExtra("webLink");

        // 2. Setup Text
        TextView txtTitle = findViewById(R.id.detailTitle);
        TextView txtDesc = findViewById(R.id.detailDesc);
        txtTitle.setText(title);
        txtDesc.setText(desc);

        // 3. Setup Video Button
        Button btnVideo = findViewById(R.id.btnWatchVideo);
        btnVideo.setOnClickListener(v -> {
            if (videoUrl != null && !videoUrl.isEmpty()) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(videoUrl));
                startActivity(intent);
            } else {
                Toast.makeText(this, "No video available", Toast.LENGTH_SHORT).show();
            }
        });

        // 4. Setup Website Button
        Button btnWeb = findViewById(R.id.btnOpenLink);
        btnWeb.setOnClickListener(v -> {
            if (webLink != null && !webLink.isEmpty()) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(webLink));
                startActivity(intent);
            } else {
                Toast.makeText(this, "No link available", Toast.LENGTH_SHORT).show();
            }
        });
    }
}