package com.example.task1;

import androidx.fragment.app.Fragment;

public class FazaatModel {
    private Fragment fragment ;
    private String title ;

    public FazaatModel(Fragment fragment, String title) {
        this.fragment = fragment;
        this.title = title;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
