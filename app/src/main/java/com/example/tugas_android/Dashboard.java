package com.example.tugas_android;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.tugas_android.navigation.Fragment_BangunDatar;
import com.example.tugas_android.navigation.Fragment_Profile;
import com.example.tugas_android.navigation.Fragment_BangunRuang;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;

public class Dashboard extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setOnItemSelectedListener(navListener);

        // Load the default fragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new Fragment_BangunDatar())
                .commit();
    }

    private BottomNavigationView.OnItemSelectedListener navListener =
            new BottomNavigationView.OnItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    if (item.getItemId() == R.id.bangun_datar) {
                        selectedFragment = new Fragment_BangunDatar();
                    } else if (item.getItemId() == R.id.bangun_ruang) {
                        selectedFragment = new Fragment_BangunRuang();
                    } else if (item.getItemId() == R.id.Profile) {
                        selectedFragment = new Fragment_Profile();
                    }

                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container, selectedFragment)
                            .commit();

                    return true;
                }
            };
}
