package com.example.bowl.bowldev;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class FragmentHome extends Fragment {

    private static int[] gridImageList = {
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher
    };

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

        /*TextView avgMPHView = (TextView) view.findViewById(R.id.avgMPH);
        avgMPHView.setText("Avg MPH: " + getAvgMPH());
        TextView avgRPMView = (TextView) view.findViewById(R.id.avgRPM);
        avgRPMView.setText("Avg RPM: " + getAvgRPM());
        TextView avgAxisView = (TextView) view.findViewById(R.id.avgAxis);
        avgAxisView.setText("Avg Axis: " + getAvgAxis());
        TextView avgTiltView = (TextView) view.findViewById(R.id.avgTilt);
        avgTiltView.setText("Avg Tilt: " + getAvgTilt());
        TextView avgSwingTempoView = (TextView) view.findViewById(R.id.avgSwingTempo);
        avgSwingTempoView.setText("Avg Swing Tempo: " + getAvgSwingTempo());
        TextView avgSwingPlaneView = (TextView) view.findViewById(R.id.avgSwingPlane);
        avgSwingPlaneView.setText("Avg Swing Plane: " + getAvgSwingPlane());*/

        GridView gridview = (GridView) view.findViewById(R.id.statgrid);
        gridview.setAdapter(new GridAdapter(this.getActivity(), getGridTextList(), gridImageList));

        return view;
    }

    private String[] getGridTextList () {
        String[] gridTextList = {
                "MPH: " + getMPH(),
                "RPM: " + getRPM(),
                "Axis: " + getAxis(),
                "Tilt: " + getTilt(),
                "Swing Tempo: " + getSwingTempo(),
                "Swing Plane: " + getSwingPlane()
        };

        return gridTextList;
    }

    private double getMPH() {
        return 0.0;
    }

    private double getRPM() {
        return 0.0;
    }

    private double getAxis() {
        return 0.0;
    }

    private double getTilt() {
        return 0.0;
    }

    private double getSwingTempo() {
        return 0.0;
    }

    private double getSwingPlane() {
        return 0.0;
    }

    private double getAvgMPH() {
        return 0.0;
    }

    private double getAvgRPM() {
        return 0.0;
    }

    private double getAvgAxis() {
        return 0.0;
    }

    private double getAvgTilt() {
        return 0.0;
    }

    private double getAvgSwingTempo() {
        return 0.0;
    }

    private double getAvgSwingPlane() {
        return 0.0;
    }
}
