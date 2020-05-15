package com.aldi.aplikasiprojectutsaldi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton kubusku, kerucutku, balokku;
    private  Button exitku;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kubusku = (ImageButton) findViewById(R.id.kubus);
        kubusku.setOnClickListener(this);

        kerucutku = (ImageButton) findViewById(R.id.kerucut);
        kerucutku.setOnClickListener(this);

        balokku = (ImageButton) findViewById(R.id.balok);
        balokku.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.kubus:
                Intent moveIntent = new Intent(MainActivity.this, kubus.class);
                startActivity(moveIntent);
                break;
            case R.id.kerucut:
                Intent moveIntent2 = new Intent(MainActivity.this, kerucut.class);
                startActivity(moveIntent2);
                break;
            case R.id.balok:
                Intent moveIntent3 = new Intent(MainActivity.this, balok.class);
                startActivity(moveIntent3);
                break;
        }

        }
        public void onBackPressed(){
            new AlertDialog.Builder(this)
                    .setMessage("Apa Mr.Aldi ingin Exit?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            moveTaskToBack(true);
                        }
                    })
                    .setNegativeButton("No", null)
                    .show();
        }
    }
