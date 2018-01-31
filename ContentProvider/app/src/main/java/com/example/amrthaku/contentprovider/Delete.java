package com.example.amrthaku.contentprovider;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by amrthaku on 1/31/2018.
 */

public class Delete extends AppCompatActivity {

    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delete_main);
    }

    public void onClickRecordDelete(View view){
        EditText e1 = (EditText) findViewById(R.id.editTextDelete);

        String id = e1.getText().toString();

        String URL = "content://com.example.amrthaku.contentprovider.MyContentProvider/students/"+id;

        Uri students = Uri.parse(URL);
        getContentResolver().delete(students,id,null);
        Toast.makeText(context,"Recorded Deleted Successfully",Toast.LENGTH_LONG).show();
    }
}
