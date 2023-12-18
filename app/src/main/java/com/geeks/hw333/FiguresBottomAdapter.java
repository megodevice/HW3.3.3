package com.geeks.hw333;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FiguresBottomAdapter extends RecyclerView.Adapter<FiguresBottomViewHolder> {
    private final ArrayList<Integer> colors;

    public FiguresBottomAdapter(ArrayList<Integer> colors) {
        this.colors = colors;
    }

    @NonNull
    @Override
    public FiguresBottomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FiguresBottomViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_figures_bottom, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FiguresBottomViewHolder holder, int position) {
        holder.onBind(colors.get(position));
    }

    @Override
    public int getItemCount() {
        return colors.size();
    }
}
