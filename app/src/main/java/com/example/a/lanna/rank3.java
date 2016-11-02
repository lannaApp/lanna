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

import java.util.ArrayList;
import java.util.List;


public class rank3 extends Fragment {
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
    private List<Score> score;
    private List<Score> name;
    private ScoreAdapter scoreAdapter;


    public rank3() {
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

        DatabaseHandler db = new DatabaseHandler(this.getActivity());
        scoreAdapter = new ScoreAdapter(this.getActivity(),db.getscore4());



    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_rank3, container, false);



        ListView listView = (ListView)v.findViewById(R.id.listView1);
        listView.setAdapter(scoreAdapter);


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

        //btback
        backButton = (ImageView) v.findViewById(R.id.btback);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rank2 rk2 = new rank2();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, rk2);
                transaction.commit();
            }
        });

        return v;

    }


}