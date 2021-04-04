package com.example.salmatugas2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView Namaku;
    TextView Passwordku;
    TextView Hasilku;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String Nama = getIntent().getExtras().getString("nama");
        String Pass = getIntent().getExtras().getString("password");
        String Hasil = getIntent().getExtras().getString("convert");

        Namaku = findViewById(R.id.Namaku);
        Passwordku = findViewById(R.id.Passwordku);
        Hasilku = findViewById(R.id.Nilaiku);

        Namaku.setText("Nama            : " + Nama);
        Passwordku.setText("Password    : " + Pass);
        Hasilku.setText("Nilai              : " + Hasil);
    }
}