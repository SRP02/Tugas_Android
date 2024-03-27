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
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class Calculator3Param extends AppCompatActivity {

    TextView text, hasilText;
    Button buttonCalc;
    ImageView img;
    EditText editText1,editText2,editText3;
    int Angka1,Angka2,Angka3;
    float rumus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculator3_param);

        text = findViewById(R.id.Text_Calculator_Shape_3param);
        img = findViewById(R.id.IVShape3ParamCalc);
        editText1 = findViewById(R.id.EditTextCalc3Param_Angka1);
        editText2 = findViewById(R.id.EditTextCalc3Param_Angka2);
        editText3 = findViewById(R.id.EditTextCalc3Param_Angka3);
        buttonCalc = findViewById(R.id.buttonCalc3Param);
        hasilText = findViewById(R.id.textViewHasilCalc3Param); // Inisialisasi hasilText

        Intent intent= getIntent();
        String name = intent.getStringExtra("name");
        String imageUrl = intent.getStringExtra("image");

        text.setText(name);

        Glide.with(this).load(imageUrl).into(img);

        buttonCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1.getText().toString().isEmpty()) {
                    Toast.makeText(Calculator3Param.this, "Data tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else {
                    // Mengambil nilai Angka1 setelah tombol diklik
                    Angka1 = Integer.parseInt(editText1.getText().toString());
                    Angka2 = Integer.parseInt(editText2.getText().toString());
                    Angka3 = Integer.parseInt(editText3.getText().toString());

                    switch (name) {
                        case "Balok":
                            rumus = (float) Angka1*Angka2*Angka3;
                            editText1.setHint("Masukkan Panjang");
                            editText2.setHint("Masukkan Lebar");
                            editText3.setHint("Masukkan Tinggi");
                            break;
                        case "Limas Persegi":
                            rumus = (float) ((1/3)*(Angka1*Angka2)*Angka3);
                            editText1.setHint("Masukkan Panjang");
                            editText2.setHint("Masukkan Lebar");
                            editText3.setHint("Masukkan Tinggi");
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