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

public class RichardABeard extends AppCompatActivity {

    private Garage b = new Garage("Beard", 8);
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_richard_abeard);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Context context = getApplicationContext();
        CharSequence text = "Thank You, and have a Lovely Day!!";
        int duration = Toast.LENGTH_LONG;

        toast = Toast.makeText(context, text, duration);

        TextView tView = (TextView) findViewById(R.id.textView7);
        tView.setText(Integer.toString(b.pSpots[0]));

        TextView tView1 = (TextView) findViewById(R.id.textView8);
        tView1.setText(Integer.toString(b.pSpots[1]));

        TextView tView2 = (TextView) findViewById(R.id.textView9);
        tView2.setText(Integer.toString(b.pSpots[2]));

        TextView tView3 = (TextView) findViewById(R.id.textView10);
        tView3.setText(Integer.toString(b.pSpots[3]));

        TextView tView4 = (TextView) findViewById(R.id.textView12);
        tView4.setText(Integer.toString(b.pSpots[4]));

        TextView tView5 = (TextView) findViewById(R.id.textView13);
        tView5.setText(Integer.toString(b.pSpots[5]));

        TextView tView6 = (TextView) findViewById(R.id.textView14);
        tView6.setText(Integer.toString(b.pSpots[6]));

        TextView tView7 = (TextView) findViewById(R.id.textView15);
        tView7.setText(Integer.toString(b.pSpots[7]));

        TextView tView8 = (TextView) findViewById(R.id.textView35);
        tView8.setText(Integer.toString(b.getTotalSpots()));


        final ImageButton button = (ImageButton) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new AlertDialog.Builder(RichardABeard.this)
                        .setTitle("Confirm Reservation")
                        .setMessage("Are you sure you want to reserve this parking spot?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                b.takeSpot(1);
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
        final ImageButton button1 = (ImageButton) findViewById(R.id.button6);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new AlertDialog.Builder(RichardABeard.this)
                        .setTitle("Confirm Reservation")
                        .setMessage("Are you sure you want to reserve this parking spot?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                b.takeSpot(2);
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
        final ImageButton button2 = (ImageButton) findViewById(R.id.button14);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new AlertDialog.Builder(RichardABeard.this)
                        .setTitle("Confirm Reservation")
                        .setMessage("Are you sure you want to reserve this parking spot?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                b.takeSpot(3);
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
        final ImageButton button3 = (ImageButton) findViewById(R.id.button7);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new AlertDialog.Builder(RichardABeard.this)
                        .setTitle("Confirm Reservation")
                        .setMessage("Are you sure you want to reserve this parking spot?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                b.takeSpot(4);
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

        final ImageButton button4 = (ImageButton) findViewById(R.id.button8);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new AlertDialog.Builder(RichardABeard.this)
                        .setTitle("Confirm Reservation")
                        .setMessage("Are you sure you want to reserve this parking spot?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                b.takeSpot(5);
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
        final ImageButton button5 = (ImageButton) findViewById(R.id.button9);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new AlertDialog.Builder(RichardABeard.this)
                        .setTitle("Confirm Reservation")
                        .setMessage("Are you sure you want to reserve this parking spot?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                b.takeSpot(6);
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
        final ImageButton button6 = (ImageButton) findViewById(R.id.button10);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new AlertDialog.Builder(RichardABeard.this)
                        .setTitle("Confirm Reservation")
                        .setMessage("Are you sure you want to reserve this parking spot?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                b.takeSpot(7);
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
        final ImageButton button7 = (ImageButton) findViewById(R.id.button15);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new AlertDialog.Builder(RichardABeard.this)
                        .setTitle("Confirm Reservation")
                        .setMessage("Are you sure you want to reserve this parking spot?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                b.takeSpot(8);
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
