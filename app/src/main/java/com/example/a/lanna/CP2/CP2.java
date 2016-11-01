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


public class CP2 extends Fragment {
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
    private ImageView nextButton;
    private ImageView homeButton;


    public CP2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CP2.
     */
    // TODO: Rename and change types and number of parameters
    public static CP2 newInstance(String param1, String param2) {
        CP2 fragment = new CP2();
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
        View v = inflater.inflate(R.layout.fragment_cp2, container, false);


        //1
        button26 = (ImageView) v.findViewById(R.id.btcp2_1);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_1 cp21 = new CP2_1();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp21);
                transaction.commit();
            }
        });
        //2
        button27 = (ImageView) v.findViewById(R.id.btcp2_2);
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_2 cp22 = new CP2_2();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp22);
                transaction.commit();
            }
        });
        //3
        button28 = (ImageView) v.findViewById(R.id.btcp2_3);
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_3 cp23 = new CP2_3();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp23);
                transaction.commit();
            }
        });
        //4
        button29 = (ImageView) v.findViewById(R.id.btcp2_4);
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_4 cp24 = new CP2_4();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp24);
                transaction.commit();
            }
        });
        //5
        button30 = (ImageView) v.findViewById(R.id.btcp2_5);
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_5 cp25 = new CP2_5();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp25);
                transaction.commit();
            }
        });
        //6
        button31 = (ImageView) v.findViewById(R.id.btcp2_6);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_6 cp26 = new CP2_6();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp26);
                transaction.commit();
            }
        });
        //7
        button32 = (ImageView) v.findViewById(R.id.btcp2_7);
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_7 cp27 = new CP2_7();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp27);
                transaction.commit();
            }
        });
        //8
        button33 = (ImageView) v.findViewById(R.id.btcp2_8);
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_8 cp28 = new CP2_8();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp28);
                transaction.commit();
            }
        });
        //9
        button34 = (ImageView) v.findViewById(R.id.btcp2_9);
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_9 cp29 = new CP2_9();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp29);
                transaction.commit();
            }
        });
        //10
        button35 = (ImageView) v.findViewById(R.id.btcp2_10);
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_10 cp210 = new CP2_10();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp210);
                transaction.commit();
            }
        });

        //11
        button36 = (ImageView) v.findViewById(R.id.btcp2_11);
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_11 cp211 = new CP2_11();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp211);
                transaction.commit();
            }
        });
        //12
        button37 = (ImageView) v.findViewById(R.id.btcp2_12);
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_12 cp212 = new CP2_12();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp212);
                transaction.commit();
            }
        });
        //13
        button38 = (ImageView) v.findViewById(R.id.btcp2_13);
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_13 cp213 = new CP2_13();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp213);
                transaction.commit();
            }
        });
        //14
        button39 = (ImageView) v.findViewById(R.id.btcp2_14);
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_14 cp214 = new CP2_14();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp214);
                transaction.commit();
            }
        });
        //15
        button40 = (ImageView) v.findViewById(R.id.btcp2_15);
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_15 cp215 = new CP2_15();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp215);
                transaction.commit();
            }
        });
        //16
        button41 = (ImageView) v.findViewById(R.id.btcp2_16);
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_16 cp216 = new CP2_16();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp216);
                transaction.commit();
            }
        });
        //17
        button42 = (ImageView) v.findViewById(R.id.btcp2_17);
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_17 cp217 = new CP2_17();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp217);
                transaction.commit();
            }
        });
        //18
        button43 = (ImageView) v.findViewById(R.id.btcp2_18);
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_18 cp218 = new CP2_18();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp218);
                transaction.commit();
            }
        });
        //19
        button44 = (ImageView) v.findViewById(R.id.btcp2_19);
        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_19 cp219 = new CP2_19();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp219);
                transaction.commit();
            }
        });
        //20
        button45 = (ImageView) v.findViewById(R.id.btcp2_20);
        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_20 cp220 = new CP2_20();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp220);
                transaction.commit();
            }
        });


        //21
        button46 = (ImageView) v.findViewById(R.id.btcp2_21);
        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_21 cp221 = new CP2_21();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp221);
                transaction.commit();
            }
        });
        //22
        button47 = (ImageView) v.findViewById(R.id.btcp2_22);
        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP2_22 cp222 = new CP2_22();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp222);
                transaction.commit();
            }
        });


        //btnext
        nextButton = (ImageView) v.findViewById(R.id.btnext);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CP21 cp21 = new CP21();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, cp21);
                transaction.commit();
            }
        });

        //bthome
        homeButton = (ImageView) v.findViewById(R.id.bthome);
        homeButton.setOnClickListener(new View.OnClickListener() {
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
