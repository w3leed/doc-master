package com.example.waleed.vezeeta;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private Fragment fragment;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.home_frag:
                    fragment = new Home_Fragment();
                    loadFragment(fragment);
                    return true;
                case R.id.more_frag:
                    fragment = new More_Fragment();
                    loadFragment(fragment);
                    return true;
                case R.id.calender_frag:
                    fragment = new More_Fragment();
                    loadFragment(fragment);
                    return true;
                case R.id.favorit_frag:
                    fragment = new Home_Fragment();
                    loadFragment(fragment);
                    return true;




    }
            return false;
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        //Load the HomeFragment when app is loaded
        fragment = new Home_Fragment();
        loadFragment(fragment);

        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) navigation.getLayoutParams();
        layoutParams.setBehavior(new ScrollHandler());

    }

    private void loadFragment(Fragment fragment) {

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }


    @Override
    public void onBackPressed() {
        //Close the application when back button is pressed
        finish();
    }
}