package com.example.amrthaku.week2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by amrthaku on 1/24/2018.
 */

public class SecondActivity extends AppCompatActivity {

    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_main);
        addListenerOnButton();
    }

    private void addListenerOnButton() {
        Button home;

        home = (Button) findViewById(R.id.button_home);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,MainActivity.class);
                startActivity(intent);
            }
        });
     }
}
