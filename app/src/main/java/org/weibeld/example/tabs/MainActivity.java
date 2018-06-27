package org.weibeld.example.tabs;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;

import org.weibeld.example.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {


    private final String LOG_TAG = MainActivity.class.getSimpleName();

    // The fragments that are used as the individual pages
    private final List<FragmentModel> fragmentsMap = new ArrayList<>();


    // The ViewPager is responsible for sliding pages (fragments) in and out upon user input
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the Toolbar as the activity's app bar (instead of the default ActionBar)
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fragmentsMap.add(new FragmentModel(Page1Fragment.class.getName(), new Page1Fragment()));
        fragmentsMap.add(new FragmentModel(Page2Fragment.class.getName(), new Page2Fragment()));
        fragmentsMap.add(new FragmentModel(Page3Fragment.class.getName(), new Page3Fragment()));
        // Connect the ViewPager to our custom PagerAdapter. The PagerAdapter supplies the pages
        // (fragments) to the ViewPager, which the ViewPager needs to display.
        mViewPager = findViewById(R.id.viewpager);
        mViewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
    }

    public void setCurrentItem(String fragmentName, boolean smoothScroll) {
        int id = getPositionFragmentByName(fragmentName);
        mViewPager.setCurrentItem(id, smoothScroll);
    }

    private int getPositionFragmentByName(String name){
        for(FragmentModel item : fragmentsMap){
            if(item.getName().equals(name)){
                return fragmentsMap.indexOf(item);
            }
        }

        return 0;
    }


    /* PagerAdapter for supplying the ViewPager with the pages (fragments) to display. */
    public class MyPagerAdapter extends FragmentPagerAdapter {


        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentsMap.get(position).getFragment();
        }

        @Override
        public int getCount() {
            return fragmentsMap.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return "";
        }



    }
}
