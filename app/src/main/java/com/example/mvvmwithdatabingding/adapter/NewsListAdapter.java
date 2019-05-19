package com.example.mvvmwithdatabingding.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mvvmwithdatabingding.R;
import com.example.mvvmwithdatabingding.databinding.ListItemBinding;
import com.example.mvvmwithdatabingding.viewmodel.NewsModel;

import java.util.ArrayList;


public class NewsListAdapter extends ArrayAdapter<NewsModel> {

    private ArrayList<NewsModel> newsModelArrayList;
    private Context mContext;

    public NewsListAdapter(Context context, ArrayList<NewsModel> arrayList) {
        super(context, R.layout.list_item);
        this.newsModelArrayList = arrayList;
        this.mContext = context;
    }


    @Override
    public View getView(int position, View convertView,ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        ListItemBinding listItemBinding = DataBindingUtil.inflate(layoutInflater,R.layout.list_item,parent,false);
        listItemBinding.setNewList(newsModelArrayList.get(position));

        return listItemBinding.getRoot();
    }
}
