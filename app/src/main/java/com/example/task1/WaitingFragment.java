package com.example.task1;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class WaitingFragment extends Fragment {
    private ArrayList<ListviewModel> list;
    private ListView listView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.waiting_content,container,false);
        init_ListView(v);
        return v;
    }

    public void init_ListView(View v)
    {
        this.list = new ArrayList<>();
        this.list.add(new ListviewModel("ابى اروح الهايبر وماعندى سيارة ممكن حد يودينى","منذ ساعة","رجال","فزعة سيارة","2 فزعة",R.drawable.type_car));
        this.list.add(new ListviewModel("بنات ضرورى عندى عزومة وابى حد يساعدنى","منذ ساعة","سيدات","فزعة اكل","2فزعة",R.drawable.type_food));
        this.listView = (ListView)v.findViewById(R.id.listview);
        CustomListviewAdaptor adaptor = new CustomListviewAdaptor(v.getContext(),list);
        this.listView.setAdapter(adaptor);
    }

}
