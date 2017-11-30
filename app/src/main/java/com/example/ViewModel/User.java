package com.example.ViewModel;

import android.databinding.Bindable;
import android.databinding.Observable;
import android.databinding.ObservableField;
import android.util.Log;


/**
 * user bean
 * Created by GreatWall on 2017/11/29.
 */

public class User {
    private static final String TAG = "User";
    private final ObservableField<String> firstName = new ObservableField<>();
    private final String lastName;
    public User(String firstName, String lastName) {
        this.firstName.set(firstName);
        this.lastName = lastName;

        this.firstName.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable observable, int i) {
                Log.i(TAG, "" + i);
            }
        });
    }

    public String getFirstName() {
        return this.firstName.get();
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setFirstName(String name) {
        this.firstName.set(name);
        //this.firstName.notifyChange();
        //this.firstName.notifyPropertyChanged(BR.user);
    }
}
