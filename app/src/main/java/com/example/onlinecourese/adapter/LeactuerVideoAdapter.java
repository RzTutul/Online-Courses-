package com.example.onlinecourese.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onlinecourese.CourseVideoActivity;
import com.example.onlinecourese.model.LecturerPojo;
import com.example.onlinecourese.R;

import java.util.List;

public class LeactuerVideoAdapter extends RecyclerView.Adapter<LeactuerVideoAdapter.CourseViewHolder>{

    List<LecturerPojo> list;
    Context context;

    public LeactuerVideoAdapter(List<LecturerPojo> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.basic_course_row,parent,false);

        Animation animation = AnimationUtils.loadAnimation(context,R.anim.fall);
        view.setAnimation(animation);

        return new CourseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {

        holder.videoNumber.setText(list.get(position).getVideoNumber());
        holder.titleTV.setText(list.get(position).getVideoTitle());
        if (CourseVideoActivity.index==position)
        {
            holder.titleTV.setTextColor(Color.parseColor("#FF7C35"));
            holder.videoNumber.setTextColor(Color.parseColor("#FF7C35"));
            holder.playBtn.setVisibility(View.GONE);
        }
        else
        {
            holder.videoNumber.setTextColor(Color.parseColor("#000000"));
            holder.titleTV.setTextColor(Color.parseColor("#000000"));
            holder.playBtn.setVisibility(View.VISIBLE);
        }


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class CourseViewHolder extends RecyclerView.ViewHolder{
       ImageButton playBtn;
       TextView videoNumber,titleTV;

        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);
            playBtn = itemView.findViewById(R.id.playBtn);
            videoNumber = itemView.findViewById(R.id.videoNumber);
            titleTV = itemView.findViewById(R.id.titleTV);


        }
    }
}
