package com.example.kaila.challenge30days;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kaila on 6/6/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private List<String> mData;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;
    private SparseBooleanArray CheckStateArray= new SparseBooleanArray();

    MyAdapter(Context context, List<String> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.row, parent, false);
        return new ViewHolder(view);
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
       String task = mData.get(position);
       holder.mTextView.setText(task);
    }

    // total number of days completed or checks
    @Override
    public int getItemCount() {

        if(mData == null){
            return 0;
        }
        return mData.size();
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    CheckBox mCheckedTextView;
    TextView mTextView;

    ViewHolder(View itemView) {
        super(itemView);
        mTextView = itemView.findViewById(R.id.tvChallengeTask1);
        itemView.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());

        //control checkbox
        int adapterpos = getAdapterPosition();
        if(!CheckStateArray.get(adapterpos,false)){
          mCheckedTextView.setChecked(true);
          CheckStateArray.put(adapterpos,true);
        }
            else{
            mCheckedTextView.setChecked(false);
            CheckStateArray.put(adapterpos,false);
        }
    }

}

    // convenience method for getting data at click position
    String getItem(int id) {
        return mData.get(id);
    }

    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

// parent activity will implement this method to respond to click events
public interface ItemClickListener {
    void onItemClick(View view, int position);
}
}
