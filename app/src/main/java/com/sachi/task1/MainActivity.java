package com.sachi.task1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Binder;
import android.os.Bundle;

import com.sachi.task1.databinding.ActivityMainBinding;
import com.sachi.task1.fragements.BMIFragment;
import com.sachi.task1.fragements.HistoryFragement;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        callFragemt(new BMIFragment());

        binding.bottomNavView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.NavBmi:
                    callFragemt(new BMIFragment());
                    break;
                case R.id.NavHistory:
                    callFragemt(new HistoryFragement());
                    break;
            }

            return true;
        });
    }

    private void callFragemt(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment,fragment);
        fragmentTransaction.commit();

    }
}