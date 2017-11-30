package com.example.greatwall.databindingtest;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ViewModel.MyHandler;
import com.example.ViewModel.Student;
import com.example.ViewModel.User;
import com.example.greatwall.databindingtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("xiang", "wang");
        Student student = new Student("student");
        binding.setUser(user);
        binding.setStudent(student);
        binding.setHandlers(new MyHandler(user, student));
    }
}
