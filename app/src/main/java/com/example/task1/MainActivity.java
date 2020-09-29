package com.example.task1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.app.ActionBar;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    ArrayList<Model> list;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        init_tab();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void init_tab() {
        this.tabLayout = (TabLayout) findViewById(R.id.tabs);
        this.viewPager = (ViewPager) findViewById(R.id.viewpager);
        this.list = new ArrayList<>();
        this.list.add(new Model(new A5reenFragment(), "الاخرين"));
        this.list.add(new Model(new FazaatFragment(), "فزعاتى"));

        CustomAdaptor customAdaptor = new CustomAdaptor(getSupportFragmentManager(), list);
        this.viewPager.setAdapter(customAdaptor);
        this.tabLayout.setupWithViewPager(viewPager);
        for (int x = 0; x < list.size(); x++) {
            this.tabLayout.getTabAt(x).setText(list.get(x).getTitle());
        }

    }
}