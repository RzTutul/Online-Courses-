package com.example.onlinecourese;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.onlinecourese.adapter.Specific_Popular_CourseListAdapter;
import com.example.onlinecourese.model.CoursePojo;

import java.util.ArrayList;
import java.util.List;

public class Specific_CourseListActivity extends AppCompatActivity {

    RecyclerView popularCourseRV, BeginnerCourseRV;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);
        popularCourseRV = findViewById(R.id.popularCourseRV);
        BeginnerCourseRV = findViewById(R.id.BeginnerCourseRV);
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Specific_CourseListActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


        List<CoursePojo> list = new ArrayList<>();
        list.add(new CoursePojo(R.drawable.ic_uxdesing, "UX for Freelancer", "45"));
        list.add(new CoursePojo(R.drawable.ic_graphdesing, "User relization", "45"));
        list.add(new CoursePojo(R.drawable.ic_desingtools, "Designing Tools", "45"));
        list.add(new CoursePojo(R.drawable.ic_uxdesing, "UX for Freelancer", "45"));


        Specific_Popular_CourseListAdapter courseListAdapter = new Specific_Popular_CourseListAdapter(list, this);
        LinearLayoutManager llm = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        popularCourseRV.setLayoutManager(llm);
        popularCourseRV.setAdapter(courseListAdapter);
        List<CoursePojo> list2 = new ArrayList<>();
        list2.add(new CoursePojo(R.drawable.ic_desingtools, "Designing Tools", "45"));
        list2.add(new CoursePojo(R.drawable.ic_desingcomnity, "Design community", "45"));
        list2.add(new CoursePojo(R.drawable.ic_uxdesing, "UX for Freelancer", "45"));
        Specific_Popular_CourseListAdapter beginnerAdapter = new Specific_Popular_CourseListAdapter(list2, this);
        LinearLayoutManager beginLLM = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        BeginnerCourseRV.setLayoutManager(beginLLM);
        BeginnerCourseRV.setAdapter(beginnerAdapter);


    }
}