package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>
{

    Context context;

    int[] i;

    String[] n;

    public MyAdapter(MainActivity mainActivity, int[] images, String[] names) {

        context=mainActivity;
        i=images;
        n=names;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View v= LayoutInflater.from(context).inflate(R.layout.row_item,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {

        holder.imageView.setImageResource(i[position]);
        holder.textView.setText(n[position]);
    }

    @Override
    public int getItemCount()
    {
        return i.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;

        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.img);
            textView=itemView.findViewById(R.id.tv);
        }
    }
}
