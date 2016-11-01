package com.example.a.lanna;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static com.example.a.lanna.R.id.nameuser;


public class Save extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ImageView newImageView;

    private MyPreference myPreference;
    private ArrayList<String> setname;
    private ArrayList<String> setscore;
    private Set<String> savescore;
    private Set<String> savename;



    public Save() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Save.
     */
    // TODO: Rename and change types and number of parameters
    public static Save newInstance(String param1, String param2) {
        Save fragment = new Save();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        myPreference = new MyPreference(getActivity());

        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


        DatabaseHandler db = new DatabaseHandler(getActivity());

        db.addScore1(mParam1, Integer.valueOf(mParam2));



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_save, container, false);



        newImageView = (ImageView) v.findViewById(R.id.btonclick);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                FmGametest fmGametest = new FmGametest();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, fmGametest);
                transaction.commit();

            }
        });



        return v;
    }



}
