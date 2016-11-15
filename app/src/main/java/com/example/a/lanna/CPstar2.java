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

import com.example.a.lanna.CP1.CP1;
import com.example.a.lanna.CP1.CP11;
import com.example.a.lanna.CP1.CP111;
import com.example.a.lanna.CP1.CP1_1;
import com.example.a.lanna.CP2.CP2;
import com.example.a.lanna.CP2.CP21;
import com.example.a.lanna.CP3.CP3;
import com.example.a.lanna.CP4.CP4;
import com.example.a.lanna.CP4.CP41;


public class CPstar2 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private ImageView btrestart;
    private ImageView bthome;


    public CPstar2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CPstar2.
     */
    // TODO: Rename and change types and number of parameters
    public static CPstar2 newInstance(String param1, String param2) {
        CPstar2 fragment = new CPstar2();
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
        View v = inflater.inflate(R.layout.fragment_cpstar2, container, false);

        bthome = (ImageView) v.findViewById(R.id.bthome);

        if (mParam1 == "1") {

            if (mParam2 == "1") {


                bthome.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        CP1 fm_cp1 = new CP1();
                        FragmentManager manager = getActivity().getSupportFragmentManager();
                        FragmentTransaction transaction = manager.beginTransaction();
                        transaction.replace(R.id.fragment_container, fm_cp1);
                        transaction.commit();
                    }
                });
            }else if (mParam2 == "2"){

                bthome.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        CP11 fm_cp1 = new CP11();
                        FragmentManager manager = getActivity().getSupportFragmentManager();
                        FragmentTransaction transaction = manager.beginTransaction();
                        transaction.replace(R.id.fragment_container, fm_cp1);
                        transaction.commit();
                    }
                });

            }else{

                bthome.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        CP111 fm_cp1 = new CP111();
                        FragmentManager manager = getActivity().getSupportFragmentManager();
                        FragmentTransaction transaction = manager.beginTransaction();
                        transaction.replace(R.id.fragment_container, fm_cp1);
                        transaction.commit();
                    }
                });

            }

        } else if (mParam1 == "2") {


            if (mParam2 == "1"){

                bthome.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        CP2 fm_cp1 = new CP2();
                        FragmentManager manager = getActivity().getSupportFragmentManager();
                        FragmentTransaction transaction = manager.beginTransaction();
                        transaction.replace(R.id.fragment_container, fm_cp1);
                        transaction.commit();
                    }
                });

            }else{

                bthome.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        CP21 fm_cp1 = new CP21();
                        FragmentManager manager = getActivity().getSupportFragmentManager();
                        FragmentTransaction transaction = manager.beginTransaction();
                        transaction.replace(R.id.fragment_container, fm_cp1);
                        transaction.commit();
                    }
                });

            }

        } else if (mParam1 == "3") {


            bthome.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    CP3 fm_cp1 = new CP3();
                    FragmentManager manager = getActivity().getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.fragment_container, fm_cp1);
                    transaction.commit();
                }
            });

        } else {


            if (mParam2 == "1"){

                bthome.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        CP4 fm_cp1 = new CP4();
                        FragmentManager manager = getActivity().getSupportFragmentManager();
                        FragmentTransaction transaction = manager.beginTransaction();
                        transaction.replace(R.id.fragment_container, fm_cp1);
                        transaction.commit();
                    }
                });

            }else{

                bthome.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        CP41 fm_cp1 = new CP41();
                        FragmentManager manager = getActivity().getSupportFragmentManager();
                        FragmentTransaction transaction = manager.beginTransaction();
                        transaction.replace(R.id.fragment_container, fm_cp1);
                        transaction.commit();
                    }
                });

            }
        }


        return v;
    }

}
