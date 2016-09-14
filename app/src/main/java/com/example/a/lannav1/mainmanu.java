package com.example.a.lannav1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link mainmanu} interface
 * to handle interaction events.
 * Use the {@link mainmanu#newInstance} factory method to
 * create an instance of this fragment.
 */
public class mainmanu extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";


    // TODO: Rename and change types of parameters
    private String getnameuser;
    private Button newButton;
    private TextView tvnameuset;


    public mainmanu() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static mainmanu newInstance(String setnameuser) {
        mainmanu fragment = new mainmanu();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, setnameuser);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            getnameuser = getArguments().getString(ARG_PARAM1);

        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_mainmanu, container, false);

        //tvnameuser
        tvnameuset = (TextView)v.findViewById(R.id.name);
        tvnameuset.setText(getnameuser);

        //btexercise
        newButton = (Button)v.findViewById(R.id.btexercise);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FmExercise fmexercise = new FmExercise();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, fmexercise);
                transaction.commit();
            }
        });


        //btgametest
        newButton = (Button)v.findViewById(R.id.btgametest);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FmGametest fmgametest = new FmGametest();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, fmgametest);
                transaction.commit();
            }
        });


        //btback
        newButton = (Button) v.findViewById(R.id.btback);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirstPageFragment firstpage = new FirstPageFragment();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, firstpage);
                transaction.commit();
            }
        });


        return v;
    }

}
