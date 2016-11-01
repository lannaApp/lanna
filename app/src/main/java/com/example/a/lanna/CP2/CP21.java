package com.example.a.lanna.CP2;

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


public class CP21 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ImageView button26;
    private ImageView button27;
    private ImageView button28;
    private ImageView button29;
    private ImageView button30;
    private ImageView button31;
    private ImageView button32;
    private ImageView button33;
    private ImageView button34;
    private ImageView button35;
    private ImageView button36;
    private ImageView button37;
    private ImageView button38;
    private ImageView button39;
    private ImageView button40;
    private ImageView button41;
    private ImageView button42;
    private ImageView button43;
    private ImageView button44;
    private ImageView backbutton;
    private ImageView homebutton;

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
        button26 = (ImageView) v.findViewById(R.id.btcp2_23);
        button26.setOnClickListener(new View.OnClickListener() {
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
        button27 = (ImageView) v.findViewById(R.id.btcp2_24);
        button27.setOnClickListener(new View.OnClickListener() {
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
        button28 = (ImageView) v.findViewById(R.id.btcp2_25);
        button28.setOnClickListener(new View.OnClickListener() {
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
        button29 = (ImageView) v.findViewById(R.id.btcp2_26);
        button29.setOnClickListener(new View.OnClickListener() {
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
        button30 = (ImageView) v.findViewById(R.id.btcp2_27);
        button30.setOnClickListener(new View.OnClickListener() {
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
        button31 = (ImageView) v.findViewById(R.id.btcp2_28);
        button31.setOnClickListener(new View.OnClickListener() {
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
        button32 = (ImageView) v.findViewById(R.id.btcp2_29);
        button32.setOnClickListener(new View.OnClickListener() {
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
        button33 = (ImageView) v.findViewById(R.id.btcp2_30);
        button33.setOnClickListener(new View.OnClickListener() {
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
        button34 = (ImageView) v.findViewById(R.id.btcp2_31);
        button34.setOnClickListener(new View.OnClickListener() {
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
        button35 = (ImageView) v.findViewById(R.id.btcp2_32);
        button35.setOnClickListener(new View.OnClickListener() {
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
        button36 = (ImageView) v.findViewById(R.id.btcp2_33);
        button36.setOnClickListener(new View.OnClickListener() {
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
        button37 = (ImageView) v.findViewById(R.id.btcp2_34);
        button37.setOnClickListener(new View.OnClickListener() {
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
        button38 = (ImageView) v.findViewById(R.id.btcp2_35);
        button38.setOnClickListener(new View.OnClickListener() {
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
        button39 = (ImageView) v.findViewById(R.id.btcp2_36);
        button39.setOnClickListener(new View.OnClickListener() {
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
        button40 = (ImageView) v.findViewById(R.id.btcp2_37);
        button40.setOnClickListener(new View.OnClickListener() {
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
        button41 = (ImageView) v.findViewById(R.id.btcp2_38);
        button41.setOnClickListener(new View.OnClickListener() {
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
        button42 = (ImageView) v.findViewById(R.id.btcp2_39);
        button42.setOnClickListener(new View.OnClickListener() {
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
        button43 = (ImageView) v.findViewById(R.id.btcp2_40);
        button43.setOnClickListener(new View.OnClickListener() {
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
        button44 = (ImageView) v.findViewById(R.id.btcp2_41);
        button44.setOnClickListener(new View.OnClickListener() {
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
        backbutton = (ImageView) v.findViewById(R.id.btback);
        backbutton.setOnClickListener(new View.OnClickListener() {
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