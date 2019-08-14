package com.autoChecssSynergy;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.autoChecssSynergy.Listener.SelectClickListener;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SelectFragment extends Fragment implements View.OnClickListener{

    private SelectClickListener selectClickListener;
    private View v;
    private ArrayList<Object>combination ;
    public SelectFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_select, container, false);

        v.findViewById(R.id.select_1).setOnClickListener(this);
        v.findViewById(R.id.select_2).setOnClickListener(this);
        v.findViewById(R.id.select_3).setOnClickListener(this);
        v.findViewById(R.id.select_4).setOnClickListener(this);
        v.findViewById(R.id.select_5).setOnClickListener(this);
        v.findViewById(R.id.select_6).setOnClickListener(this);
        v.findViewById(R.id.select_7).setOnClickListener(this);
        v.findViewById(R.id.select_8).setOnClickListener(this);
        v.findViewById(R.id.select_9).setOnClickListener(this);
        v.findViewById(R.id.select_10).setOnClickListener(this);

        combination = new ArrayList<>();


        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        selectClickListener =(SelectClickListener) context;

    }

    public void onSelect(){

    }
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getContext(),SelectActivity.class);
        switch (view.getId()){
            case R.id.select_1:
                intent.putExtra("select",R.id.select_1);
                startActivityForResult(intent,0);
                break;
            case R.id.select_2:
                intent.putExtra("select",R.id.select_2);
                startActivityForResult(intent,1);
                break;
            case R.id.select_3:
                intent.putExtra("select",R.id.select_3);
                startActivityForResult(intent,2);
                break;
            case R.id.select_4:
                intent.putExtra("select",R.id.select_4);
                break;
            case R.id.select_5:
                intent.putExtra("select",R.id.select_5);
                break;
            case R.id.select_6:
                intent.putExtra("select",R.id.select_6);
                break;
            case R.id.select_7:
                intent.putExtra("select",R.id.select_7);
                break;
            case R.id.select_8:
                intent.putExtra("select",R.id.select_8);
                break;
            case R.id.select_9:
                intent.putExtra("select",R.id.select_9);
                break;
            case R.id.select_10:
                intent.putExtra("select",R.id.select_10);
                break;
        }

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode  == Activity.RESULT_OK){
            v.findViewById(data.getIntExtra("select",-1)).setBackgroundResource(data.getIntExtra("img",R.id.img_humen));

            Toast.makeText(getContext(), data.getStringExtra("json"), Toast.LENGTH_SHORT).show();
            Log.d("test",data.getStringExtra("json"));
        }

    }
}
