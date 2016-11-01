package com.example.a.lanna.EX2;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.a.lanna.LV2;
import com.example.a.lanna.R;


public class EX2_8 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ImageView newImageView;


    public EX2_8() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EX2_8.
     */
    // TODO: Rename and change types and number of parameters
    public static EX2_8 newInstance(String param1, String param2) {
        EX2_8 fragment = new EX2_8();
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
        View v = inflater.inflate(R.layout.fragment_ex2_8, container, false);



        // sound
        newImageView = (ImageView) v.findViewById(R.id.btsound);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer mPlayer = MediaPlayer.create(getActivity(), R.raw.s1_027);
                mPlayer.start();
            }
        });

        //1
        newImageView = (ImageView) v.findViewById(R.id.btex2_1);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EX2_true ext = EX2_true.newInstance("8",mParam2);
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, ext);
                transaction.commit();
            }
        });

        //2
        newImageView = (ImageView) v.findViewById(R.id.btex2_2);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EX2_false exf = EX2_false.newInstance("8",mParam2);
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, exf);
                transaction.commit();
            }
        });

        //3
        newImageView = (ImageView) v.findViewById(R.id.btex2_3);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EX2_false exf = EX2_false.newInstance("8",mParam2);
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, exf);
                transaction.commit();
            }
        });

        //4
        newImageView = (ImageView) v.findViewById(R.id.btex2_4);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EX2_false exf = EX2_false.newInstance("8",mParam2);
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

                LV2 lv2 = new LV2();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, lv2);
                transaction.commit();
            }
        });





        return v;
    }


}
