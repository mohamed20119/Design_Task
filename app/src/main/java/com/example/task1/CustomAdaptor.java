package com.example.task1;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;

public class CustomAdaptor extends FragmentPagerAdapter {
    ArrayList<Model> list = new ArrayList<>();
    public CustomAdaptor(@NonNull FragmentManager fm, ArrayList<Model>list) {
        super(fm);
        this.list=list;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return list.get(position).getFragment();
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
