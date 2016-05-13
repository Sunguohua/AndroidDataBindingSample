package com.freshipper.app1;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.freshipper.app1.databinding.ActivityMainBinding;
import com.freshipper.app1.databinding.data.User;
import com.freshipper.app1.databinding.event.MainActivityHandler;

public class MainActivity extends AppCompatActivity {
    public User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(
                this, R.layout.activity_main);

        //setXXX only works while variable defined in layout <data></data> block
        MainActivityHandler handler = new MainActivityHandler(this);
        user = new User("andy", "sun");
        binding.setUser(user);
        binding.setHandler(handler);

    }
}
