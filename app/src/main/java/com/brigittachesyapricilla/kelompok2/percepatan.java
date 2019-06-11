package com.brigittachesyapricilla.kelompok2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class percepatan extends AppCompatActivity {

    private Button btnhsl;
    private EditText massa, gaya, hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percepatan);
        btnhsl = (Button)findViewById(R.id.hitungBTN);
        massa = (EditText)findViewById(R.id.massaField);

        hasil = (EditText)findViewById(R.id.hasilField);
//        Intent intent = getIntent();
//        int number = intent.getStringExtra(Kecepatan.EXTRA_NUMBER, 0);
        gaya = (EditText)findViewById(R.id.gayaField);
//        kec.setText(""+number);
        btnhsl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (massa.getText().toString().equals("") || gaya.getText().toString().equals(""))
                {
                    Toast.makeText(percepatan.this, "Mohon isi kolom terlebih dahulu!", Toast.LENGTH_SHORT).show();
                }
                else {
                    massa.getText().toString();
                    gaya.getText().toString();
                    double m= Double.valueOf(massa.getText().toString());
                    double f= Double.valueOf(gaya.getText().toString());
                    double kecepatan;
                    kecepatan=f/m;
                    hasil.setText(String.valueOf(kecepatan));
                }

            }
        });
    }
}