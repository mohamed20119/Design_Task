package com.example.task1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class FazaatFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fazzat_content,container,false);
        init_tab(v);
        return v;
    }
    public void init_tab(View v) {
        TabLayout tabLayout = (TabLayout) v.findViewById(R.id.FazaatTab);
        ViewPager viewPager = (ViewPager) v.findViewById(R.id.FazaatViewPager);
        ArrayList<FazaatModel> list = new ArrayList<>();
        list.add(new FazaatModel(new CancelFragment(), "تم الالغاء"));
        list.add(new FazaatModel(new AcceptedFragmet(), "تم القبول"));
        list.add(new FazaatModel(new WaitingFragment(), "قيد الانتظار"));


        FazaatAdaptor customAdaptor = new FazaatAdaptor(getFragmentManager(), list);
        viewPager.setAdapter(customAdaptor);
        tabLayout.setupWithViewPager(viewPager);
        for (int x = 0; x < list.size(); x++) {
            tabLayout.getTabAt(x).setText(list.get(x).getTitle());
        }

    }
}
