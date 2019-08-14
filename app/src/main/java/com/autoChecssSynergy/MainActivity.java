package com.autoChecssSynergy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.autoChecssSynergy.Listener.SelectClickListener;

public class MainActivity extends AppCompatActivity implements SelectClickListener {
    private SelectFragment selectFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onSelectClickListener(int i) {
        switch (i){
            case 1:
                findViewById(R.id.select_1).setBackgroundColor(Color.parseColor("#00D8FF"));
                break;
            case 2:

                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;



        }
    }
}
