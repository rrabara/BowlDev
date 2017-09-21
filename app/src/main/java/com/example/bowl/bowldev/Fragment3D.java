package com.example.bowl.bowldev;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment3D extends Fragment {
    private final String TAG = "Fragment3D";

    public static Fragment3D newInstance() {
        Fragment3D frag3D = new Fragment3D();
        return frag3D;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_3d, container, false);
    }
}
