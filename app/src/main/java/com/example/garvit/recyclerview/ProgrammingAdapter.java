package com.example.garvit.recyclerview;

/**
 * Created by Garvit on 28-Apr-18.
 */

/**
 * Created by Garvit on 28-Apr-18.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.garvit.recyclerview.R;

import java.util.zip.Inflater;

/**
 * Created by Garvit on 28-Apr-18.
 */

class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {
    private String []data;
    public ProgrammingAdapter(String[] data)
    {
        this.data=data;
    }
    @Override
    public ProgrammingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.list_item_layout,parent,false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProgrammingViewHolder holder, int position) {
        String title=data[position];
        holder.textView.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public ProgrammingViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.ImageId);
            textView= itemView.findViewById(R.id.TxtId);
        }
    }
}


