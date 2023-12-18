package com.geeks.hw333;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FiguresTopAdapter extends RecyclerView.Adapter<FiguresTopViewHolder> {
    private final ArrayList<Integer> colors;

    public FiguresTopAdapter(ArrayList<Integer> colors) {
        this.colors = colors;
    }

    @NonNull
    @Override
    public FiguresTopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FiguresTopViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_figures_top, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FiguresTopViewHolder holder, int position) {
        holder.onBind(colors.get(position));
    }

    @Override
    public int getItemCount() {
        return colors.size();
    }
}
