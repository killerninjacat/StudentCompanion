package com.example.studentcompanion.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.studentcompanion.R;
import com.example.studentcompanion.adapters.TabPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.Calendar;

public class TimetableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager2 viewPager = findViewById(R.id.viewPager);
        TabPagerAdapter tabPagerAdapter = new TabPagerAdapter(this);
        viewPager.setAdapter(tabPagerAdapter);
        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> {
                    switch (position) {
                        case 1:
                            tab.setText("Mon");
                            break;
                        case 2:
                            tab.setText("Tue");
                            break;
                        case 3:
                            tab.setText("Wed");
                            break;
                        case 4:
                            tab.setText("Thu");
                            break;
                        case 5:
                            tab.setText("Fri");
                            break;
                        case 6:
                            tab.setText("Sat");
                            break;
                        case 0:
                            tab.setText("Sun");
                            break;
                    }
                }).attach();
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int initialTab = dayOfWeek - 1;
        viewPager.setCurrentItem(initialTab);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(TimetableActivity.this,MainActivity.class));
        overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
    }
}