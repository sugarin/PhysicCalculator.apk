package com.brigittachesyapricilla.kelompok2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class kecepatan extends AppCompatActivity {
    private Button btnhsl;
    private EditText jarak, waktu, hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kecepatan);

        btnhsl = (Button)findViewById(R.id.hitungBTN);
        jarak = (EditText)findViewById(R.id.jarakField);
        waktu = (EditText)findViewById(R.id.waktuField);
        hasil = (EditText)findViewById(R.id.hasilField);


        btnhsl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (jarak.getText().toString().equals("") || waktu.getText().toString().equals(""))
                {
                    Toast.makeText(kecepatan.this, "Mohon isi kolom terlebih dahulu!", Toast.LENGTH_SHORT).show();
                }
                else {
                    jarak.getText().toString();
                    waktu.getText().toString();
                    double s= Double.valueOf(jarak.getText().toString());
                    double t= Double.valueOf(waktu.getText().toString());
                    double kec;
                    kec=s/t;
                    hasil.setText(String.valueOf(kec));
                }
            }
        });
    }


}

