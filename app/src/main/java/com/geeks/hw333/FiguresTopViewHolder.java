package com.geeks.hw333;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FiguresTopViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    public FiguresTopViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        imageView = itemView.findViewById(R.id.image_view_figure_top);
    }

    public void onBind(Integer color) {
        imageView.setColorFilter(color);
    }
}
