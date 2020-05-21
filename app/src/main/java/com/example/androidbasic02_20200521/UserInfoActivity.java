package com.example.androidbasic02_20200521;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.androidbasic02_20200521.databinding.ActivityUserInfoBinding;

public class UserInfoActivity extends BaseActivity {

    ActivityUserInfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_user_info);
        setUpEvents();
        setValues();
    }

    @Override
    public void setUpEvents() {

    }

    @Override
    public void setValues() {

        String name = getIntent().getStringExtra("userName");

        binding.userNameTxt.setText(name);

    }
}
