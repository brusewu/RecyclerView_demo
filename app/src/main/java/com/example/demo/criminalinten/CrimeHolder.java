package com.example.demo.criminalinten;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by bruse on 2019/5/24.
 */

public class CrimeHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    private TextView mTitleTextView;
    private TextView mDateTextView;
    private Crime mCrime;

    public CrimeHolder(LayoutInflater inflater, ViewGroup parent) {
        super(inflater.inflate(R.layout.list_item_crime,parent,false));
        itemView.setOnClickListener(this);

        mTitleTextView = (TextView) itemView.findViewById(R.id.crime_title);
        mDateTextView = (TextView) itemView.findViewById(R.id.crime_date);
    }

    public void bind(Crime crime){
        mCrime = crime;
        mDateTextView.setText(mCrime.getmDate().toString());
        mTitleTextView.setText(mCrime.getmTitle().toString());
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(),mCrime.getmTitle() + "clicked!",Toast.LENGTH_SHORT).show();
    }
}
