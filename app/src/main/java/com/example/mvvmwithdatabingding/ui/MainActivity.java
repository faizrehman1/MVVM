package com.example.mvvmwithdatabingding.ui;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.mvvmwithdatabingding.R;
import com.example.mvvmwithdatabingding.commands.UserLogin;
import com.example.mvvmwithdatabingding.databinding.ActivityMainBinding;
import com.example.mvvmwithdatabingding.model.User;
import com.example.mvvmwithdatabingding.viewmodel.UserModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    //    setContentView(R.layout.activity_main);


        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        UserModel userModel = new UserModel(new User("Email","Password"));
        activityMainBinding.setLogin(userModel);

        //this is not a good approach but for beginner this is of (FAIZ REHMAN)

        activityMainBinding.setUserLoginEvent(new UserLogin() {
            @Override
            public void onClickLogin() {
                Toast.makeText(MainActivity.this,""+activityMainBinding.getLogin().getUserEmail(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
