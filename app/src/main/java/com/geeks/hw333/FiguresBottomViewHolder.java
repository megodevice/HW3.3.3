package com.geeks.hw333;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FiguresBottomViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    public FiguresBottomViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        imageView = itemView.findViewById(R.id.image_view_figure_bottom);
    }

    public void onBind(Integer color) {
        imageView.setColorFilter(color);
    }
}
