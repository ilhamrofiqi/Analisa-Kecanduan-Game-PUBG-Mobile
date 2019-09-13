package com.ilhamrofiqi.skripsi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edtSkorBertahan, edtSkorKorban, edtLamaBertahan, edtJumlahRating;
    Button btnAnalis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSkorBertahan = findViewById(R.id.edit_skor_bertahan);
        edtSkorKorban = findViewById(R.id.edit_skor_korban);
        edtLamaBertahan = findViewById(R.id.edit_lama_bertahan);
        edtJumlahRating = findViewById(R.id.edit_jumlah_rating);
        btnAnalis = findViewById(R.id.btn_analis);

        btnAnalis.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_analis) {
            boolean isEmptyFields = false;
            boolean isInvalidDouble = false;

            String inputSkorBertahan = edtSkorBertahan.getText().toString().trim();
            String inputSkorKorban = edtSkorKorban.getText().toString().trim();
            String inputLamaBertahan = edtLamaBertahan.getText().toString().trim();
            String inputJumlahRating = edtJumlahRating.getText().toString().trim();

            if (TextUtils.isEmpty(inputSkorBertahan)) {
                isEmptyFields = true;
                edtSkorBertahan.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(inputSkorKorban)) {
                isEmptyFields = true;
                edtSkorKorban.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(inputLamaBertahan)) {
                isEmptyFields = true;
                edtLamaBertahan.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(inputJumlahRating)) {
                isEmptyFields = true;
                edtJumlahRating.setError("Field ini tidak boleh kosong");
            }

            Double skorBertahan = toDouble(inputSkorBertahan);
            Double skorKorban = toDouble(inputSkorKorban);
            Double lamaBertahan = toDouble(inputLamaBertahan);
            Double jumlahRating = toDouble(inputJumlahRating);

            if (skorBertahan == null) {
                isInvalidDouble = true;
                edtSkorBertahan.setError("Field ini harus berupa nomor yang valid");
            }
            if (skorKorban == null) {
                isInvalidDouble = true;
                edtSkorKorban.setError("Field ini harus berupa nomor yang valid");
            }
            if (lamaBertahan == null) {
                isInvalidDouble = true;
                edtLamaBertahan.setError("Field ini harus berupa nomor yang valid");
            }
            if (jumlahRating == null) {
                isInvalidDouble = true;
                edtJumlahRating.setError("Field ini harus berupa nomor yang valid");
            }
            if (!isEmptyFields && !isInvalidDouble) {
                Intent intent = new Intent(getApplicationContext(), DiagnosaActivity.class);
                intent.putExtra("SkorBertahan", edtSkorBertahan.getText().toString().trim());
                intent.putExtra("SkorKorban", edtSkorKorban.getText().toString().trim());
                intent.putExtra("LamaBertahan", edtLamaBertahan.getText().toString().trim());
                intent.putExtra("JumlahRating", edtJumlahRating.getText().toString().trim());
                startActivity(intent);
            }
        }

    }

    Double toDouble(String str) {
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
