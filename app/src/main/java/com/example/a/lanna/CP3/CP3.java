package com.example.a.lanna.CP3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.a.lanna.FmExercise;
import com.example.a.lanna.R;


public class CP3 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ImageView button1;
    private ImageView button2;
    private ImageView button3;
    private ImageView button4;
    private ImageView button5;
    private ImageView button6;
    private ImageView button7;
    private ImageView button8;
    private ImageView button9;
    private ImageView homebutton;


    public CP3() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CP3.
     */
    // TODO: Rename and change types and number of parameters
    public static CP3 newInstance(String param1, String param2) {
        CP3 fragment = new CP3();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_cp3, container, false);


        //1
        button1 = (ImageView) v.findViewById(R.id.btcp3_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP3_1 cp31 = new CP3_1();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp31);
                transaction.commit();
            }
        });
        //2
        button2 = (ImageView) v.findViewById(R.id.btcp3_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP3_2 cp32 = new CP3_2();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp32);
                transaction.commit();
            }
        });
        //3
        button3 = (ImageView) v.findViewById(R.id.btcp3_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP3_3 cp33 = new CP3_3();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp33);
                transaction.commit();
            }
        });
        //4
        button4 = (ImageView) v.findViewById(R.id.btcp3_4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP3_4 cp34 = new CP3_4();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp34);
                transaction.commit();
            }
        });
        //5
        button5 = (ImageView) v.findViewById(R.id.btcp3_5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP3_5 cp35 = new CP3_5();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp35);
                transaction.commit();
            }
        });
        //6
        button6 = (ImageView) v.findViewById(R.id.btcp3_6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP3_6 cp36 = new CP3_6();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp36);
                transaction.commit();
            }
        });
        //7
        button7 = (ImageView) v.findViewById(R.id.btcp3_7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP3_7 cp37 = new CP3_7();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp37);
                transaction.commit();
            }
        });
        //8
        button8 = (ImageView) v.findViewById(R.id.btcp3_8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP3_8 cp38 = new CP3_8();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp38);
                transaction.commit();
            }
        });
        //9
        button9 = (ImageView) v.findViewById(R.id.btcp3_9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP3_9 cp39 = new CP3_9();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp39);
                transaction.commit();
            }
        });


        //bthome
        homebutton = (ImageView) v.findViewById(R.id.bthome);
        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FmExercise fmexercise = new FmExercise();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, fmexercise);
                transaction.commit();
            }
        });

        return v;
    }


}
