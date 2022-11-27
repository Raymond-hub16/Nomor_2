package com.example.uts_no_2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MagazineAdapter extends RecyclerView.Adapter <MagazineAdapter.ViewHolder> {
    Context context;
    ArrayList<List> ListMagazine;

    public MagazineAdapter(Context context, ArrayList<List>ListMagazine){
        this.context= context;
        this.ListMagazine= ListMagazine;

    }


    @NonNull
    @Override
    public MagazineAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }




    public void onBindViewHolder(@NonNull MagazineAdapter.ViewHolder holder, int position) {
        List list = ListMagazine.get(position);
        holder.itemImage.setImageResource(list.image);
        holder.itemTittle.setText(list.tittle);
    }

    @Override
    public int getItemCount() {

        return ListMagazine.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView itemImage;
        TextView itemTittle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.itemImage);
            itemTittle= itemView.findViewById(R.id.itemTittle);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            List list = ListMagazine.get(getAdapterPosition());
            String info = list.desc + "\n" + list.price;
            Toast.makeText(context,info, Toast.LENGTH_LONG).show();
        }
    }
}
