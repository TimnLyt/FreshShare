package com.example.freshshare;

import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;


public class FoodGridDecoration extends RecyclerView.ItemDecoration {
    private int largePadding;
    private int smallPadding;

    public FoodGridDecoration(int largePadding, int smallPadding) {
        this.largePadding = largePadding;
        this.smallPadding = smallPadding;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view,
                               RecyclerView parent, RecyclerView.State state) {
        outRect.left = smallPadding;
        outRect.right = largePadding;
    }
}