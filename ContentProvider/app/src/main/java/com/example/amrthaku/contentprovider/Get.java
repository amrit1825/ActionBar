package com.example.amrthaku.contentprovider;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by amrthaku on 1/31/2018.
 */

public class Get extends AppCompatActivity {

    ListView obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_main);
    }

    public void onClickRetrieveStudents(View view) {
        // Retrieve student records
        String URL = "content://com.example.amrthaku.contentprovider.MyContentProvider";

        Uri students = Uri.parse(URL);
        Cursor cursor = managedQuery(students, null, null, null, "_id");

        ArrayList <Student> studentArrayList = new ArrayList<>();
        Student stu;


        if (cursor.getCount() > 0) {
            for (int i = 0; i < cursor.getCount(); i++) {
                cursor.moveToNext();
                stu = new Student();
                stu.setName(cursor.getString(1));
                stu.setRoll(cursor.getString(2));
                studentArrayList.add(stu);
                ArrayAdapter<Student> adapter = new ArrayAdapter<>(this,
                        android.R.layout.simple_list_item_1, studentArrayList);
                obj = (ListView)findViewById(R.id.listView);
                obj.setAdapter(adapter);
            }
        }
        cursor.close();

        /*if (c.moveToFirst()) {
            do{


                Toast.makeText(this,
                        c.getString(c.getColumnIndex(MyContentProvider._ID)) +
                                ", " +  c.getString(c.getColumnIndex( MyContentProvider.NAME)) +
                                ", " + c.getString(c.getColumnIndex( MyContentProvider.Roll)),
                        Toast.LENGTH_SHORT).show();
            } while (c.moveToNext());
        }*/
    }
}
