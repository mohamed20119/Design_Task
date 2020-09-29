package com.example.task1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class A5reenFragment extends Fragment {
    private  ArrayList<A5reenModel> list;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.a5ryn_content,container,false);
        init_tab(v);
        return v;
    }

    public void init_tab(View v) {
        TabLayout tabLayout = (TabLayout) v.findViewById(R.id.a5rynTab);
        ViewPager viewPager = (ViewPager) v.findViewById(R.id.a5rynViewPager);
        this.list = new ArrayList<>();
        this.list.add(new A5reenModel(new CancelFragment(), "تم الالغاء"));
        this.list.add(new A5reenModel(new AcceptedFragmet(), "تم القبول"));
        this.list.add(new A5reenModel(new WaitingFragment(), "قيد الانتظار"));

        A5reenAdaptor customAdaptor = new A5reenAdaptor(getFragmentManager(), this.list);
        viewPager.setAdapter(customAdaptor);
        tabLayout.setupWithViewPager(viewPager);
        for (int x = 0; x < this.list.size(); x++) {
            tabLayout.getTabAt(x).setText(this.list.get(x).getTitle());
        }

    }
}
