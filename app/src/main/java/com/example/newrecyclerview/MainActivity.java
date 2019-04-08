package com.example.newrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.newrecyclerview.List_Adapter.ListAdapter;
import com.example.newrecyclerview.Modal.Student;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Student> StudentList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ListAdapter lAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycle1);
        lAdapter = new ListAdapter(StudentList);
        RecyclerView.LayoutManager mLayoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(lAdapter);
        data();

    }
    private void data()
    {
        StudentList.add(new Student("11","gurminder","female"));
        StudentList.add(new Student("12","gur","female"));
        StudentList.add(new Student("13","gurinder","male"));
        StudentList.add(new Student("14","gurpinder","female"));
        StudentList.add(new Student("15","gurwinder","male"));
        StudentList.add(new Student("16","gurvinder","female"));

    }
}
