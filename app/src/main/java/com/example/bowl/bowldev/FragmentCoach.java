package com.example.bowl.bowldev;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentCoach extends Fragment {
    public static FragmentCoach newInstance() {
        FragmentCoach fragCoach = new FragmentCoach();
        return fragCoach;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_coach, container, false);
    }
}
