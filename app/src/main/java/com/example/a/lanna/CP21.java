package com.example.a.lanna;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;



public class CP21 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ImageView newImageView;

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


        //23
        newImageView = (ImageView) v.findViewById(R.id.btcp2_23);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_23 cp223 = new CP2_23();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp223);
                transaction.commit();
            }
        });
        //24
        newImageView = (ImageView) v.findViewById(R.id.btcp2_24);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_24 cp224 = new CP2_24();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp224);
                transaction.commit();
            }
        });
        //25
        newImageView = (ImageView) v.findViewById(R.id.btcp2_25);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_25 cp225 = new CP2_25();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp225);
                transaction.commit();
            }
        });






        //26
        newImageView = (ImageView) v.findViewById(R.id.btcp2_26);
        newImageView.setOnClickListener(new View.OnClickListener() {
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
        newImageView = (ImageView) v.findViewById(R.id.btcp2_27);
        newImageView.setOnClickListener(new View.OnClickListener() {
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
        newImageView = (ImageView) v.findViewById(R.id.btcp2_28);
        newImageView.setOnClickListener(new View.OnClickListener() {
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
        newImageView = (ImageView) v.findViewById(R.id.btcp2_29);
        newImageView.setOnClickListener(new View.OnClickListener() {
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
        newImageView = (ImageView) v.findViewById(R.id.btcp2_30);
        newImageView.setOnClickListener(new View.OnClickListener() {
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
        newImageView = (ImageView) v.findViewById(R.id.btcp2_31);
        newImageView.setOnClickListener(new View.OnClickListener() {
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
        newImageView = (ImageView) v.findViewById(R.id.btcp2_32);
        newImageView.setOnClickListener(new View.OnClickListener() {
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
        newImageView = (ImageView) v.findViewById(R.id.btcp2_33);
        newImageView.setOnClickListener(new View.OnClickListener() {
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
        newImageView = (ImageView) v.findViewById(R.id.btcp2_34);
        newImageView.setOnClickListener(new View.OnClickListener() {
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
        newImageView = (ImageView) v.findViewById(R.id.btcp2_35);
        newImageView.setOnClickListener(new View.OnClickListener() {
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
        newImageView = (ImageView) v.findViewById(R.id.btcp2_36);
        newImageView.setOnClickListener(new View.OnClickListener() {
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
        newImageView = (ImageView) v.findViewById(R.id.btcp2_37);
        newImageView.setOnClickListener(new View.OnClickListener() {
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
        newImageView = (ImageView) v.findViewById(R.id.btcp2_38);
        newImageView.setOnClickListener(new View.OnClickListener() {
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
        newImageView = (ImageView) v.findViewById(R.id.btcp2_39);
        newImageView.setOnClickListener(new View.OnClickListener() {
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
        newImageView = (ImageView) v.findViewById(R.id.btcp2_40);
        newImageView.setOnClickListener(new View.OnClickListener() {
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
        newImageView = (ImageView) v.findViewById(R.id.btcp2_41);
        newImageView.setOnClickListener(new View.OnClickListener() {
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
        newImageView = (ImageView) v.findViewById(R.id.btback);
        newImageView.setOnClickListener(new View.OnClickListener() {
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