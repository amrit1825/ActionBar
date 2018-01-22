package com.example.amrthaku.alertdialog;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends Activity {
    Context context;
    Button btn1,btn2,btn3;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        tv=(TextView) findViewById(R.id.textView1);
        btn3 = (Button) findViewById(R.id.button3);
        btn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                AlertDialog alertDialog = new AlertDialog.Builder(
                        MainActivity.this).create();
                alertDialog.setTitle("Alert Dialog"); //set title
                alertDialog.setMessage("Hello....! "); //set Message
                /*alertDialog.setIcon(R.drawable.ic_launcher); //set icon/image*/
                alertDialog.setButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                Toast.makeText(getApplicationContext(),"You clicked on OK", Toast.LENGTH_SHORT).show();
                                tv.setText("Ok Dialog box clicked");
                            }
                        });
                // Showing Alert Message
                alertDialog.show();

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("Confirm Box...");
                alertDialog.setMessage("Are you sure you want delete this?");
                /*alertDialog.setIcon(R.drawable.ic_launcher);*/

                alertDialog.setNegativeButton("NO",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,  int which) {
                                Toast.makeText(getApplicationContext(), "You clicked on NO", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                                tv.setText("No Button clicked");
                            }
                        });
                alertDialog.setPositiveButton("YES",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int which) {
                                // Write your code here to execute after dialog
                                Toast.makeText(getApplicationContext(), "You clicked on YES", Toast.LENGTH_SHORT).show();
                                tv.setText("Yes Button clicked");
                            }
                        });

                alertDialog.show();

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(
                        MainActivity.this);

                alertDialog.setTitle("Save File...");

                alertDialog.setMessage("Do you want to save this file?");

                /*alertDialog.setIcon(R.drawable.ic_launcher);*/

                alertDialog.setPositiveButton("YES",
                        new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog,
                                                int which) {
                                // User pressed Cancel button. Write Logic Here
                                Toast.makeText(getApplicationContext(),
                                        "You clicked on YES",
                                        Toast.LENGTH_SHORT).show();
                                tv.setText("Yes Button clicked");
                            }
                        });
                alertDialog.setNeutralButton("NO",
                        new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog,
                                                int which) {
                                Toast.makeText(getApplicationContext(),
                                        "You clicked on NO", Toast.LENGTH_SHORT)
                                        .show();

                                tv.setText("No Button clicked");
                            }
                        });
                alertDialog.setNegativeButton("Cancel",
                        new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog,
                                                int which) {
                                Toast.makeText(getApplicationContext(),
                                        "You clicked on Cancel",
                                        Toast.LENGTH_SHORT).show();
                                tv.setText("Cancel Button clicked");
                            }
                        });
                alertDialog.show();

            }
        });
    }
}
