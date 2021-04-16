package com.example.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;

public class Alarm extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"AlARM>>>>>",Toast.LENGTH_SHORT).show();
        Vibrator v=(Vibrator)context.getSystemService(context.VIBRATOR_SERVICE);
        v.vibrate(10000);
    }
}
