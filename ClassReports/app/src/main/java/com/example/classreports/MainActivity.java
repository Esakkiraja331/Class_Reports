package com.example.classreports;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView courseRV;
    private ArrayList<CourseModel> courseModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        courseRV = findViewById(R.id.idRVCourse);

        courseModelArrayList=new ArrayList<>();
        courseModelArrayList.add(new CourseModel("10 A"));
        courseModelArrayList.add(new CourseModel("10 B"));
        courseModelArrayList.add(new CourseModel("10 C"));
        courseModelArrayList.add(new CourseModel("10 D"));

        CourseAdapter courseAdapter = new CourseAdapter(this,courseModelArrayList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(courseAdapter);

    }
}