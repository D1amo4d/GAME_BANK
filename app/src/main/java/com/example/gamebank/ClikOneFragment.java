package com.example.gamebank;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

public class ClikOneFragment extends Fragment {
    private double manyPlus=7.4;
    ConstraintLayout fragmentClikMany;
    private TextView tvMany;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_clik_one, container, false);
        fragmentClikMany = view.findViewById(R.id.clik_plus_many);
        tvMany = view.findViewById(R.id.tv_many); // Initialize tvMany

        initView();
        return view;
    }

    public void initView() {
        String manyText = String.valueOf(manyPlus);
        tvMany.setText(manyText);

        fragmentClikMany.setOnClickListener(view -> {
            manyPlus+=7;
            tvMany.setText("$"+(manyPlus));
        });
    }
}
