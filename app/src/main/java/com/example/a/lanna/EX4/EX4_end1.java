package com.example.a.lanna.EX4;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a.lanna.FmGametest;
import com.example.a.lanna.R;


public class EX4_end1 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ImageView newImageView;
    private EditText setname;
    private String getname;

    public EX4_end1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EX4_end1.
     */
    // TODO: Rename and change types and number of parameters
    public static EX4_end1 newInstance(String param1, String param2) {
        EX4_end1 fragment = new EX4_end1();
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
        View v = inflater.inflate(R.layout.fragment_ex4_end1, container, false);


        TextView textView = (TextView) v.findViewById(R.id.sc);
        textView.setText(mParam1);

        setname = (EditText) v.findViewById(R.id.nameuser);


        //btok
        newImageView = (ImageView) v.findViewById(R.id.btok);
        newImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getname = setname.getText().toString();

                if (getname.equals("")) {
                    Toast.makeText(getActivity(), "กรุณากรอกชื่อ !!", Toast.LENGTH_LONG).show();

                }else {
                    System.out.println(mParam1);
                    System.out.println(getname);

                    Save4 save = Save4.newInstance(getname, mParam1);
                    FragmentManager manager = getActivity().getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.fragment_container, save);
                    transaction.commit();

                }

            }
        });


        return v;
    }
}
