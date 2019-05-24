package com.example.demo.criminalinten;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by bruse on 2019/5/22.
 */

public class ListRow extends RecyclerView.ViewHolder {

    public ImageView mThumbnail;

    public ListRow(View view){
        super(view);
//        mThumbnail = (ImageView)view.findViewById(R.id.thumbnail);
    }
}
