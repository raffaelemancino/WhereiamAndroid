package com.de.whereiam;

import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Raf on 31/03/2018.
 */
public class Activity extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Booting booting = new Booting();
        LocalBroadcastManager.getInstance(getApplicationContext()).registerReceiver(booting, new IntentFilter());

    }
}
