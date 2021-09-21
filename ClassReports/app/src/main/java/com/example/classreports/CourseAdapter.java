package com.example.classreports;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.Viewholder> {
    private Context context;
    private ArrayList<CourseModel> courseModelArrayList;

    public CourseAdapter(Context context,ArrayList<CourseModel> courseModelArrayList){
        this.context=context;
        this.courseModelArrayList = courseModelArrayList;
    }


    @NonNull
    @Override
    public CourseAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,parent,false);

        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseAdapter.Viewholder holder, int position) {
        CourseModel model = courseModelArrayList.get(position);
        holder.courseNameTv.setText(model.getCourse_name());

    }

    @Override
    public int getItemCount() {
        return courseModelArrayList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        private TextView courseNameTv;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            courseNameTv=itemView.findViewById(R.id.textView1);
        }
    }
}
