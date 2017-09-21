package com.example.bowl.bowldev;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(navigation);

        navigation.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selectedFragment = null;
                        switch (item.getItemId()) {
                            case R.id.navigation_home:
                                selectedFragment = FragmentHome.newInstance();
                                Log.d(TAG, "Selected Home Navigation");
                                break;
                            case R.id.navigation_3d:
                                selectedFragment = Fragment3D.newInstance();
                                Log.d(TAG, "Selected 3D Navigation");
                                break;
                            case R.id.navigation_coach:
                                selectedFragment = FragmentCoach.newInstance();
                                Log.d(TAG, "Selected Coach Navigation");
                                break;
                            case R.id.navigation_share:
                                selectedFragment = FragmentShare.newInstance();
                                Log.d(TAG, "Selected Share Navigation");
                                break;
                            case R.id.navigation_profile:
                                selectedFragment = FragmentProfile.newInstance();
                                Log.d(TAG, "Selected Home Navigation");
                                break;
                        }
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_layout, selectedFragment);
                        transaction.commit();
                        return true;
                    }
                });

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, FragmentHome.newInstance());
        transaction.commit();
    }

}
