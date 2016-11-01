package com.example.a.lanna.CP1;

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


public class CP111 extends Fragment {
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
    private ImageView button21;
    private ImageView button22;
    private ImageView button23;
    private ImageView button24;
    private ImageView button25;
    private ImageView button26;
    private ImageView backbutton;
    private ImageView homebutton;

    public CP111() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CP111.
     */
    // TODO: Rename and change types and number of parameters
    public static CP111 newInstance(String param1, String param2) {
        CP111 fragment = new CP111();
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
        View v = inflater.inflate(R.layout.fragment_cp111, container, false);


        //51
        button11 = (ImageView) v.findViewById(R.id.btcp1_51);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_51 cp151 = new CP1_51();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp151);
                transaction.commit();
            }
        });
        //52
        button12 = (ImageView) v.findViewById(R.id.btcp1_52);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_52 cp152 = new CP1_52();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp152);
                transaction.commit();
            }
        });
        //53
        button13 = (ImageView) v.findViewById(R.id.btcp1_53);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_53 cp153 = new CP1_53();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp153);
                transaction.commit();
            }
        });
        //54
        button14 = (ImageView) v.findViewById(R.id.btcp1_54);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_54 cp154 = new CP1_54();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp154);
                transaction.commit();
            }
        });
        //55
        button15 = (ImageView) v.findViewById(R.id.btcp1_55);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_55 cp155 = new CP1_55();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp155);
                transaction.commit();
            }
        });
        //56
        button16 = (ImageView) v.findViewById(R.id.btcp1_56);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_56 cp156 = new CP1_56();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp156);
                transaction.commit();
            }
        });
        //57
        button17 = (ImageView) v.findViewById(R.id.btcp1_57);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_57 cp157 = new CP1_57();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp157);
                transaction.commit();
            }
        });
        //58
        button18 = (ImageView) v.findViewById(R.id.btcp1_58);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_58 cp158 = new CP1_58();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp158);
                transaction.commit();
            }
        });
        //59
        button19 = (ImageView) v.findViewById(R.id.btcp1_59);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_59 cp159 = new CP1_59();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp159);
                transaction.commit();
            }
        });
        //60
        button20 = (ImageView) v.findViewById(R.id.btcp1_60);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_60 cp160 = new CP1_60();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp160);
                transaction.commit();
            }
        });

        //61
        button21 = (ImageView) v.findViewById(R.id.btcp1_61);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_61 cp161 = new CP1_61();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp161);
                transaction.commit();
            }
        });
        //62
        button22 = (ImageView) v.findViewById(R.id.btcp1_62);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_62 cp162 = new CP1_62();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp162);
                transaction.commit();
            }
        });
        //63
        button23 = (ImageView) v.findViewById(R.id.btcp1_63);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_63 cp163 = new CP1_63();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp163);
                transaction.commit();
            }
        });
        //64
        button24 = (ImageView) v.findViewById(R.id.btcp1_64);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_64 cp164 = new CP1_64();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp164);
                transaction.commit();
            }
        });
        //65
        button25 = (ImageView) v.findViewById(R.id.btcp1_65);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_65 cp165 = new CP1_65();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp165);
                transaction.commit();
            }
        });
        //66
        button26 = (ImageView) v.findViewById(R.id.btcp1_66);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_66 cp166 = new CP1_66();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp166);
                transaction.commit();
            }
        });

        //btback
        backbutton = (ImageView) v.findViewById(R.id.btback);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP11 cp11 = new CP11();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp11);
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
