package com.example.cakes3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    cakeModal[] data;
    Context context;
    public Adapter(Context context,cakeModal[] data) {
        this.data = data;
        this.context=context;

    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cake_card,parent,false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        cakeModal modal = data[position];
        holder.tv_cakeName.setText(modal.getCakeName());
        holder.tv_cakePrice.setText(modal.getCakePrice());

        holder.iv_Cake.setImageResource(R.drawable.ic_launcher_background);


    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView iv_Cake;
        TextView tv_cakeName,tv_cakePrice;

        ImageView btn_add;
        CardView cv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            iv_Cake = itemView.findViewById(R.id.id_img_cakeImage);
            tv_cakeName = itemView.findViewById(R.id.id_tv_cakeName);
            tv_cakePrice = itemView.findViewById(R.id.id_tv_cakePrice);
            btn_add = itemView.findViewById(R.id.id_btn_add);
            cv = itemView.findViewById(R.id.cardView);

            btn_add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "Added", Toast.LENGTH_SHORT).show();
                }
            });

            cv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    context.startActivity(new Intent(context,cakeDetails.class));
                }
            });




        }
    }
}
