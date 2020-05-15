package com.aldi.aplikasiprojectutsaldi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class balok extends AppCompatActivity implements View.OnClickListener {
    private Button volumeku, selimutku, backku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        backku = (Button) findViewById(R.id.button3);
        backku.setOnClickListener(this);

        selimutku = (Button) findViewById(R.id.button2);
        selimutku.setOnClickListener(this);

        volumeku = (Button) findViewById(R.id.button1);
        volumeku.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button3:
                Intent moveIntent = new Intent(balok.this, MainActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.button2:
                Intent moveIntent2 = new Intent(balok.this, selimutbalok.class);
                startActivity(moveIntent2);
                break;
            case R.id.button1:
                Intent moveIntent3 = new Intent(balok.this, volumebalok.class);
                startActivity(moveIntent3);
                break;
        }
    }
}
