package com.example.amrthaku.room;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by amrthaku on 1/29/2018.
 */

public class Add extends Activity {

    private AppDatabase database;

    EditText id,name;
    String id1,name1;
    boolean CheckEditTextEmpty;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_main);
        database = AppDatabase.getDatabase(getApplicationContext());

        id = (EditText) findViewById(R.id.editText_userId);
        name = (EditText) findViewById(R.id.editText_userName);

        id1 = id.getText().toString();
        name1 = name.getText().toString();

        boolean b1 = CheckEditTextIsEmptyOrNot(id1);
        boolean b2 = CheckEditTextIsEmptyOrNot(name1);

        if(b1 == true && b2 == true)
        {
            User user = new User(id1,name1);

            database.userDao().addUser(user);

            Toast.makeText(Add.this,"Data Submit Successfully", Toast.LENGTH_SHORT).show();
            Intent intent3 = new Intent(context, extra.class);
            startActivity(intent3);


        }

    }


    public boolean CheckEditTextIsEmptyOrNot(String Task){

        if(TextUtils.isEmpty(Task)){

            CheckEditTextEmpty = false ;

        }
        else {
            CheckEditTextEmpty = true ;
        }

        return CheckEditTextEmpty;
    }

}
