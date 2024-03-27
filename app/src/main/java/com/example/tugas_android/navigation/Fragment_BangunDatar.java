package com.example.tugas_android.navigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugas_android.Adapter_Shape;
import com.example.tugas_android.Items_Shape;
import com.example.tugas_android.R;

import java.util.ArrayList;
import java.util.List;

public class Fragment_BangunDatar extends Fragment {

    private RecyclerView recyclerView;
    private Adapter_Shape adapter;
    private List<Items_Shape> items;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bangun_datar, container, false);

        recyclerView = view.findViewById(R.id.RvBangunDatar);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 1));

        // Initialize your data
        items = new ArrayList<>();
// Segitiga
        items.add(new Items_Shape("Segitiga", "https://i.pinimg.com/564x/e7/f7/2e/e7f72edd1ebd0a6c7220e5126df030f1.jpg",
                "Segitiga adalah bangun datar dua dimensi yang memiliki tiga sisi dan tiga sudut. Contoh: bendera.",
                2));

// Persegi
        items.add(new Items_Shape("Persegi", "https://i.pinimg.com/564x/2e/2d/93/2e2d93c41bfc9d0fa4ca80a1f69ea57c.jpg",
                "Persegi adalah bangun datar dua dimensi yang memiliki empat sisi dengan panjang yang sama dan keempat sudutnya siku-siku. Contoh: kertas gambar.",
                1));

// Belah Ketupat
        items.add(new Items_Shape("Belah Ketupat", "https://cdn.icon-icons.com/icons2/3415/PNG/512/rhombus_icon_218098.png",
                "Belah ketupat adalah bangun datar dua dimensi yang memiliki keempat sisi dan keempat sudut sama panjang. Contoh: hiasan kertas.",
                2));

// Persegi Panjang
        items.add(new Items_Shape("Persegi Panjang", "https://i.pinimg.com/564x/98/4a/76/984a7602f2200e18e6a8657722c09385.jpg",
                "Persegi panjang adalah bangun datar dua dimensi yang memiliki dua pasang sisi yang sejajar dan memiliki keempat sudut siku-siku. Contoh: papan tulis.",
                2));

// Lingkaran
        items.add(new Items_Shape("Lingkaran", "https://i.pinimg.com/564x/10/08/ce/1008cea8b5d4b146e76f4b4afd40e551.jpg",
                "Lingkaran adalah bangun datar dua dimensi yang terdiri dari semua titik yang memiliki jarak yang sama dari titik tertentu, yang disebut pusat. Contoh: koin.",
                1));

// Jajar Genjang
        items.add(new Items_Shape("Jajar Genjang", "https://i.pinimg.com/564x/8c/58/00/8c5800ce19c02f275502268b4ab757b4.jpg",
                "Jajar genjang adalah bangun datar dua dimensi yang memiliki dua pasang sisi yang sejajar dan panjang yang sama. Contoh: kertas lipat.",
                2));

        // Initialize your adapter
        adapter = new Adapter_Shape(getActivity(), items);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
