package com.example.tugas_android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter_Shape extends RecyclerView.Adapter<ViewHolder_Shape> {
    private Context context;
    private List<Items_Shape> items;

    public Adapter_Shape(Context context, List<Items_Shape> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder_Shape onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false);
        return new ViewHolder_Shape(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder_Shape holder, int position) {
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
