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



public class EX1_2 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    private ImageView newImageView;

    public EX1_2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EX1_2.
     */
    // TODO: Rename and change types and number of parameters
    public static EX1_2 newInstance(String param1, String param2) {
        EX1_2 fragment = new EX1_2();
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
        View v = inflater.inflate(R.layout.fragment_ex1_2, container, false);




        //1
        newImageView = (ImageView) v.findViewById(R.id.btex1_1);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

    if (mParam1 == mParam2){

      mParam2="2";
    }
                EX1_true ext = EX1_true.newInstance("2", mParam2);
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, ext);
                transaction.commit();
            }
        });

        //2
        newImageView = (ImageView) v.findViewById(R.id.btex1_2);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EX1_false exf = EX1_false.newInstance("2",mParam2);
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, exf);
                transaction.commit();
            }
        });

        //3
        newImageView = (ImageView) v.findViewById(R.id.btex1_3);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EX1_false exf = EX1_false.newInstance("2",mParam2);
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, exf);
                transaction.commit();
            }
        });

        //4
        newImageView = (ImageView) v.findViewById(R.id.btex1_4);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EX1_false exf = EX1_false.newInstance("2",mParam2);
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, exf);
                transaction.commit();
            }
        });

        //btback
        newImageView = (ImageView) v.findViewById(R.id.btback);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LV1 lv1 = new LV1();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, lv1);
                transaction.commit();
            }
        });





        return v;
    }
}
