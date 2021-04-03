package com.androidnc.btl_h2dmusic.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.androidnc.btl_h2dmusic.R;

import java.util.List;

public class BinhluanAdapter extends RecyclerView.Adapter<BinhluanAdapter.ViewHolder> {
    private Context context;
//    private List

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView username,contentCmt;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            username = itemView.findViewById(R.id.username);
            contentCmt = itemView.findViewById(R.id.contentCommented);
        }
    }
}
