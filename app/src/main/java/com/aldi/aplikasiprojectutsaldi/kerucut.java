package com.aldi.aplikasiprojectutsaldi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kerucut extends AppCompatActivity implements View.OnClickListener {
    private Button volumeku, selimutku, backku;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerucut);

        backku = (Button) findViewById(R.id.button3);
        backku.setOnClickListener(this);

        selimutku = (Button) findViewById(R.id.button2);
        selimutku.setOnClickListener(this);

        volumeku = (Button) findViewById(R.id.button1);
        volumeku.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button3:
                Intent moveIntent = new Intent(kerucut.this, MainActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.button2:
                Intent moveIntent2 = new Intent(kerucut.this, selimutkerucut.class);
                startActivity(moveIntent2);
                break;
            case R.id.button1:
                Intent moveIntent3 = new Intent(kerucut.this, volumekerucut.class);
                startActivity(moveIntent3);
                break;
        }
    }
}
