package com.example.tugas_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Calculator1Param extends AppCompatActivity {

    TextView text, hasilText;
    Button buttonCalc;
    ImageView img;
    EditText editText1;
    int Angka1;
    float rumus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculator1_param);

        text = findViewById(R.id.Text_Calculator_Shape_1param);
        img = findViewById(R.id.IVShape1ParamCalc);
        editText1 = findViewById(R.id.EditTextCalc1Param);
        buttonCalc = findViewById(R.id.buttonCalc1Param);
        hasilText = findViewById(R.id.textViewHasilCalc1Param); // Inisialisasi hasilText

        Intent intent= getIntent();
        String name = intent.getStringExtra("name");
        String imageUrl = intent.getStringExtra("image");

        text.setText(name);

        Glide.with(this).load(imageUrl).into(img);

        buttonCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1.getText().toString().isEmpty()) {
                    Toast.makeText(Calculator1Param.this, "Data tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else {
                    // Mengambil nilai Angka1 setelah tombol diklik
                    Angka1 = Integer.parseInt(editText1.getText().toString());

                    switch (name) {
                        case "Persegi":
                            rumus = (float) Math.pow(Angka1, 2);
                            editText1.setHint("Masukkan Sisi");
                            break;
                        case "Lingkaran":
                            rumus = (float) (Math.PI * Math.pow(Angka1, 2));
                            editText1.setHint("Masukkan Jari-Jari");
                            break;
                        case "Kubus" :
                            rumus = (float) Math.pow(Angka1, 3);
                            editText1.setHint("Masukkan Sisi");
                            break;
                        case "Bola":
                            rumus = (float) ((4.0 / 3.0) * Math.PI * Math.pow(Angka1, 3));
                            editText1.setHint("Masukkan Jari-Jari");
                            break;
                        default:
                            hasilText.setText("Error");
                            break;
                    }

                    hasilText.setText(String.valueOf(rumus));
                }
            }
        });
    }
}
