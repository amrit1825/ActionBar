package com.example.amrthaku.room;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class MainActivity extends Activity {

    /*private User user;
    private AppDatabase database;*/
    Button add,getAll;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* database = AppDatabase.getDatabase(getApplicationContext());*/

        add = (Button) findViewById(R.id.button_add);
        getAll = (Button) findViewById(R.id.button_getAll);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(context, Add.class);
                startActivity(intent1);
            }
        });


        getAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(context, GetAll.class);
                startActivity(intent2);
            }
        });

        /*// cleanup for testing some initial data
        database.userDao().removeAllUsers();
        // add some data
        List<User> users = database.userDao().getAllUser();
        if (users.size()==0) {
            database.userDao().addUser(new User(1, "Test 1", 1));
            user = database.userDao().getAllUser().get(0);
            Toast.makeText(this, String.valueOf(user.id), Toast.LENGTH_SHORT).show();
            database.userDao().addUser(new User(2, "Test 2", 2));
            database.userDao().addUser(new User(3, "Test 3", 3));
        }*/
    }
}
