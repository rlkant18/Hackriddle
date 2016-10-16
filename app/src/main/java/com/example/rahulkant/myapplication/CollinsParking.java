package com.example.rahulkant.myapplication;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class CollinsParking extends AppCompatActivity {
    private Garage c = new Garage("Collins", 5);
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collins_parking);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Context context = getApplicationContext();
        CharSequence text = "Thank You, and have a Lovely Day!!";
        int duration = Toast.LENGTH_LONG;

        toast = Toast.makeText(context, text, duration);

        TextView tView = (TextView) findViewById(R.id.textView11);
        tView.setText(Integer.toString(c.pSpots[0]));

        TextView tView1 = (TextView) findViewById(R.id.textView16);
        tView1.setText(Integer.toString(c.pSpots[1]));

        TextView tView2 = (TextView) findViewById(R.id.textView19);
        tView2.setText(Integer.toString(c.pSpots[2]));

        TextView tView3 = (TextView) findViewById(R.id.textView21);
        tView3.setText(Integer.toString(c.pSpots[3]));

        TextView tView4 = (TextView) findViewById(R.id.textView22);
        tView4.setText(Integer.toString(c.pSpots[4]));

        TextView tView5 = (TextView) findViewById(R.id.textView31);
        tView5.setText(Integer.toString(c.getTotalSpots()));

        int[] buttons = {
                R.id.button23,
                R.id.button24,
                R.id.button25,
                R.id.button27,
                R.id.button26
        };

        for (final int id : buttons) {
            ImageButton btn = (ImageButton) findViewById(id);
            btn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    new AlertDialog.Builder(CollinsParking.this)
                            .setTitle("Confirm Reservation")
                            .setMessage("Are you sure you want to reserve this parking spot?")
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    switch(id){
                                        case R.id.button23:c.takeSpot(1);
                                            break;
                                        case R.id.button24:c.takeSpot(2);
                                            break;
                                        case R.id.button25:c.takeSpot(3);
                                            break;
                                        case R.id.button27:c.takeSpot(4);
                                            break;
                                        case R.id.button26:c.takeSpot(5);
                                            break;
                                    }
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

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("CollinsParking Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
