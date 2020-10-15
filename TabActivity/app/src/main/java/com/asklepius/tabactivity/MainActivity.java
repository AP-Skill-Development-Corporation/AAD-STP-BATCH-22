package com.asklepius.tabactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
TabLayout tb;
ViewPager page;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb=findViewById(R.id.tab_activity);
        page=findViewById(R.id.view_page);
        page.setAdapter(new PageAdapter(getSupportFragmentManager()));

    }
    public class PageAdapter extends FragmentStatePagerAdapter{

        public PageAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new Android();
                case 1:
                    return new Java();
                case 2:
                    return new Flutter();
                case 3:
                    return new Python();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 4;
        }
    }

}