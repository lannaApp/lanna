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



public class CP21 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Button newButton;

    public CP21() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CP21.
     */
    // TODO: Rename and change types and number of parameters
    public static CP21 newInstance(String param1, String param2) {
        CP21 fragment = new CP21();
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
        View v = inflater.inflate(R.layout.fragment_cp21, container, false);


        //26
        newButton = (Button) v.findViewById(R.id.btcp2_26);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_26 cp226 = new CP2_26();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp226);
                transaction.commit();
            }
        });
        //27
        newButton = (Button) v.findViewById(R.id.btcp2_27);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_27 cp227 = new CP2_27();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp227);
                transaction.commit();
            }
        });
        //28
        newButton = (Button) v.findViewById(R.id.btcp2_28);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_28 cp228 = new CP2_28();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp228);
                transaction.commit();
            }
        });
        //29
        newButton = (Button) v.findViewById(R.id.btcp2_29);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_29 cp229 = new CP2_29();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp229);
                transaction.commit();
            }
        });
        //30
        newButton = (Button) v.findViewById(R.id.btcp2_30);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_30 cp230 = new CP2_30();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp230);
                transaction.commit();
            }
        });
        //31
        newButton = (Button) v.findViewById(R.id.btcp2_31);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_31 cp231 = new CP2_31();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp231);
                transaction.commit();
            }
        });
        //32
        newButton = (Button) v.findViewById(R.id.btcp2_32);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_32 cp232 = new CP2_32();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp232);
                transaction.commit();
            }
        });
        //33
        newButton = (Button) v.findViewById(R.id.btcp2_33);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_33 cp233 = new CP2_33();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp233);
                transaction.commit();
            }
        });
        //34
        newButton = (Button) v.findViewById(R.id.btcp2_34);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_34 cp234 = new CP2_34();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp234);
                transaction.commit();
            }
        });
        //35
        newButton = (Button) v.findViewById(R.id.btcp2_35);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_35 cp235 = new CP2_35();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp235);
                transaction.commit();
            }
        });

        //36
        newButton = (Button) v.findViewById(R.id.btcp2_36);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_36 cp236 = new CP2_36();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp236);
                transaction.commit();
            }
        });
        //37
        newButton = (Button) v.findViewById(R.id.btcp2_37);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_37 cp237 = new CP2_37();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp237);
                transaction.commit();
            }
        });
        //38
        newButton = (Button) v.findViewById(R.id.btcp2_38);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_38 cp238 = new CP2_38();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp238);
                transaction.commit();
            }
        });
        //39
        newButton = (Button) v.findViewById(R.id.btcp2_39);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_39 cp239 = new CP2_39();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp239);
                transaction.commit();
            }
        });
        //40
        newButton = (Button) v.findViewById(R.id.btcp2_40);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_40 cp240 = new CP2_40();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp240);
                transaction.commit();
            }
        });
        //41
        newButton = (Button) v.findViewById(R.id.btcp2_41);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_41 cp241 = new CP2_41();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp241);
                transaction.commit();
            }
        });


        //btback
        newButton = (Button) v.findViewById(R.id.btback);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2 cp2 = new CP2();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp2);
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