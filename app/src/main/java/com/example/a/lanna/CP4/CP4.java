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


public class CP4 extends Fragment {
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
    private ImageView button10;
      private ImageView nextbutton;
    private ImageView homebutton;


    public CP4() {
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
    public static CP4 newInstance(String param1, String param2) {
        CP4 fragment = new CP4();
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
        View v = inflater.inflate(R.layout.fragment_cp4, container, false);


        //411
        button1 = (ImageView) v.findViewById(R.id.btcp4_11);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP4_11 cp411 = new CP4_11();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp411);
                transaction.commit();
            }
        });
        //412
        button2 = (ImageView) v.findViewById(R.id.btcp4_12);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP4_12 cp412 = new CP4_12();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp412);
                transaction.commit();
            }
        });
        //413
        button3 = (ImageView) v.findViewById(R.id.btcp4_13);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP4_13 cp413 = new CP4_13();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp413);
                transaction.commit();
            }
        });
        //414
        button4 = (ImageView) v.findViewById(R.id.btcp4_14);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP4_14 cp414 = new CP4_14();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp414);
                transaction.commit();
            }
        });
        //415
        button5 = (ImageView) v.findViewById(R.id.btcp4_15);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP4_15 cp415 = new CP4_15();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp415);
                transaction.commit();
            }
        });
        //416
        button6 = (ImageView) v.findViewById(R.id.btcp4_16);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP4_16 cp416 = new CP4_16();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp416);
                transaction.commit();
            }
        });
        //417
        button7 = (ImageView) v.findViewById(R.id.btcp4_17);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP4_17 cp417 = new CP4_17();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp417);
                transaction.commit();
            }
        });
        //418
        button8 = (ImageView) v.findViewById(R.id.btcp4_18);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP4_18 cp418 = new CP4_18();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp418);
                transaction.commit();
            }
        });
        //419
        button9 = (ImageView) v.findViewById(R.id.btcp4_19);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP4_19 cp419 = new CP4_19();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp419);
                transaction.commit();
            }
        });
        //420
        button10 = (ImageView) v.findViewById(R.id.btcp4_20);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP4_20 cp420 = new CP4_20();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp420);
                transaction.commit();
            }
        });


        //btnext
        nextbutton = (ImageView) v.findViewById(R.id.btnext);
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP41 cp41 = new CP41();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp41);
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
