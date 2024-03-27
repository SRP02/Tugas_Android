package com.example.tugas_android;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tugas_android.Calculator1Param;
import com.example.tugas_android.Items_Shape;
import com.example.tugas_android.R;

public class ViewHolder_Shape extends RecyclerView.ViewHolder implements View.OnClickListener {
    private ImageView imageView;
    private TextView nameView;
    private TextView Description;
    private Context context;
    private Items_Shape currentItem;
    private int Param;

    public ViewHolder_Shape(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.IVShape);
        nameView = itemView.findViewById(R.id.Text_Shape);
        Description = itemView.findViewById(R.id.Text_Description);
        context = itemView.getContext();
        itemView.setOnClickListener(this);
    }

    public void bind(Items_Shape item) {
        currentItem = item;
        nameView.setText(item.getName());
        Description.setText(item.getDescription());
        Glide.with(itemView.getContext())
                .load(item.getImage())
                .placeholder(R.drawable.baseline_account_circle_24)
                .error(R.drawable.baseline_question_mark_24)
                .into(imageView);
        Param = item.getParam();
    }

    @Override
    public void onClick(View view) {
        switch (Param){
            case 1:
                Intent intent1 = new Intent(context, Calculator1Param.class);

                intent1.putExtra("name", currentItem.getName());
                intent1.putExtra("image", currentItem.getImage());

                context.startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(context, Calculator2Param.class);

                intent2.putExtra("name", currentItem.getName());
                intent2.putExtra("image", currentItem.getImage());

                context.startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(context, Calculator3Param.class);

                intent3.putExtra("name", currentItem.getName());
                intent3.putExtra("image", currentItem.getImage());

                context.startActivity(intent3);
                break;
            default:
                Toast.makeText(context, "Error", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
