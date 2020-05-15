package com.aldi.aplikasiprojectutsaldi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;

public class volumekerucut extends AppCompatActivity implements View.OnClickListener{
    TextView txtHasil;
    EditText edtjari, edtTinggi;
    public Button btn_Hitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumekerucut);
        edtjari = (EditText) findViewById(R.id.edt_jari);
        edtTinggi = (EditText) findViewById(R.id.edt_tinggi);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);
        btn_Hitung = (Button)findViewById(R.id.btn_hitung_volume);
        btn_Hitung.setOnClickListener(this);
    }
    public void onClick(View v) {
        if (v.getId() == R.id.btn_hitung_volume) {
            String edt_jari = edtjari.getText().toString().trim();
            String edt_tinggi = edtTinggi.getText().toString().trim();
            boolean isEmptyFields = false;
            if (TextUtils.isEmpty(edt_jari)) {
                isEmptyFields = true;
                edtjari.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(edt_tinggi)) {
                isEmptyFields = true;
                edtTinggi.setError("Field ini tidak boleh kosong");
            }
            if (!isEmptyFields) {
                double jari = Double.parseDouble(edt_jari);
                double tinggi = Double.parseDouble(edt_tinggi);
                double volume = (Math.PI*jari*jari*tinggi)/3 ;
                txtHasil.setText(String.valueOf("Volume = " + volume));
            }
        }

    }
}
