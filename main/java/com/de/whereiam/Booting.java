package com.de.whereiam;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Raf on 30/03/2018.
 */
public class Booting extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
        Log.i("====>", "onReceive: " + intent.getAction());
        Log.d("Booting -->", "SS");
        Toast.makeText(context, "Run", Toast.LENGTH_SHORT).show();
    }
}
