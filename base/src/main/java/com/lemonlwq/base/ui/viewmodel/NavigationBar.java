package com.lemonlwq.base.ui.viewmodel;


import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.support.annotation.DrawableRes;

import com.lemonlwq.base.BR;
import com.lemonlwq.base.R;

/**
 * Created by MLinWQ on 2018/11/24
 */
public class NavigationBar extends BaseObservable {

    @Bindable
    public boolean showHeader = true;

    @Bindable
    public boolean showLeft = true;

    @Bindable
    public boolean showCenterIcon = false;

    @Bindable
    public boolean showRight = false;

    @Bindable
    public String title = "";

    @Bindable
    public int background = R.color.colorPrimary;

    @DrawableRes
    @Bindable
    public int leftIcon = R.drawable.ic_nav_arrow_left;

    @DrawableRes
    @Bindable
    public int centerIcon = R.drawable.ic_nav_arrow_left;

    @DrawableRes
    @Bindable
    public int rightIcon;

    @Bindable
    public String rightText;

    public void showHeader(boolean showHeader) {
        this.showHeader = showHeader;
        notifyPropertyChanged(BR.showHeader);
    }

    public void showLeft(boolean showLeft) {
        this.showLeft = showLeft;
        notifyPropertyChanged(BR.showLeft);
    }

    public void showCenterIcon(boolean showCenterIcon) {
        this.showCenterIcon = showCenterIcon;
        notifyPropertyChanged(BR.showCenterIcon);
    }

    public void showRight(boolean showRight) {
        this.showRight = showRight;
        notifyPropertyChanged(BR.showRight);
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
    }

    public void setCenterIcon(@DrawableRes int res) {
        this.centerIcon = res;
        notifyPropertyChanged(BR.centerIcon);
    }

    public void setLeftIcon(@DrawableRes int res) {
        this.leftIcon = res;
        notifyPropertyChanged(BR.leftIcon);
    }

    public void setRightIcon(@DrawableRes int res) {
        this.rightIcon = res;
        notifyPropertyChanged(BR.rightIcon);
    }

    public void setRightText(String text) {
        this.rightText = text;
        notifyPropertyChanged(BR.rightText);
    }

    public void setBackground(int res) {
        this.background = res;
        notifyPropertyChanged(BR.background);
    }
}
