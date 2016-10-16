package com.example.rahulkant.myapplication;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MarshallStudentCenter extends AppCompatActivity {


    private Garage m = new Garage("Marshall", 6);
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marshall_student_center);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Context context = getApplicationContext();
        CharSequence text = "Thank You, and have a Lovely Day!!";
        int duration = Toast.LENGTH_LONG;

        toast = Toast.makeText(context, text, duration);

        TextView tView = (TextView) findViewById(R.id.textView20);
        tView.setText(Integer.toString(m.pSpots[0]));

        TextView tView1 = (TextView) findViewById(R.id.textView23);
        tView1.setText(Integer.toString(m.pSpots[1]));

        TextView tView2 = (TextView) findViewById(R.id.textView24);
        tView2.setText(Integer.toString(m.pSpots[2]));

        TextView tView3 = (TextView) findViewById(R.id.textView25);
        tView3.setText(Integer.toString(m.pSpots[3]));

        TextView tView4 = (TextView) findViewById(R.id.textView27);
        tView4.setText(Integer.toString(m.pSpots[4]));

        TextView tView5 = (TextView) findViewById(R.id.textView28);
        tView5.setText(Integer.toString(m.pSpots[5]));

        TextView tView6 = (TextView) findViewById(R.id.textView33);
        tView6.setText(Integer.toString(m.getTotalSpots()));



        final ImageButton button = (ImageButton) findViewById(R.id.button16);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new AlertDialog.Builder(MarshallStudentCenter.this)
                        .setTitle("Confirm Reservation")
                        .setMessage("Are you sure you want to reserve this parking spot?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                m.takeSpot(1);
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
        final ImageButton button1 = (ImageButton) findViewById(R.id.button17);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new AlertDialog.Builder(MarshallStudentCenter.this)
                        .setTitle("Confirm Reservation")
                        .setMessage("Are you sure you want to reserve this parking spot?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                m.takeSpot(2);
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
        final ImageButton button2 = (ImageButton) findViewById(R.id.button18);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new AlertDialog.Builder(MarshallStudentCenter.this)
                        .setTitle("Confirm Reservation")
                        .setMessage("Are you sure you want to reserve this parking spot?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                m.takeSpot(3);
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
        final ImageButton button3 = (ImageButton) findViewById(R.id.button19);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new AlertDialog.Builder(MarshallStudentCenter.this)
                        .setTitle("Confirm Reservation")
                        .setMessage("Are you sure you want to reserve this parking spot?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                m.takeSpot(4);
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
        final ImageButton button4 = (ImageButton) findViewById(R.id.button20);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new AlertDialog.Builder(MarshallStudentCenter.this)
                        .setTitle("Confirm Reservation")
                        .setMessage("Are you sure you want to reserve this parking spot?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                m.takeSpot(5);
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
        final ImageButton button5 = (ImageButton) findViewById(R.id.button21);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new AlertDialog.Builder(MarshallStudentCenter.this)
                        .setTitle("Confirm Reservation")
                        .setMessage("Are you sure you want to reserve this parking spot?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                m.takeSpot(6);
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


        ;

    }

}
