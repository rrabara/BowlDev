package com.example.bowl.bowldev;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;


public class DefinitionPopUp extends DialogFragment {

    public static DefinitionPopUp newInstance(int title, int message) {
        DefinitionPopUp popup = new DefinitionPopUp();
        Bundle args = new Bundle();
        args.putInt("title", title);
        args.putInt("message", message);
        popup.setArguments(args);
        return popup;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        int title = getArguments().getInt("title");
        int message = getArguments().getInt("message");

        AlertDialog alertDialog = new AlertDialog.Builder(getActivity())
                .setTitle(title)
                .setMessage(message)
                .create();

        return alertDialog;
    }
}
