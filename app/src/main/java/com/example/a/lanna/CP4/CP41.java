package com.example.a.lanna.CP4;

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


public class CP41 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ImageView button11;
    private ImageView button12;
    private ImageView button13;
    private ImageView button14;
    private ImageView button15;
    private ImageView button16;
    private ImageView button17;
    private ImageView button18;
    private ImageView button19;
    private ImageView button20;
    private ImageView backbutton;
    private ImageView homebutton;


    public CP41() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CP4.
     */
    // TODO: Rename and change types and number of parameters
    public static CP41 newInstance(String param1, String param2) {
        CP41 fragment = new CP41();
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
        View v = inflater.inflate(R.layout.fragment_cp41, container, false);


        //421
        button11 = (ImageView) v.findViewById(R.id.btcp4_21);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP4_21 cp421 = new CP4_21();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp421);
                transaction.commit();
            }
        });
        //422
        button12 = (ImageView) v.findViewById(R.id.btcp4_22);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP4_22 cp422 = new CP4_22();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp422);
                transaction.commit();
            }
        });
        //423
        button13 = (ImageView) v.findViewById(R.id.btcp4_23);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP4_23 cp423 = new CP4_23();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp423);
                transaction.commit();
            }
        });
        //424
        button14 = (ImageView) v.findViewById(R.id.btcp4_24);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP4_24 cp424 = new CP4_24();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp424);
                transaction.commit();
            }
        });
        //425
        button15 = (ImageView) v.findViewById(R.id.btcp4_25);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP4_25 cp425 = new CP4_25();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp425);
                transaction.commit();
            }
        });
        //426
        button16 = (ImageView) v.findViewById(R.id.btcp4_26);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP4_26 cp426 = new CP4_26();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp426);
                transaction.commit();
            }
        });
        //427
        button17 = (ImageView) v.findViewById(R.id.btcp4_27);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP4_27 cp427 = new CP4_27();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp427);
                transaction.commit();
            }
        });
        //428
        button18 = (ImageView) v.findViewById(R.id.btcp4_28);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP4_28 cp428 = new CP4_28();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp428);
                transaction.commit();
            }
        });
        //429
        button19 = (ImageView) v.findViewById(R.id.btcp4_29);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP4_29 cp429 = new CP4_29();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp429);
                transaction.commit();
            }
        });
        //430
        button20 = (ImageView) v.findViewById(R.id.btcp4_30);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP4_30 cp430 = new CP4_30();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp430);
                transaction.commit();
            }
        });

        //btback
        backbutton = (ImageView) v.findViewById(R.id.btback);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP4 cp4 = new CP4();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp4);
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
