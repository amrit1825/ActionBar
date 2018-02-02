package com.example.amrthaku.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        RecyclerView myRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        String[] data = {"hello","hi","call","out","take","out","what","quit","and","tick","company","plus","minus","multiply","divide",
                "hello","hello","hello","hello","hello"};
        myRecyclerView.setAdapter(new MyAdapter(data));
     }
}
