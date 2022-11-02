package com.example.broadcastreceiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        // an Intent broadcast.

        Log.i("MyBroadcastReceiver","The Battery is Low");
        Toast.makeText(context,"The Battery is Low",Toast.LENGTH_LONG).show();

        Toast.makeText(context,"The Battery is okay now",Toast.LENGTH_LONG).show();

    }
}
