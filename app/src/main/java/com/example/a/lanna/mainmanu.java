package com.example.a.lanna;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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
    private static final String ARG_PARAM2 = "param2";


    // TODO: Rename and change types of parameters
    private String getnameuser;
    private ImageView pracButton;
    private TextView tvnameuset;
    private ImageView rankButton;
    private ImageView gameButton;

    private MyPreference myPreference;
    private String mParam1;
    private String mParam2;


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
        myPreference = new MyPreference(getActivity());
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_mainmanu, container, false);


        //btexercise
        pracButton = (ImageView) v.findViewById(R.id.btexercise);
        pracButton.setOnClickListener(new View.OnClickListener() {
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
        gameButton = (ImageView) v.findViewById(R.id.btgametest);
        gameButton.setOnClickListener(new View.OnClickListener() {
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
        rankButton = (ImageView) v.findViewById(R.id.btrank);
        rankButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fmrank rank = new Fmrank();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, rank);
                transaction.commit();
            }
        });

        return v;
    }

}
