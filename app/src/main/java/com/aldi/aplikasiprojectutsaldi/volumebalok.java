package com.aldi.aplikasiprojectutsaldi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class volumebalok extends AppCompatActivity implements View.OnClickListener{
    TextView txtHasil;
    EditText edtPanjang, edtLebar, edtTinggi;
    public Button btn_Hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumebalok);
        edtPanjang = (EditText) findViewById(R.id.edt_panjang);
        edtLebar = (EditText) findViewById(R.id.edt_lebar);
        edtTinggi = (EditText) findViewById(R.id.edt_tinggi);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);
        btn_Hitung = (Button)findViewById(R.id.btn_hitung_volume);
        btn_Hitung.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.btn_hitung_volume) {
            String edt_panjang = edtPanjang.getText().toString().trim();
            String edt_lebar = edtLebar.getText().toString().trim();
            String edt_tinggi = edtTinggi.getText().toString().trim();
            boolean isEmptyFields = false;
            if (TextUtils.isEmpty(edt_panjang)) {
                isEmptyFields = true;
                edtPanjang.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(edt_lebar)) {
                isEmptyFields = true;
                edtLebar.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(edt_tinggi)) {
                isEmptyFields = true;
                edtTinggi.setError("Field ini tidak boleh kosong");
            }
            if (!isEmptyFields) {
                int panjang = Integer.parseInt(edt_panjang);
                int lebar = Integer.parseInt(edt_lebar);
                int tinggi = Integer.parseInt(edt_tinggi);
                int volume = panjang * lebar * tinggi;
                txtHasil.setText(String.valueOf("Volume = " + volume));
            }
        }

    }
}
