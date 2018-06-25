package com.yxj.dialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.SimpleAdapter;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn1).setOnClickListener(this);
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                String[] array = {"北京","上海","广州","深圳","杭州","上饶"};
                new ShareDialog.Builder(this)
                        .setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,array))
                        .show();
                break;
            case R.id.btn2:
                new ConfirmDialog.Builder(this)
                        .setTitle("世界杯")
                        .setBtnLeft("英格兰",(dialog)->{
                            Log.e("yxj","btnLeft");
                            dialog.dismiss();
                        })
                        .setBtnRight("德国",(dialog)->{
                            Log.e("yxj","btnRight");
                        })
                        .setAnim(AnimType.Fadein)
                        .setDuration(1000)
                        .setGravity(Gravity.CENTER)
                        .show();

                break;
        }
    }
}
