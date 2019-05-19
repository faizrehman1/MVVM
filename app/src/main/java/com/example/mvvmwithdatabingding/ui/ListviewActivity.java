package com.example.mvvmwithdatabingding.ui;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.mvvmwithdatabingding.R;
import com.example.mvvmwithdatabingding.adapter.NewsListAdapter;
import com.example.mvvmwithdatabingding.databinding.ActivityMainBinding;
import com.example.mvvmwithdatabingding.viewmodel.NewsModel;

import java.util.ArrayList;

public class ListviewActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private NewsModel newsModel;
    private ArrayList<NewsModel> newsModelArrayList;
    private NewsListAdapter newsListAdapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    //    setContentView(R.layout.activity_listview);

        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_listview);
        newsModel = new NewsModel();
        newsModelArrayList = newsModel.getNewsModelArray();
        newsListAdapter = new NewsListAdapter(ListviewActivity.this,newsModelArrayList);
        listView = (ListView)findViewById(R.id.listview);
        listView.setAdapter(newsListAdapter);
    }
}
