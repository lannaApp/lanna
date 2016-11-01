package com.example.a.lanna.EX4;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.a.lanna.R;


public class EX4_false extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ImageView newImageView;
    private int show;
    private double total;

    public EX4_false() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EX4_false.
     */
    // TODO: Rename and change types and number of parameters
    public static EX4_false newInstance(String param1, String param2) {
        EX4_false fragment = new EX4_false();
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
        View v = inflater.inflate(R.layout.fragment_ex4_false, container, false);






        if (mParam1 == "1") {

            newImageView = (ImageView) v.findViewById(R.id.btonclick);
            newImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    EX4_2 ex = EX4_2.newInstance(mParam1,mParam2);
                    FragmentManager manager = getActivity().getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.fragment_container, ex);
                    transaction.commit();

                }
            });

        } else if (mParam1 == "2") {

            newImageView = (ImageView) v.findViewById(R.id.btonclick);
            newImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    EX4_3 ex = EX4_3.newInstance(mParam1,mParam2);
                    FragmentManager manager = getActivity().getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.fragment_container, ex);
                    transaction.commit();

                }
            });


        } else if (mParam1 == "3") {

            newImageView = (ImageView) v.findViewById(R.id.btonclick);
            newImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    EX4_4 ex = EX4_4.newInstance(mParam1,mParam2);
                    FragmentManager manager = getActivity().getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.fragment_container, ex);
                    transaction.commit();

                }
            });


        } else if (mParam1 == "4") {

            newImageView = (ImageView) v.findViewById(R.id.btonclick);
            newImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    EX4_5 ex = EX4_5.newInstance(mParam1,mParam2);
                    FragmentManager manager = getActivity().getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.fragment_container, ex);
                    transaction.commit();

                }
            });


        } else if (mParam1 == "5") {

            newImageView = (ImageView) v.findViewById(R.id.btonclick);
            newImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    EX4_6 ex = EX4_6.newInstance(mParam1,mParam2);
                    FragmentManager manager = getActivity().getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.fragment_container, ex);
                    transaction.commit();

                }
            });


        } else if (mParam1 == "6") {

            newImageView = (ImageView) v.findViewById(R.id.btonclick);
            newImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    EX4_7 ex = EX4_7.newInstance(mParam1,mParam2);
                    FragmentManager manager = getActivity().getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.fragment_container, ex);
                    transaction.commit();

                }
            });


        } else if (mParam1 == "7") {

            newImageView = (ImageView) v.findViewById(R.id.btonclick);
            newImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    EX4_8 ex = EX4_8.newInstance(mParam1,mParam2);
                    FragmentManager manager = getActivity().getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.fragment_container, ex);
                    transaction.commit();

                }
            });


        } else if (mParam1 == "8") {

            newImageView = (ImageView) v.findViewById(R.id.btonclick);
            newImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    EX4_9 ex = EX4_9.newInstance(mParam1,mParam2);
                    FragmentManager manager = getActivity().getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.fragment_container, ex);
                    transaction.commit();

                }
            });


        } else if (mParam1 == "9") {

            newImageView = (ImageView) v.findViewById(R.id.btonclick);
            newImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    EX4_10 ex = EX4_10.newInstance(mParam1,mParam2);
                    FragmentManager manager = getActivity().getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.fragment_container, ex);
                    transaction.commit();

                }
            });


        } else if (mParam1 == "10") {


            total=Double.parseDouble(mParam2);

            show= (int) Math.log10(total);

            if (show < 4) {

                mParam1= String.valueOf(show);

                newImageView = (ImageView) v.findViewById(R.id.btonclick);
                newImageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {



                        EX4_end ex = EX4_end.newInstance(mParam1, mParam2);
                        FragmentManager manager = getActivity().getSupportFragmentManager();
                        FragmentTransaction transaction = manager.beginTransaction();
                        transaction.replace(R.id.fragment_container, ex);
                        transaction.commit();

                    }
                });
            }else if (show < 8){

                mParam1= String.valueOf(show);

                newImageView = (ImageView) v.findViewById(R.id.btonclick);
                newImageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        EX4_end1 ex = EX4_end1.newInstance(mParam1, mParam2);
                        FragmentManager manager = getActivity().getSupportFragmentManager();
                        FragmentTransaction transaction = manager.beginTransaction();
                        transaction.replace(R.id.fragment_container, ex);
                        transaction.commit();

                    }
                });

            }else {

                mParam1= String.valueOf(show);

                newImageView = (ImageView) v.findViewById(R.id.btonclick);
                newImageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {



                        EX4_end2 ex = EX4_end2.newInstance(mParam1, mParam2);
                        FragmentManager manager = getActivity().getSupportFragmentManager();
                        FragmentTransaction transaction = manager.beginTransaction();
                        transaction.replace(R.id.fragment_container, ex);
                        transaction.commit();

                    }
                });

            }

        }


        return v;
    }
}
