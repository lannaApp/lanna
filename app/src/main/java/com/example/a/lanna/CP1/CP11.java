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


public class CP11 extends Fragment {
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
    private ImageView button45;
    private ImageView button46;
    private ImageView button47;
    private ImageView button48;
    private ImageView button49;
    private ImageView button50;
    private ImageView nextbutton;
    private ImageView backbutton;
    private ImageView homebutton;

    public CP11() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CP11.
     */
    // TODO: Rename and change types and number of parameters
    public static CP11 newInstance(String param1, String param2) {
        CP11 fragment = new CP11();
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
        View v = inflater.inflate(R.layout.fragment_cp11, container, false);


        //26
        button26 = (ImageView) v.findViewById(R.id.btcp1_26);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_26 cp126 = new CP1_26();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp126);
                transaction.commit();
            }
        });
        //27
        button27 = (ImageView) v.findViewById(R.id.btcp1_27);
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_27 cp127 = new CP1_27();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp127);
                transaction.commit();
            }
        });
        //28
        button28 = (ImageView) v.findViewById(R.id.btcp1_28);
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_28 cp128 = new CP1_28();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp128);
                transaction.commit();
            }
        });
        //29
        button29 = (ImageView) v.findViewById(R.id.btcp1_29);
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_29 cp129 = new CP1_29();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp129);
                transaction.commit();
            }
        });
        //30
        button30 = (ImageView) v.findViewById(R.id.btcp1_30);
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_30 cp130 = new CP1_30();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp130);
                transaction.commit();
            }
        });
        //31
        button31 = (ImageView) v.findViewById(R.id.btcp1_31);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_31 cp131 = new CP1_31();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp131);
                transaction.commit();
            }
        });
        //32
        button32 = (ImageView) v.findViewById(R.id.btcp1_32);
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_32 cp132 = new CP1_32();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp132);
                transaction.commit();
            }
        });
        //33
        button33 = (ImageView) v.findViewById(R.id.btcp1_33);
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_33 cp133 = new CP1_33();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp133);
                transaction.commit();
            }
        });
        //34
        button34 = (ImageView) v.findViewById(R.id.btcp1_34);
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_34 cp134 = new CP1_34();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp134);
                transaction.commit();
            }
        });
        //35
        button35 = (ImageView) v.findViewById(R.id.btcp1_35);
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_35 cp135 = new CP1_35();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp135);
                transaction.commit();
            }
        });

        //36
        button36 = (ImageView) v.findViewById(R.id.btcp1_36);
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_36 cp136 = new CP1_36();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp136);
                transaction.commit();
            }
        });
        //37
        button37 = (ImageView) v.findViewById(R.id.btcp1_37);
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_37 cp137 = new CP1_37();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp137);
                transaction.commit();
            }
        });
        //38
        button38 = (ImageView) v.findViewById(R.id.btcp1_38);
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_38 cp138 = new CP1_38();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp138);
                transaction.commit();
            }
        });
        //39
        button39 = (ImageView) v.findViewById(R.id.btcp1_39);
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_39 cp139 = new CP1_39();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp139);
                transaction.commit();
            }
        });
        //40
        button40 = (ImageView) v.findViewById(R.id.btcp1_40);
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_40 cp140 = new CP1_40();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp140);
                transaction.commit();
            }
        });
        //41
        button41 = (ImageView) v.findViewById(R.id.btcp1_41);
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_41 cp141 = new CP1_41();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp141);
                transaction.commit();
            }
        });
        //42
        button42 = (ImageView) v.findViewById(R.id.btcp1_42);
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_42 cp142 = new CP1_42();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp142);
                transaction.commit();
            }
        });
        //43
        button43 = (ImageView) v.findViewById(R.id.btcp1_43);
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_43 cp143 = new CP1_43();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp143);
                transaction.commit();
            }
        });
        //44
        button44 = (ImageView) v.findViewById(R.id.btcp1_44);
        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_44 cp144 = new CP1_44();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp144);
                transaction.commit();
            }
        });
        //45
        button45 = (ImageView) v.findViewById(R.id.btcp1_45);
        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_45 cp145 = new CP1_45();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp145);
                transaction.commit();
            }
        });


        //46
        button46 = (ImageView) v.findViewById(R.id.btcp1_46);
        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_46 cp146 = new CP1_46();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp146);
                transaction.commit();
            }
        });
        //47
        button47 = (ImageView) v.findViewById(R.id.btcp1_47);
        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_47 cp147 = new CP1_47();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp147);
                transaction.commit();
            }
        });
        //48
        button48 = (ImageView) v.findViewById(R.id.btcp1_48);
        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_48 cp148 = new CP1_48();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp148);
                transaction.commit();
            }
        });
        //49
        button49 = (ImageView) v.findViewById(R.id.btcp1_49);
        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_49 cp149 = new CP1_49();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp149);
                transaction.commit();
            }
        });
        //50
        button50 = (ImageView) v.findViewById(R.id.btcp1_50);
        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1_50 cp150 = new CP1_50();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp150);
                transaction.commit();
            }
        });

        //btnext
        nextbutton = (ImageView) v.findViewById(R.id.btnext);
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP111 cp111 = new CP111();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp111);
                transaction.commit();
            }
        });

        //btback
        backbutton = (ImageView) v.findViewById(R.id.btback);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP1 cp1 = new CP1();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp1);
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
