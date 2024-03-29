package com.example.recviewtry;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    String[] items;


    public Adapter(Context context, String[] items)
    {
        this.context=context;
        this.items= this.items;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View row=inflater.inflate(R.layout.random, viewGroup, false);
        Item item=new Item(row);
        return item;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ((Item)viewHolder).textView.setText(items[i]);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
    public class Item extends RecyclerView.ViewHolder{
        TextView textView;
        public Item(@NonNull View itemView) {

            super(itemView);
            textView=itemView.findViewById(R.id.tv);
        }
    }

}
