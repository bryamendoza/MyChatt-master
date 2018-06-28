package cs656.com.firebasemessengerapp.ui;


import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;

import cs656.com.firebasemessengerapp.R;

public class AddConversationDialogFragment extends DialogFragment {

    public static DialogFragment newInstance() {
        AddConversationDialogFragment addConversationDialogFragment = new AddConversationDialogFragment();
        Bundle bundle = new Bundle();
        addConversationDialogFragment.setArguments(bundle);
        return addConversationDialogFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View rootView = inflater.inflate(R.layout.add_chat, null);


        builder.setView(rootView)

                .setPositiveButton("Create", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });

        return builder.create();
    }
}
