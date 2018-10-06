package com.example.felixits.homework;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton btnmsg,btnw,btnm,btnb,btnc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnmsg = findViewById(R.id.btnmsg);
        btnw = findViewById(R.id.btnw);

    }

    public void sendMessage(View view) {
        /**
         * Intent intent = new Intent(Intent.ACTION_SEND);
         intent.setType("text/html");
         intent.putExtra(Intent.EXTRA_EMAIL, "emailaddress@emailaddress.com");
         intent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
         intent.putExtra(Intent.EXTRA_TEXT, "I'm email body.");

         startActivity(Intent.createChooser(intent, "Send Email"));*/
        Intent msgintent = new Intent(Intent.ACTION_SEND);
        msgintent.setType("text/html");
        msgintent.putExtra(Intent.EXTRA_EMAIL,"Subject");
        msgintent.putExtra(Intent.EXTRA_SUBJECT,"Hi akash");
        msgintent.putExtra(Intent.EXTRA_TEXT,"Hi Akash,this for demo");

        startActivity(Intent.createChooser(msgintent,"Send Email"));

    }

    public void openWhatapps(View view) {

        Intent openwh = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
        startActivity( openwh);
    }

    public void openBrowser(View view) {
        String google="www.google.com";
        Intent intent = getPackageManager().getLaunchIntentForPackage(google);
        if (intent==null){
            Toast.makeText(getApplicationContext(),"This apps not installed",Toast.LENGTH_SHORT).show();
        }
        startActivity(intent);
    }

    public void makeCall(View view) {
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }

    public void sendSmS(View view) {
        /**
         * String number = "12346556";  // The number on which you want to send SMS
         startActivity(new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", number, null)));


       /** Intent intent = new Intent(MainActivity.this,SMSActivity.class);
        startActivity(intent);*/

        int phone_number = 976376721;
        Intent intentt = new Intent(Intent.ACTION_VIEW);
        intentt.setData(Uri.parse("sms:"));
        intentt.setType("vnd.android-dir/mms-sms");
        intentt.putExtra(Intent.EXTRA_TEXT, "");
        intentt.putExtra("address",phone_number);
        startActivity(intentt);
    }
}
