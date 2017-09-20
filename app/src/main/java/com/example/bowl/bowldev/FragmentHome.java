package com.example.bowl.bowldev;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentHome extends Fragment {

    public static FragmentHome newInstance() {
        FragmentHome fragHome = new FragmentHome();
        return fragHome;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        TextView avgMPHView = (TextView) view.findViewById(R.id.averageMPH);
        avgMPHView.setText("Avg MPH: " + getAverageMPH());

        return view;
    }

    private double getAverageMPH() {
        return 0.0;
    }
}
