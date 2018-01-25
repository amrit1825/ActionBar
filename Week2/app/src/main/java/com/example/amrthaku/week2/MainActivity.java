package com.example.amrthaku.week2;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    private void addListenerOnButton() {

        Button toast,alert,linear,menu;

        toast = (Button) findViewById(R.id.button_toast);
        alert = (Button) findViewById(R.id.button_alert);
        linear = (Button) findViewById(R.id.button_new_activity);
        menu = (Button) findViewById(R.id.button_menu);

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"It's a Toast",Toast.LENGTH_LONG).show();
            }
        });

        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(
                        MainActivity.this).create();
                alertDialog.setTitle("Alert Dialog");
                alertDialog.setMessage("It's a Alert Dialog");
                alertDialog.setButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                Toast.makeText(getApplicationContext(),"You clicked on OK", Toast.LENGTH_SHORT).show();
                            }
                        });
                alertDialog.show();
            }
        });

        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,SecondActivity.class);
                startActivity(intent);

            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
}
