package com.freshipper.app1.databinding.event;

import android.view.View;
import android.widget.Toast;

import com.freshipper.app1.MainActivity;

/**
 * Created by andy on 16/5/10.
 */
public class MainActivityHandler {

    private MainActivity activity;

    public MainActivityHandler(MainActivity activity) {
        this.activity = activity;
    }

    public void onClick(View view){
        Toast.makeText(activity, "on click", Toast.LENGTH_SHORT).show();

        this.activity.user.setFirstName("Steven");
        this.activity.user.setLastName("Chow");
    }
}
