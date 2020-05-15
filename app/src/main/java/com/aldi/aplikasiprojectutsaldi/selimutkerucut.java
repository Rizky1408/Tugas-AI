package com.aldi.aplikasiprojectutsaldi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class selimutkerucut extends AppCompatActivity implements View.OnClickListener {
    TextView txtHasil;
    EditText edtjari, edtpanjang;
    public Button btn_Hitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selimutkerucut);

        edtjari = (EditText) findViewById(R.id.edt_jari);
        edtpanjang = (EditText) findViewById(R.id.edt_panjang);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);
        btn_Hitung = (Button)findViewById(R.id.btn_hitung_selimut);
        btn_Hitung.setOnClickListener(this);
    }
    public void onClick(View v) {
        if (v.getId() == R.id.btn_hitung_selimut) {
            String edt_jari = edtjari.getText().toString().trim();
            String edt_panjang = edtpanjang.getText().toString().trim();
            boolean isEmptyFields = false;
            if (TextUtils.isEmpty(edt_jari)) {
                isEmptyFields = true;
                edtjari.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(edt_panjang)) {
                isEmptyFields = true;
                edtpanjang.setError("Field ini tidak boleh kosong");
            }
            if (!isEmptyFields) {
                double jari = Double.parseDouble(edt_jari);
                double panjang = Double.parseDouble(edt_panjang);
                double selimut = (Math.PI*jari)*(panjang+jari) ;
                txtHasil.setText(String.valueOf("Volume = " + selimut));
            }
        }

    }
}
