package com.example.alarm;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import  android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnSet;
    EditText etTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSet=(Button)findViewById(R.id.btnSet);
        etTime=(EditText)findViewById(R.id.etAlarm);
        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Time=Integer.parseInt(etTime.getText().toString());
                Intent i=new Intent(MainActivity.this,Alarm.class);
                PendingIntent pi= PendingIntent.getBroadcast(getApplicationContext(),0,i,0);
                AlarmManager am=(AlarmManager)getSystemService(ALARM_SERVICE);
                am.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+Time*1000,pi);
            }
        });
    }
}
