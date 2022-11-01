package com.example.projectyogaangrh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class NilaiActivity extends AppCompatActivity {

    EditText edNama, edNPM, edTugas, edKehadiran, edUTS, edUAS, edAkhir, edHuruf;
    Button bthitung;
    Double vTugas, vKehadiran, vUTS, vUAS, vAkhir;
    String vnama, vNPM, vHuruf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nilai);

        edNama = (EditText) findViewById(R.id.edNama);
        edNPM = (EditText) findViewById(R.id.edNPM);
        edTugas = (EditText) findViewById(R.id.edTugas);
        edKehadiran = (EditText) findViewById(R.id.edKehadiran);
        edUTS = (EditText) findViewById(R.id.edUTS);
        edUAS = (EditText) findViewById(R.id.edUAS);
        edAkhir = (EditText) findViewById(R.id.edAkhir);
        edHuruf = (EditText) findViewById(R.id.edHuruf);
        bthitung = (Button) findViewById(R.id.bthitung);
    }
    public void hitung (View view){
        vTugas = Double.parseDouble(edTugas.getText().toString());
        vKehadiran = Double.parseDouble(edKehadiran.getText().toString());
        vUTS = Double.parseDouble(edUTS.getText().toString());
        vUAS = Double.parseDouble(edUAS.getText().toString());

        vAkhir = (0.15 * vKehadiran) + (0.25 * vTugas) + (0.25 * vUTS) + (0.35 * vUAS);

        if (vAkhir >= 80 && vAkhir <=100){
            vHuruf = "A";
        }
        else if (vAkhir >= 70 && vAkhir <=79){
            vHuruf = "B";
        }
        else if (vAkhir >= 50 && vAkhir <=69){
            vHuruf = "C";
        }
        else if (vAkhir >= 40 && vAkhir <=49){
            vHuruf = "D";
        }
        else {
            vHuruf = "E";
        }

        edAkhir.setText(""+vAkhir);
        edHuruf.setText(""+vHuruf);
    }
}