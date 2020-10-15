package com.example.onlinecourese;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.onlinecourese.adapter.CourseListAdapter;
import com.example.onlinecourese.model.CoursePojo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView courseRV;
    List<CoursePojo> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        courseRV = findViewById(R.id.courseRV);
        list.add(new CoursePojo(R.drawable.graphdesing,"Graphics & \nDesigning","45"));
        list.add(new CoursePojo(R.drawable.marketing,"Digital & \nMarketing","45"));
        list.add(new CoursePojo(R.drawable.flutter_course,"Dart & \nFlutter","45"));
        list.add(new CoursePojo(R.drawable.bussiness,"Business & \nManagement","45"));
        list.add(new CoursePojo(R.drawable.music,"Music & \nComposer","45"));




        CourseListAdapter courseListAdapter = new CourseListAdapter(list,this);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        courseRV.setLayoutManager(llm);
        courseRV.setAdapter(courseListAdapter);

    }
}