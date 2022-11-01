package com.example.projectyogaangrh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HubungiActivity extends AppCompatActivity {

    Button button;
    EditText Ednama, Edemail, Ednpm, Edpesan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hubungi);

        Ednama = findViewById(R.id.editnama);
        Edemail = findViewById(R.id.editemail);
        Ednpm = findViewById(R.id.editNPM);
        Edpesan = findViewById(R.id.editpesan);

        button = findViewById(R.id.btnkirim);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pesan1 = Ednama.getText().toString();
                String pesan2 = Edemail.getText().toString();
                String pesan3 = Ednpm.getText().toString();
                String pesan4 = Edpesan.getText().toString();

                String semuapesan = "Nama : "+pesan1 +"\n" +
                        "E-Mail : " +pesan2 +"\n"
                        + "Kode Mata Kuliah : PMI "+pesan3 + "\n"
                        + "Pesan : " +pesan4;

                Intent kirimWA = new Intent(Intent.ACTION_SEND);
                kirimWA.setType("text/plain");
                kirimWA.putExtra(Intent.EXTRA_TEXT, semuapesan);
                kirimWA.setPackage("com.whatsapp");

                startActivity(kirimWA);
            }
        });
    }
}