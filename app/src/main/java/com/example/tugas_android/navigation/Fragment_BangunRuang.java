package com.example.tugas_android.navigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugas_android.Items_Shape;
import com.example.tugas_android.Adapter_Shape;
import com.example.tugas_android.R;

import java.util.ArrayList;
import java.util.List;

public class Fragment_BangunRuang extends Fragment {

    RecyclerView recyclerView;
    Adapter_Shape adapter;
    List<Items_Shape> items;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bangun_ruang, container, false);

        recyclerView = view.findViewById(R.id.RvBangunRuang);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 1));

        // Initialize your data
        items = new ArrayList<>();

        // Kubus
        items.add(new Items_Shape("Kubus", "https://i.pinimg.com/564x/ed/dc/b1/eddcb1e0307aa5b040335a5590e8cde5.jpg",
                "Kubus memiliki enam sisi yang sama besar dan sudut siku-siku. Contoh: dadu.",
                1));

// Balok
        items.add(new Items_Shape("Balok", "https://cdn1.katadata.co.id/media/images/temp/2021/11/03/Gambar_Balok-2021_11_03-12_04_16_9084e501300e5cfe36a3aae453f02009.jpg",
                "Balok memiliki enam sisi: empat sisi persegi panjang dan dua sisi persegi. Contoh: kotak tisu.",
                3));

// Tabung
        items.add(new Items_Shape("Tabung", "https://i.pinimg.com/564x/d6/49/46/d64946c4cd7768de71fc5c3631efca4a.jpg",
                "Tabung terdiri dari dua lingkaran identik sejajar yang dihubungkan oleh selubung lengkung. Contoh: botol minuman.",
                2));

// Bola
        items.add(new Items_Shape("Bola", "https://i.ibb.co/dMD5dcH/round.png",
                "Bola memiliki bentuk bulat sempurna. Contoh: bola sepak.",
                1));

// Kerucut
        items.add(new Items_Shape("Kerucut", "https://i.ibb.co/SV8rMv9/shape-geometry-geometric-d-cone-icon-149671.png",
                "Kerucut memiliki lingkaran pada alasnya dan sebuah titik puncak yang terhubung ke lingkaran alas dengan sebuah selubung lengkung. Contoh: topi es krim.",
                2));

// Limas Segiempat
        items.add(new Items_Shape("Limas Persegi", "https://i.pinimg.com/736x/6f/e1/3e/6fe13e1883f40e66b166ad1645d24507.jpg",
                "Limas segiempat memiliki alas berbentuk segiempat dan selubung berbentuk limas. Contoh: piramida.",
                3));


        // Initialize your adapter
        adapter = new Adapter_Shape(requireActivity(), items);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
