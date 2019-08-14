package com.autoChecssSynergy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class SelectActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        findViewById(R.id.img_soul_breaker).setOnClickListener(this);
        findViewById(R.id.img_sky_breaker).setOnClickListener(this);

    }

    /*
        종족 : a~z
        a : 인간
        b : 조류
        c : 악마
        d : 고블린
        e : 야수
        f : 동굴
        g : 해양
        h : 언데드
        i : 트롤
        j :  신
        k : 뭐였짜?
        l : 정령
        n : 뭐지이건?
        m : 용

        직업 : 1~10
        1 : 마법사
        2 : 흑마법사
        3 : 전사
        4 : 사냥꾼
        5 : 기사
        6 : 암살자
        7 : 주술사
        8 : 드루이드
        9 : 악마사냥꾼
        10 : 기계
        유닛 key : 100~200
        유니콘 -> {[종족 : 야수], [직업 : 드루이드],유닛 key : 103}
     */
    @Override
    public void onClick(View view) {
        Intent sendIntent = getIntent();
        Intent intent = new Intent();
        intent.putExtra("select",sendIntent.getIntExtra("select",1));
        switch (view.getId()){
            case R.id.img_soul_breaker:
                intent.putExtra("img",R.drawable.soul_breaker_goblin);
                try {
                    JSONObject jsonObject = new JSONObject();
                    JSONArray jsonArray = new JSONArray();
                    JSONArray classArray = new JSONArray();
                    jsonArray.put("d");
                    classArray.put(6);
                    jsonObject.put("key",100);
                    jsonObject.put("tribe",jsonArray);
                    jsonObject.put("class",classArray);
                    intent.putExtra("json",jsonObject.toString());
                }catch (JSONException e){
                    e.printStackTrace();
                }
                break;
            case R.id.img_sky_breaker:
                intent.putExtra("img",R.drawable.sky_breaker_goblin);
                break;
        }
        setResult(RESULT_OK,intent);
        finish();
    }
}
