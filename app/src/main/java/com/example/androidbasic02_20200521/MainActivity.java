package com.example.androidbasic02_20200521;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.androidbasic02_20200521.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setUpEvents();
        setValues();
    }

    @Override
    public void setUpEvents() {

        binding.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputName = binding.nameEdt.getText().toString();

                Intent intent = new Intent(MainActivity.this, UserInfoActivity.class);
                startActivity(intent);

            }
        });

    }

    public void setValues() {

    }
}
