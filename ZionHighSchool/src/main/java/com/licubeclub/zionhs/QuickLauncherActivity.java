package com.licubeclub.zionhs;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class QuickLauncherActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_launcher);

        //Stop ShakeDetectService for a few seconds
        Intent intent = new Intent(this, ShakeDetectService.class);
        stopService(intent);
    }


    @Override
    public void onResume(){
        super.onResume();
        setContentView(R.layout.activity_quick_launcher);
        //Find a textView, "targetname"
        TextView targetname = (TextView)findViewById(R.id.targetname);

        // Load Preference Value
        SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        int target = pref.getInt("quickexec_select",0);

        if(target == 0){
            targetname.setText(getString(R.string.home));

            try {
                Thread.sleep(2000); // 1 seconds = 1000 milliseconds
            } catch (InterruptedException ignore) {}

            Intent MainActivity = new Intent(QuickLauncherActivity.this, MainActivity.class);
            startActivity(MainActivity);

            finish();
        }
        else if(target == 1){
            targetname.setText(getString(R.string.notices));

            try {
                Thread.sleep(2000); // 1 seconds = 1000 milliseconds
            } catch (InterruptedException ignore) {}

            Intent Notices = new Intent(QuickLauncherActivity.this, Notices.class);
            startActivity(Notices);

            finish();
        }
        else if(target == 2){
            targetname.setText(getString(R.string.meal));

            try {
                Thread.sleep(2000); // 1 seconds = 1000 milliseconds
            } catch (InterruptedException ignore) {}

            Intent Meal = new Intent(QuickLauncherActivity.this, Meal.class);
            startActivity(Meal);

            finish();
        }
        else if(target == 3){
            targetname.setText(getString(R.string.schoolinfo));

            try {
                Thread.sleep(2000); // 1 seconds = 1000 milliseconds
            } catch (InterruptedException ignore) {}

            Intent Schoolinfo = new Intent(QuickLauncherActivity.this, Schoolinfo.class);
            startActivity(Schoolinfo);

            finish();
        }
        else if(target == 4){
            targetname.setText(getString(R.string.schedule));

            try {
                Thread.sleep(2000); // 1 seconds = 1000 milliseconds
            } catch (InterruptedException ignore) {}

            Intent Schedule = new Intent(QuickLauncherActivity.this, Schedule.class);
            startActivity(Schedule);

            finish();
        }
        else{
            targetname.setText(getString(R.string.schoolintro));

            try {
                Thread.sleep(2000); // 1 seconds = 1000 milliseconds
            } catch (InterruptedException ignore) {}

            Intent Schoolintro = new Intent(QuickLauncherActivity.this, Schoolintro.class);
            startActivity(Schoolintro);

            finish();
        }
    }



    protected void onDestroy(){
        super.onDestroy();
        Intent shakedetectservice = new Intent(this, ShakeDetectService.class);
        startService(shakedetectservice);
    }


}