package com.example.ViewModel;

import android.util.Log;
import android.view.View;

/**
 * https://developer.android.com/topic/libraries/data-binding/index.html
 * Event Handling - Method References
 * Created by GreatWall on 2017/11/30.
 */

public class MyHandler {
    private static final String TAG = "MyHandler";
    private User user;
    private Student student;

    public MyHandler(User user, Student student) {
        this.user = user;
        this.student = student;
    }

    public void clickedText(View v) {
        Log.i(TAG, "text clicked");
        user.setFirstName("test");
    }

    public void clickedStudent(View v) {
        student.setName("click student");
    }
}
