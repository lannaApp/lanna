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
import android.widget.Button;


public class CP2 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Button newButton;


    public CP2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CP2.
     */
    // TODO: Rename and change types and number of parameters
    public static CP2 newInstance(String param1, String param2) {
        CP2 fragment = new CP2();
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
        View v = inflater.inflate(R.layout.fragment_cp2, container, false);


        //1
        newButton = (Button) v.findViewById(R.id.btcp2_1);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_1 cp21 = new CP2_1();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp21);
                transaction.commit();
            }
        });
        //2
        newButton = (Button) v.findViewById(R.id.btcp2_2);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_2 cp22 = new CP2_2();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp22);
                transaction.commit();
            }
        });
        //3
        newButton = (Button) v.findViewById(R.id.btcp2_3);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_3 cp23 = new CP2_3();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp23);
                transaction.commit();
            }
        });
        //4
        newButton = (Button) v.findViewById(R.id.btcp2_4);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_4 cp24 = new CP2_4();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp24);
                transaction.commit();
            }
        });
        //5
        newButton = (Button) v.findViewById(R.id.btcp2_5);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_5 cp25 = new CP2_5();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp25);
                transaction.commit();
            }
        });
        //6
        newButton = (Button) v.findViewById(R.id.btcp2_6);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_6 cp26 = new CP2_6();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp26);
                transaction.commit();
            }
        });
        //7
        newButton = (Button) v.findViewById(R.id.btcp2_7);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_7 cp27 = new CP2_7();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp27);
                transaction.commit();
            }
        });
        //8
        newButton = (Button) v.findViewById(R.id.btcp2_8);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_8 cp28 = new CP2_8();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp28);
                transaction.commit();
            }
        });
        //9
        newButton = (Button) v.findViewById(R.id.btcp2_9);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_9 cp29 = new CP2_9();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp29);
                transaction.commit();
            }
        });
        //10
        newButton = (Button) v.findViewById(R.id.btcp2_10);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_10 cp210 = new CP2_10();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp210);
                transaction.commit();
            }
        });

        //11
        newButton = (Button) v.findViewById(R.id.btcp2_11);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_11 cp211 = new CP2_11();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp211);
                transaction.commit();
            }
        });
        //12
        newButton = (Button) v.findViewById(R.id.btcp2_12);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_12 cp212 = new CP2_12();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp212);
                transaction.commit();
            }
        });
        //13
        newButton = (Button) v.findViewById(R.id.btcp2_13);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_13 cp213 = new CP2_13();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp213);
                transaction.commit();
            }
        });
        //14
        newButton = (Button) v.findViewById(R.id.btcp2_14);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_14 cp214 = new CP2_14();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp214);
                transaction.commit();
            }
        });
        //15
        newButton = (Button) v.findViewById(R.id.btcp2_15);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_15 cp215 = new CP2_15();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp215);
                transaction.commit();
            }
        });
        //16
        newButton = (Button) v.findViewById(R.id.btcp2_16);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_16 cp216 = new CP2_16();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp216);
                transaction.commit();
            }
        });
        //17
        newButton = (Button) v.findViewById(R.id.btcp2_17);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_17 cp217 = new CP2_17();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp217);
                transaction.commit();
            }
        });
        //18
        newButton = (Button) v.findViewById(R.id.btcp2_18);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_18 cp218 = new CP2_18();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp218);
                transaction.commit();
            }
        });
        //19
        newButton = (Button) v.findViewById(R.id.btcp2_19);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_19 cp219 = new CP2_19();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp219);
                transaction.commit();
            }
        });
        //20
        newButton = (Button) v.findViewById(R.id.btcp2_20);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_20 cp220 = new CP2_20();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp220);
                transaction.commit();
            }
        });


        //21
        newButton = (Button) v.findViewById(R.id.btcp2_21);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_21 cp221 = new CP2_21();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp221);
                transaction.commit();
            }
        });
        //22
        newButton = (Button) v.findViewById(R.id.btcp2_22);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_22 cp222 = new CP2_22();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp222);
                transaction.commit();
            }
        });
        //23
        newButton = (Button) v.findViewById(R.id.btcp2_23);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_23 cp223 = new CP2_23();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp223);
                transaction.commit();
            }
        });
        //4
        newButton = (Button) v.findViewById(R.id.btcp2_24);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_24 cp224 = new CP2_24();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp224);
                transaction.commit();
            }
        });
        //5
        newButton = (Button) v.findViewById(R.id.btcp2_25);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_25 cp225 = new CP2_25();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp225);
                transaction.commit();
            }
        });


        //btnext
        newButton = (Button) v.findViewById(R.id.btnext);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP21 cp21 = new CP21();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp21);
                transaction.commit();
            }
        });

        //bthome
        newButton = (Button) v.findViewById(R.id.bthome);
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

        return v;
    }

}
