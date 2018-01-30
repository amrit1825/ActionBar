package com.example.amrthaku.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2;
    /*Button button1;*/
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public static final String MyPREFERENCES = "MyPrefs" ;
    /*public static final String Name = "nameKey";
    public static final String Email = "emailKey";*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        ed1 = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText2);
        /*button1 = (Button) findViewById(R.id.button);*/

        sharedPreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        if(sharedPreferences.contains("Name")){
            ed1.setText(sharedPreferences.getString("Name","null"));
        }

        if(sharedPreferences.contains("Email")){
            ed2.setText(sharedPreferences.getString("Email","null"));
        }


       /* button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = ed1.getText().toString();
                String email = ed2.getText().toString();



                editor.putString("Name",name);
                editor.putString("Email",email);
                editor.commit();
                Toast.makeText(MainActivity.this,"Thanks",Toast.LENGTH_LONG).show();
            }
        });
*/
    }

    public void buttonClick(View view){

        if(view.getId()==R.id.button){

            String name = ed1.getText().toString();
            String email = ed2.getText().toString();
            editor.putString("Name",name);
            editor.putString("Email",email);
            editor.commit();
            Toast.makeText(MainActivity.this,"Thanks, Preferences Added",Toast.LENGTH_LONG).show();
        }

        if(view.getId()==R.id.button2){
            editor.clear();
            editor.commit();
            Toast.makeText(getApplicationContext(),"Thanks, Preferences Removed",Toast.LENGTH_LONG).show();
        }
    }

}

