package com.example.amrthaku.contentprovider;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by amrthaku on 1/31/2018.
 */

public class Add extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_main);
    }

    public void onClickAddName(View view) {
        // Add a new student record
        ContentValues values = new ContentValues();
        values.put(MyContentProvider.NAME,
                ((EditText)findViewById(R.id.editTextName)).getText().toString());

        values.put(MyContentProvider.Roll,
                ((EditText)findViewById(R.id.editTextRoll)).getText().toString());

        Uri uri = getContentResolver().insert(
                MyContentProvider.CONTENT_URI, values);

        Toast.makeText(getBaseContext(),
                uri.toString(), Toast.LENGTH_LONG).show();
    }
}
