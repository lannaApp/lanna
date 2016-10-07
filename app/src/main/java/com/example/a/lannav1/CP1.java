package com.example.a.lannav1;

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
import android.widget.ImageView;


public class CP1 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ImageView newImageView;
   


    public CP1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CP1.
     */
    // TODO: Rename and change types and number of parameters
    public static CP1 newInstance(String param1, String param2) {
        CP1 fragment = new CP1();
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
        View v = inflater.inflate(R.layout.fragment_cp1, container, false);


        //1
        newImageView = (ImageView) v.findViewById(R.id.btcp1_1);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_1 cp11 = new CP1_1();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp11);
                transaction.commit();
            }
        });
        //2
        newImageView = (ImageView) v.findViewById(R.id.btcp1_2);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_2 cp12 = new CP1_2();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp12);
                transaction.commit();
            }
        });
        //3
        newImageView = (ImageView) v.findViewById(R.id.btcp1_3);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_3 cp13 = new CP1_3();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp13);
                transaction.commit();
            }
        });
        //4
        newImageView = (ImageView) v.findViewById(R.id.btcp1_4);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_4 cp14 = new CP1_4();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp14);
                transaction.commit();
            }
        });
        //5
        newImageView = (ImageView) v.findViewById(R.id.btcp1_5);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_5 cp15 = new CP1_5();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp15);
                transaction.commit();
            }
        });
        //6
        newImageView = (ImageView) v.findViewById(R.id.btcp1_6);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_6 cp16 = new CP1_6();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp16);
                transaction.commit();
            }
        });
        //7
        newImageView = (ImageView) v.findViewById(R.id.btcp1_7);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_7 cp17 = new CP1_7();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp17);
                transaction.commit();
            }
        });
        //8
        newImageView = (ImageView) v.findViewById(R.id.btcp1_8);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_8 cp18 = new CP1_8();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp18);
                transaction.commit();
            }
        });
        //9
        newImageView = (ImageView) v.findViewById(R.id.btcp1_9);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_9 cp19 = new CP1_9();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp19);
                transaction.commit();
            }
        });
        //10
        newImageView = (ImageView) v.findViewById(R.id.btcp1_10);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_10 cp110 = new CP1_10();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp110);
                transaction.commit();
            }
        });

        //11
        newImageView = (ImageView) v.findViewById(R.id.btcp1_11);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_11 cp111 = new CP1_11();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp111);
                transaction.commit();
            }
        });
        //12
        newImageView = (ImageView) v.findViewById(R.id.btcp1_12);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_12 cp112 = new CP1_12();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp112);
                transaction.commit();
            }
        });
        //13
        newImageView = (ImageView) v.findViewById(R.id.btcp1_13);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_13 cp113 = new CP1_13();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp113);
                transaction.commit();
            }
        });
        //14
        newImageView = (ImageView) v.findViewById(R.id.btcp1_14);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_14 cp114 = new CP1_14();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp114);
                transaction.commit();
            }
        });
        //15
        newImageView = (ImageView) v.findViewById(R.id.btcp1_15);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_15 cp115 = new CP1_15();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp115);
                transaction.commit();
            }
        });
        //16
        newImageView = (ImageView) v.findViewById(R.id.btcp1_16);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_16 cp116 = new CP1_16();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp116);
                transaction.commit();
            }
        });
        //17
        newImageView = (ImageView) v.findViewById(R.id.btcp1_17);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_17 cp117 = new CP1_17();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp117);
                transaction.commit();
            }
        });
        //18
        newImageView = (ImageView) v.findViewById(R.id.btcp1_18);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_18 cp118 = new CP1_18();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp118);
                transaction.commit();
            }
        });
        //19
        newImageView = (ImageView) v.findViewById(R.id.btcp1_19);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_19 cp119 = new CP1_19();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp119);
                transaction.commit();
            }
        });
        //20
        newImageView = (ImageView) v.findViewById(R.id.btcp1_20);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_20 cp120 = new CP1_20();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp120);
                transaction.commit();
            }
        });


        //21
        newImageView = (ImageView) v.findViewById(R.id.btcp1_21);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_21 cp121 = new CP1_21();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp121);
                transaction.commit();
            }
        });
        //22
        newImageView = (ImageView) v.findViewById(R.id.btcp1_22);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_22 cp122 = new CP1_22();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp122);
                transaction.commit();
            }
        });
        //23
        newImageView = (ImageView) v.findViewById(R.id.btcp1_23);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_23 cp123 = new CP1_23();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp123);
                transaction.commit();
            }
        });
        //4
        newImageView = (ImageView) v.findViewById(R.id.btcp1_24);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_24 cp124 = new CP1_24();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp124);
                transaction.commit();
            }
        });
        //5
        newImageView = (ImageView) v.findViewById(R.id.btcp1_25);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_25 cp125 = new CP1_25();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp125);
                transaction.commit();
            }
        });


        //btnext
        newImageView = (ImageView) v.findViewById(R.id.btnext);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP11 cp11 = new CP11();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp11);
                transaction.commit();
            }
        });

        //bthome
        newImageView = (ImageView) v.findViewById(R.id.bthome);
        newImageView.setOnClickListener(new View.OnClickListener() {
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
