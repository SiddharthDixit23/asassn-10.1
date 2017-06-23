package com.acadgild.siddharth.fragmentsassignment101;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by siddharth on 6/23/2017.
 */

public class FragmentOne extends Fragment {
TextView mtvv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
       View v = inflater.inflate(R.layout.mylayout,container,false);
        mtvv = (TextView) v.findViewById(R.id.textView);
        return v;
    }

    public void getData(String message)
    {
        mtvv.setText(message);
    }
}
