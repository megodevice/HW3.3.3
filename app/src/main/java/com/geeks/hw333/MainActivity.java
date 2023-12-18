package com.geeks.hw333;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewTopFigures;
    private RecyclerView recyclerViewBottomFigures;
    private final Random random = new Random();
    private final ArrayList<Integer> colorsTop = new ArrayList<>();
    private final ArrayList<Integer> colorsBottom = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData(colorsTop);
        loadData(colorsBottom);
        recyclerViewTopFigures.setAdapter(new FiguresTopAdapter(colorsTop));
        recyclerViewBottomFigures.setAdapter(new FiguresBottomAdapter(colorsBottom));
    }

    private void initView() {
        recyclerViewTopFigures = findViewById(R.id.rv_top_list);
        recyclerViewBottomFigures = findViewById(R.id.rv_bottom_list);
    }

    private void loadData(ArrayList<Integer> colors) {
        for (int i = 0; i < 10; i++) {
            colors.add(random.nextInt());
        }
    }
}