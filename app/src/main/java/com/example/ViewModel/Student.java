package com.example.ViewModel;

import android.databinding.BaseObservable;

/**
 * student bean
 * Created by GreatWall on 2017/11/30.
 */

public class Student extends BaseObservable {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyChange();
    }
}
