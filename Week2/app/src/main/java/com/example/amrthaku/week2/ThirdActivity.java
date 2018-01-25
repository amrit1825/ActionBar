package com.example.amrthaku.week2;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by amrthaku on 1/24/2018.
 */

public class ThirdActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { switch(item.getItemId()) {
        case R.id.contact:
            //add the function to perform here
            textView = (TextView) findViewById(R.id.textView_menu_page);
            textView.setText("Contact information");
            return(true);
        case R.id.help:
            textView = (TextView) findViewById(R.id.textView_menu_page);
            textView.setText("Happy to help");
            return(true);
        case R.id.about:
            textView = (TextView) findViewById(R.id.textView_menu_page);
            textView.setText("About us");
            return(true);
    }
        return(super.onOptionsItemSelected(item));
    }

}
