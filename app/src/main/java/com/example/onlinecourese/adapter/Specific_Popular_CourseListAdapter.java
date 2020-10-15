package com.example.onlinecourese.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onlinecourese.model.CoursePojo;
import com.example.onlinecourese.CourseVideoActivity;
import com.example.onlinecourese.R;

import java.util.List;

public class Specific_Popular_CourseListAdapter extends RecyclerView.Adapter<Specific_Popular_CourseListAdapter.CourseViewHolder>{

    List<CoursePojo> list;
    Context context;

    public Specific_Popular_CourseListAdapter(List<CoursePojo> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.specific_course_row,parent,false);

        Animation animation = AnimationUtils.loadAnimation(context,R.anim.right_side);
        view.setAnimation(animation);

        return new CourseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {

        holder.courseImage.setImageResource(list.get(position).getImage());
        holder.titleTV.setText(list.get(position).getTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, CourseVideoActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class CourseViewHolder extends RecyclerView.ViewHolder{
        ImageView courseImage;
        TextView titleTV;

        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);
            courseImage = itemView.findViewById(R.id.imageView);
            titleTV = itemView.findViewById(R.id.courseName);


        }
    }
}
