package com.example.buoi1.adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.example.buoi1.DAO.ProductDAO;
import com.example.buoi1.models.Product;

import java.util.List;

public class SwipeItem extends ItemTouchHelper.SimpleCallback {


    public SwipeItem(int dragDirs, int swipeDirs) {
        super(dragDirs, swipeDirs);
    }

    @Override
    public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
        return false;
    }

    @Override
    public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
//        int pos = viewHolder.getAdapterPosition();
//        int id = mAdapter.deleteItem(pos);
//        new ProductDAO(context).Delete(id);
//        mAdapter.notifyItemRemoved(pos);
//        mAdapter.notifyItemRangeChanged(pos, mAdapter.getItemCount());
    }
}
