package com.ilhamrofiqi.skripsi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ilhamrofiqi.skripsi.Rule.Rule;
import com.ilhamrofiqi.skripsi.Variabel.JumlahRating;
import com.ilhamrofiqi.skripsi.Variabel.LamaBertahan;
import com.ilhamrofiqi.skripsi.Variabel.SkorBertahan;
import com.ilhamrofiqi.skripsi.Variabel.SkorKorban;

import java.text.DecimalFormat;

public class DiagnosaActivity extends AppCompatActivity {
    TextView tvNilai, tvKecanduan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa);

        tvNilai = findViewById(R.id.tv_nilai);
        tvKecanduan = findViewById(R.id.tv_kecanduan);


        SkorBertahan.setSkorBertahan(Double.parseDouble(getIntent().getStringExtra("SkorBertahan")));
        SkorKorban.setSkorKorban(Double.parseDouble(getIntent().getStringExtra("SkorKorban")));
        LamaBertahan.setLamaBertahan(Double.parseDouble(getIntent().getStringExtra("LamaBertahan")));
        JumlahRating.setJumlahRating(Double.parseDouble(getIntent().getStringExtra("JumlahRating")));

        DecimalFormat df = new DecimalFormat("#########.###");
        Rule.hitung_u();
        Rule.hitung_z();

        tvNilai.setText(df.format(Rule.bobot()));

        tvKecanduan.setText(df.format(Rule.bobot()));
        if (Rule.bobot() <= 35) {
            tvKecanduan.setText("Rendah");
        }
        if (Rule.bobot() >= 35 && Rule.bobot() <= 70) {
            tvKecanduan.setText("Sedang");
        }
        if (Rule.bobot() >= 70) {
            tvKecanduan.setText("Tinggi");
        }
    }
}
