package com.brigittachesyapricilla.kelompok2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class gaya extends AppCompatActivity {

    private Button btnhsl;
    private EditText massa, kec, hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaya);
        btnhsl = (Button)findViewById(R.id.hitungBTN);
        massa = (EditText)findViewById(R.id.massaField);

        hasil = (EditText)findViewById(R.id.hasilField);
//        Intent intent = getIntent();
//        int number = intent.getStringExtra(Kecepatan.EXTRA_NUMBER, 0);
        kec = (EditText)findViewById(R.id.gayaField);
//        kec.setText(""+number);
        btnhsl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (massa.getText().toString().equals("") || kec.getText().toString().equals(""))
                {
                    Toast.makeText(gaya.this, "Mohon isi kolom terlebih dahulu!", Toast.LENGTH_SHORT).show();
                }
                else {
                    massa.getText().toString();
                    kec.getText().toString();
                    double m= Double.valueOf(massa.getText().toString());
                    double a= Double.valueOf(kec.getText().toString());
                    double gaya;
                    gaya=m*a;
                    hasil.setText(String.valueOf(gaya));
                }

            }
        });
    }
}
