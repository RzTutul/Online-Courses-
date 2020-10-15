package com.example.onlinecourese;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.onlinecourese.adapter.LeactuerVideoAdapter;
import com.example.onlinecourese.helper.RecyclerItemClickListener;
import com.example.onlinecourese.model.LecturerPojo;
import com.potyvideo.library.AndExoPlayerView;

import java.util.ArrayList;
import java.util.List;

public class CourseVideoActivity extends AppCompatActivity {

    public  static int index = 0;
    RecyclerView basicCourseRV;
    AndExoPlayerView andExoPlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_video);
        andExoPlayerView = findViewById(R.id.andExoPlayerView);
        basicCourseRV = findViewById(R.id.basicCourseRV);
        //video have completed buffering
        andExoPlayerView.setSource("https://www.udemy.com/assets/11987050/files/1632804/11987050/2018-04-05_21-15-31-5eff2e8c99eb0c8b15a1aad2e0601a3b/1/hls/AVC_640x360_90k_AAC-HE_64k/aa00a3a9fa34b82786dfba4dc583423f133e.m3u8?provider=verizon&v=1\n");


        List<LecturerPojo> list = new ArrayList<>();

        list.add(new LecturerPojo("1", "Setup, String,Variables..", "https://www.radiantmediaplayer.com/media/big-buck-bunny-360p.mp4"));
        list.add(new LecturerPojo("2", "Lists", "https://www.udemy.com/assets/11987046/files/1632804/11987046/2018-04-05_21-15-11-e0baf34dc3cd048b89daf0a3fc36f2ed/1/hls/AVC_640x360_90k_AAC-HE_64k/aa00a2e27df91aa13b14bfb44738b8425d9c.m3u8?provider=verizon&v=1"));
        list.add(new LecturerPojo("3", "For loop..", "https://www.udemy.com/assets/11987078/files/1632804/11987078/2018-04-05_21-15-20-d8a65fab158c4b78d90f00f9a5657d5a/1/hls/AVC_640x360_90k_AAC-HE_64k/aa002e387cf8933ca546cf084f51c7a8f88a.m3u8?provider=verizon&v=1"));
        list.add(new LecturerPojo("4", "String Substitution.", "https://www.udemy.com/assets/11987020/files/1632804/11987020/2018-04-05_21-15-11-603a800b1dcea8ff60a56b178d534f83/1/hls/AVC_640x360_90k_AAC-HE_64k/aa00842e98cb79bdcb3d275cf17fa64352ec.m3u8?provider=verizon&v=1"));
        list.add(new LecturerPojo("5", "Class ..", "https://www.radiantmediaplayer.com/media/big-buck-bunny-360p.mp4"));
        list.add(new LecturerPojo("6", "Constructor Parameters..", "https://www.radiantmediaplayer.com/media/big-buck-bunny-360p.mp4"));


        LeactuerVideoAdapter leactuerVideoAdapter = new LeactuerVideoAdapter(list, this);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        basicCourseRV.setLayoutManager(llm);
        basicCourseRV.setAdapter(leactuerVideoAdapter);

        basicCourseRV.addOnItemTouchListener(
                new RecyclerItemClickListener(this, basicCourseRV, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        andExoPlayerView.setSource(list.get(position).getVideoUrl());
                        index = position;
                        leactuerVideoAdapter.notifyDataSetChanged();
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        // do whatever
                    }
                })
        );

    }
}