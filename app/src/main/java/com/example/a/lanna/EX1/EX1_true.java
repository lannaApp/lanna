package com.example.a.lanna.EX1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.a.lanna.R;


public class EX1_true extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ImageView newImageView;
    private double total;
    private int show;


    public EX1_true() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EX1_true.
     */
    // TODO: Rename and change types and number of parameters
    public static EX1_true newInstance(String param1, String param2) {
        EX1_true fragment = new EX1_true();
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
        View v = inflater.inflate(R.layout.fragment_ex1_true, container, false);




        if (mParam1 == "1") {

            newImageView = (ImageView) v.findViewById(R.id.btonclick);
            newImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    EX1_2 ex = EX1_2.newInstance(mParam1,mParam2+"0");
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


                    EX1_3 ex = EX1_3.newInstance(mParam1,mParam2+"0");
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


                    EX1_4 ex = EX1_4.newInstance(mParam1,mParam2+"0");
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


                    EX1_5 ex = EX1_5.newInstance(mParam1,mParam2+"0");
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


                    EX1_6 ex = EX1_6.newInstance(mParam1,mParam2+"0");
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


                    EX1_7 ex = EX1_7.newInstance(mParam1,mParam2+"0");
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


                    EX1_8 ex = EX1_8.newInstance(mParam1,mParam2+"0");
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


                    EX1_9 ex = EX1_9.newInstance(mParam1,mParam2+"0");
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


                    EX1_10 ex = EX1_10.newInstance(mParam1,mParam2+"0");
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



                        EX1_end ex = EX1_end.newInstance(mParam1, mParam2);
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


                        EX1_end1 ex = EX1_end1.newInstance(mParam1, mParam2);
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



                        EX1_end2 ex = EX1_end2.newInstance(mParam1, mParam2);
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
