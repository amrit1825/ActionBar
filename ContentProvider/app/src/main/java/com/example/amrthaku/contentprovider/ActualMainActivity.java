package com.example.amrthaku.contentprovider;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by amrthaku on 1/31/2018.
 */

public class ActualMainActivity extends AppCompatActivity {
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actual_main);
    }

    public void onClickProceedAdd(View view){
        Intent intent1 = new Intent(context,Add.class);
        startActivity(intent1);
    }

    public void onClickProceedGet(View view){
        Intent intent1 = new Intent(context,Get.class);
        startActivity(intent1);
    }

    public void onClickProceedDelete(View view){
        Intent intent1 = new Intent(context,Delete.class);
        startActivity(intent1);
    }
}
