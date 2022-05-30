package com.example.nobel;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MainFragment extends Fragment {



    public MainFragment() {
        // Required empty public constructor
    }



    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button[] nobelBtn = new Button[4];
        nobelBtn[0] = (Button) getActivity().findViewById(R.id.chemistry);
        nobelBtn[1] = (Button) getActivity().findViewById(R.id.physics);
        nobelBtn[2] = (Button) getActivity().findViewById(R.id.peace);
        nobelBtn[3] = (Button) getActivity().findViewById(R.id.literature);
        for (int i = 0; i < 4; i++) {
            int id = nobelBtn[i].getId();
            nobelBtn[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showDetailsAboutNominee(id);
                }
            });
        }
    }

    private void showDetailsAboutNominee(int id) {
        if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_LANDSCAPE) {

            NomineeDetailsFrag frag = (NomineeDetailsFrag) getFragmentManager().findFragmentById(R.id.fragment2);
            frag.setNomineeId(id);
        } else {

            Intent intent = new Intent(getActivity(), NomineeDetailsAct.class);
            intent.putExtra("country_id", id);
            startActivity(intent);
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}