package com.aldi.aplikasiprojectutsaldi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class volumekubus extends AppCompatActivity implements View.OnClickListener{
    TextView txtHasil;
    EditText edtsisi;
    public Button btn_Hitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumekubus);
        edtsisi = (EditText) findViewById(R.id.edt_sisi);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);
        btn_Hitung = (Button)findViewById(R.id.btn_hitung_volume);
        btn_Hitung.setOnClickListener(this);
    }
    public void onClick(View v) {
        if (v.getId() == R.id.btn_hitung_volume) {
            String edt_sisi = edtsisi.getText().toString().trim();
            boolean isEmptyFields = false;
            if (TextUtils.isEmpty(edt_sisi)) {
                isEmptyFields = true;
                edtsisi.setError("Field ini tidak boleh kosong");
            }
            if (!isEmptyFields) {
                int sisi = Integer.parseInt(edt_sisi);
                int volume = sisi*sisi*sisi ;
                txtHasil.setText(String.valueOf("Volume = " + volume));
            }
        }

    }
}
