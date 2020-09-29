package com.example.task1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.List;

public class A5reenAdaptor extends FragmentPagerAdapter {
    List<A5reenModel> list;
    public A5reenAdaptor(@NonNull FragmentManager fm, ArrayList<A5reenModel> list) {
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
