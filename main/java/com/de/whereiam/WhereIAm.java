package com.de.whereiam;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Raf on 29/03/2018.
 */
public class WhereIAm extends Service
{
    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {

        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
    }
}
