package com.example.bowl.bowldev;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

public class FragmentHome extends Fragment {
    private final String TAG = "FragmentHome";

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
        TextView avgAxisRotationView = (TextView) view.findViewById(R.id.avgAxisRotation);
        avgAxisRotationView.setText("Avg Axis Rotation: " + getAvgAxisRotation());
        TextView avgAxisTiltView = (TextView) view.findViewById(R.id.avgAxisTilt);
        avgAxisTiltView.setText("Avg Axis Tilt: " + getAvgAxisTilt());
        TextView avgSwingTempoView = (TextView) view.findViewById(R.id.avgSwingTempo);
        avgSwingTempoView.setText("Avg Swing Tempo: " + getAvgSwingTempo());
        TextView avgSwingPlaneView = (TextView) view.findViewById(R.id.avgSwingPlane);
        avgSwingPlaneView.setText("Avg Swing Plane: " + getAvgSwingPlane());*/

        GridView gridView = (GridView) view.findViewById(R.id.statgrid);
        gridView.setAdapter(new GridAdapter(this.getActivity(), getGridTextList(), gridImageList));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position,
                                    long id) {

                Log.d(TAG, "Position: " + position);
                Log.d(TAG, "ID: " + id);

                DefinitionPopUp dPopup = null;

                // Position 0: MPH
                if (position == 0) {
                    Log.d(TAG, "MPH Definition");
                    dPopup = DefinitionPopUp.newInstance(
                            R.string.popup_header, R.string.def_mph);
                }
                // Position 1: RPM
                else if (position == 1) {
                    Log.d(TAG, "RPM Definition");
                    dPopup = DefinitionPopUp.newInstance(
                            R.string.popup_header, R.string.def_rpm);
                }
                // Position 2: Axis Rotation
                else if (position == 2) {
                    Log.d(TAG, "Axis Rotation Definition");
                    dPopup = DefinitionPopUp.newInstance(
                            R.string.popup_header, R.string.def_axis_rotation);
                }
                // Position 3: Axis Tilt
                else if (position == 3) {
                    Log.d(TAG, "Axis Tilt Definition");
                    dPopup = DefinitionPopUp.newInstance(
                            R.string.popup_header, R.string.def_axis_tilt);
                }
                // Position 4: Swing Tempo
                else if (position == 4) {
                    Log.d(TAG, "Swing Tempo Definition");
                    dPopup = DefinitionPopUp.newInstance(
                            R.string.popup_header, R.string.def_swing_tempo);
                }
                // Position 5: Swing Plane
                else if (position == 5) {
                    Log.d(TAG, "Swing Plane Definition");
                    dPopup = DefinitionPopUp.newInstance(
                            R.string.popup_header, R.string.def_swing_plane);
                }

                dPopup.show(getFragmentManager(), "More Info");
            }
        });

        return view;
    }

    private String[] getGridTextList () {
        String[] gridTextList = {
                "MPH: " + getMPH(),
                "RPM: " + getRPM(),
                "Axis Rotation: " + getAxisRotation(),
                "Axis Tilt: " + getAxisTilt(),
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

    private double getAxisRotation() {
        return 0.0;
    }

    private double getAxisTilt() {
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

    private double getAvgAxisRotation() {
        return 0.0;
    }

    private double getAvgAxisTilt() {
        return 0.0;
    }

    private double getAvgSwingTempo() {
        return 0.0;
    }

    private double getAvgSwingPlane() {
        return 0.0;
    }
}
