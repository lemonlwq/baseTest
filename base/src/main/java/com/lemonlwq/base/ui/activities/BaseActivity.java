package com.lemonlwq.base.ui.activities;


import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.lemonlwq.base.ui.viewmodel.NavigationBar;

/**
 * Created by MLinWQ on 2018/11/24 10:36
 */

public abstract class BaseActivity extends AppCompatActivity {
    public static final String EXTRAS_NAV_BAR = "navigation_bar";

    private NavigationBar mNavigationBar = new NavigationBar();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getIntentData();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putParcelable(EXTRAS_NAV_BAR, Parcels.wrap());
        super.onSaveInstanceState(outState);
    }


    /**
     * 统一获取Intent
     */
    protected void getIntentData() {
    }



}
