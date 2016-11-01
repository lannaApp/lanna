package com.example.a.lanna.EX4;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.a.lanna.LV4;
import com.example.a.lanna.R;


public class EX4_5 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ImageView newImageView;


    public EX4_5() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EX4_5.
     */
    // TODO: Rename and change types and number of parameters
    public static EX4_5 newInstance(String param1, String param2) {
        EX4_5 fragment = new EX4_5();
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
        View v = inflater.inflate(R.layout.fragment_ex4_5, container, false);




        //1
        newImageView = (ImageView) v.findViewById(R.id.btex4_1);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EX4_true ext = EX4_true.newInstance("5", mParam2);
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, ext);
                transaction.commit();
            }
        });

        //2
        newImageView = (ImageView) v.findViewById(R.id.btex4_2);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EX4_false exf = EX4_false.newInstance("5",mParam2);
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, exf);
                transaction.commit();
            }
        });

        //3
        newImageView = (ImageView) v.findViewById(R.id.btex4_3);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EX4_false exf = EX4_false.newInstance("5",mParam2);
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, exf);
                transaction.commit();
            }
        });

        //4
        newImageView = (ImageView) v.findViewById(R.id.btex4_4);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EX4_false exf = EX4_false.newInstance("5",mParam2);
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

                LV4 lv4 = new LV4();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, lv4);
                transaction.commit();
            }
        });





        return v;
    }


}
