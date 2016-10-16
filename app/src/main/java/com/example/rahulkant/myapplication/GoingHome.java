package com.example.rahulkant.myapplication;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.common.api.GoogleApiClient;

import static com.example.rahulkant.myapplication.R.id.button22;
import static com.example.rahulkant.myapplication.R.id.editText17;
import static com.example.rahulkant.myapplication.R.id.editText18;

public class GoingHome extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    Toast toast;

    private Garage b = new Garage("Beard", 8);
    private Garage c = new Garage("Collins", 8);
    private Garage m = new Garage("Marshall", 8);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_going_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Context context = getApplicationContext();
        CharSequence text = "Thank You, and have a Lovely Day!!";
        int duration = Toast.LENGTH_LONG;

        toast = Toast.makeText(context, text, duration);

        Button button = (Button) findViewById(button22);
        final EditText garage = (EditText) findViewById(editText17);
        final EditText level = (EditText) findViewById(editText18);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (Integer.parseInt(garage.getText().toString())) {
                    case 1:
                        c.leaveSpot(Integer.parseInt(level.getText().toString()));
                        break;


                    case 2:
                        b.leaveSpot(Integer.parseInt(level.getText().toString()));
                        break;


                    case 3:
                        m.leaveSpot(Integer.parseInt(level.getText().toString()));


                }

                new AlertDialog.Builder(GoingHome.this)
                        .setTitle("Confirm Reservation")
                        .setMessage("Are you sure you want to leave this parking spot?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                toast.show();
                                Intent intent = new Intent(Intent.ACTION_MAIN);
                                intent.addCategory(Intent.CATEGORY_HOME);
                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(intent);


                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // do nothing
                            }
                        })
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();

            }
        });
        }
    }
