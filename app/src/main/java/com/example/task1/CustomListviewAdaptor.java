package com.example.task1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListviewAdaptor extends BaseAdapter {
    private  ArrayList<ListviewModel> list = new ArrayList<>();
    private  Context context ;
    public CustomListviewAdaptor(Context context , ArrayList<ListviewModel> list) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView.inflate(this.context,R.layout.list_content,null);

        ImageView imageView = (ImageView)v.findViewById(R.id.contentIcon);
        imageView.setImageResource(this.list.get(position).getPic());

        TextView title = (TextView) v.findViewById(R.id.contentTitle);
        title.setText(this.list.get(position).getTitle());

        TextView time = (TextView)v.findViewById(R.id.timeContent);
        time.setText(this.list.get(position).getTime());

        TextView gender = (TextView)v.findViewById(R.id.genderContent);
        gender.setText(this.list.get(position).getGender());

        TextView type= (TextView)v.findViewById(R.id.typeContent);
        type.setText(this.list.get(position).getType());

        TextView counter = (TextView)v.findViewById(R.id.counterContent);
        counter.setText(this.list.get(position).getCounter());

        return v;
    }
}
