package com.example.sectrainingapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.ViewHolder> {

    private List<CourseModel> courseList;

    public CourseAdapter(List<CourseModel> courseList) {
        this.courseList = courseList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_course, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CourseModel course = courseList.get(position);
        holder.txtTitle.setText(course.getTitle());
        holder.txtCategory.setText(course.getCategory());
        holder.txtDescription.setText(course.getDescription());

        // Handle button click
        holder.btnStart.setOnClickListener(v -> {
            android.content.Intent intent = new android.content.Intent(v.getContext(), CourseDetailActivity.class);

            intent.putExtra("title", course.getTitle());
            intent.putExtra("description", course.getDescription());

            // Pass the new links!
            intent.putExtra("videoUrl", course.getVideoUrl());
            intent.putExtra("webLink", course.getWebLink());

            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle, txtCategory, txtDescription;
        Button btnStart;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtCategory = itemView.findViewById(R.id.txtCategory);
            txtDescription = itemView.findViewById(R.id.txtDescription);
            btnStart = itemView.findViewById(R.id.btnStart);
        }
    }
}