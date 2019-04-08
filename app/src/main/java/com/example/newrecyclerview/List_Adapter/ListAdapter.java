package com.example.newrecyclerview.List_Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.newrecyclerview.Modal.Student;
import com.example.newrecyclerview.R;

import org.w3c.dom.Text;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.Myviewholder> {
    private List<Student> StudentList;

    public ListAdapter(List<Student> studentList) {
        StudentList = studentList;
    }

    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemview = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_view,viewGroup,false);
        return new Myviewholder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder myviewholder, int i) {
        Student s1 = StudentList.get(i);
        myviewholder.id.setText("Student Id: "+s1.getId());
        myviewholder.name.setText("Student Name: "+s1.getName());
        myviewholder.gender.setText("Student gender: "+s1.getGender());

    }

    @Override
    public int getItemCount() {
        return StudentList.size();
    }


    public class Myviewholder extends  RecyclerView.ViewHolder
    {
        public TextView id,name,gender;
        public Myviewholder(View itemview)
        {
            super(itemview);
            id=(TextView) itemview.findViewById(R.id.id);
            name=(TextView) itemview.findViewById(R.id.name);
            gender=(TextView) itemview.findViewById(R.id.gender);
        }


    }
}
