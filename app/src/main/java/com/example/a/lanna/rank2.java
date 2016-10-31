package com.example.a.lanna;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;


public class rank2 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ImageView backButton;
    private listview_row adapter;
    private ImageView homeButton;
    private ImageView nextButton;


    public rank2() {
        // Required empty public constructor
    }


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fmrank.
     */
    // TODO: Rename and change types and number of parameters
    public static Fmrank newInstance(String param1, String param2) {
        Fmrank fragment = new Fmrank();
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

        String[] nameUser = { "เจ", "กอล์ฟ", "นก", "แทน", "ชล"
                , "หนึ่ง", "Sephiroth", "Tifa", "Vincent ", "Yuffie "};

        String[] score = { "1" , "2" , "3" , "4" , "5"
                , "6" , "7" , "8" , "9" , "10" };

        adapter = new listview_row(this.getActivity(), nameUser, score);





    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_rank2, container, false);



        ListView listView = (ListView)v.findViewById(R.id.listView1);
        listView.setAdapter(adapter);


        //bthome
        homeButton = (ImageView) v.findViewById(R.id.bthome);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mainmanu firstpage = new mainmanu();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, firstpage);
                transaction.commit();
            }
        });


        //btnext
        nextButton = (ImageView) v.findViewById(R.id.btnext);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rank3 rk3 = new rank3();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, rk3);
                transaction.commit();
            }
        });


        //btback
        backButton = (ImageView) v.findViewById(R.id.btback);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rank1 rk1 = new rank1();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, rk1);
                transaction.commit();
            }
        });

        return v;

    }


}