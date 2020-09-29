package com.example.task1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.List;

public class FazaatAdaptor  extends FragmentPagerAdapter {
    private List<FazaatModel> list;
    public FazaatAdaptor(@NonNull FragmentManager fm, ArrayList<FazaatModel> list) {
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
