package com.example.felixits.homework;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {
    EditText edtno;
    ImageButton btncall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edtno = findViewById(R.id.edtno);
        btncall = findViewById(R.id.btncall);

    }

    @SuppressLint("MissingPermission")
    public void makeCall(View view) {
        String name = edtno.getText().toString().trim();
        /**
         * Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "Your Phone_number"));
         startActivity(intent);*/

        Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" +name));
        startActivity(callintent);
        finish();
    }
}
