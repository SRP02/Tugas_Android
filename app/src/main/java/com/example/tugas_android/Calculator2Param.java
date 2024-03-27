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

public class Calculator2Param extends AppCompatActivity {


    TextView text, hasilText;
    Button buttonCalc;
    ImageView img;
    EditText editText1,editText2;
    int Angka1,Angka2;
    float rumus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculator2_param);

        text = findViewById(R.id.Text_Calculator_Shape_2param);
        img = findViewById(R.id.IVShape2ParamCalc);
        editText1 = findViewById(R.id.EditTextCalc2Param_Angka1);
        editText2 = findViewById(R.id.EditTextCalc2Param_Angka2);
        buttonCalc = findViewById(R.id.buttonCalc2Param);
        hasilText = findViewById(R.id.textViewHasilCalc2Param); // Inisialisasi hasilText

        Intent intent= getIntent();
        String name = intent.getStringExtra("name");
        String imageUrl = intent.getStringExtra("image");

        text.setText(name);

        Glide.with(this).load(imageUrl).into(img);

        buttonCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1.getText().toString().isEmpty()) {
                    Toast.makeText(Calculator2Param.this, "Data tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else {
                    // Mengambil nilai Angka1 setelah tombol diklik
                    Angka1 = Integer.parseInt(editText1.getText().toString());
                    Angka2 = Integer.parseInt(editText2.getText().toString());

                    switch (name) {
                        case "Segitiga":
                            rumus = (float) 0.5*Angka1*Angka2;
                            editText1.setHint("Masukkan tinggi");
                            editText2.setHint("Masukkan alas");
                            break;
                            case "Belah Ketupat":
                            rumus = (float) 0.5*Angka1*Angka2;
                            editText1.setHint("Masukkan diagonal 1");
                            editText2.setHint("Masukkan diagonal 2");
                            break;
                            case "Persegi Panjang":
                            rumus = (float) Angka1*Angka2;
                            editText1.setHint("Masukkan tinggi");
                            editText2.setHint("Masukkan lebar");
                            break;
                        case "Jajar genjang":
                            rumus = (float) Angka1*Angka2;
                            editText1.setHint("Masukkan tinggi");
                            editText2.setHint("Masukkan alas");
                            break;
                        case "Tabung":
                            rumus = (float) (Math.PI*Math.pow(Angka1,2)*Angka2);
                            editText1.setHint("Masukkan Jari-Jari");
                            editText2.setHint("Masukkan Tinggi");
                            break;
                        case "Krucut":
                            rumus = (float) ((1/3)*Math.PI*Math.pow(Angka1,2)*Angka2);
                            editText1.setHint("Masukkan Jari-Jari");
                            editText2.setHint("Masukkan Tinggi");
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