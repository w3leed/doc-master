package com.example.waleed.vezeeta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class More_Fragment extends Fragment {

    TextView View_Enter_Login_More,View_Call_More,View_Setting_More,View_About_More;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.more_fragment, container, false);
        View_Enter_Login_More = (TextView)view.findViewById(R.id.view_enter_login_more);
        View_Call_More = (TextView)view.findViewById(R.id.view_call_more);
        View_Setting_More = (TextView)view.findViewById(R.id.view_setting_more);
        View_About_More = (TextView)view.findViewById(R.id.view_about_more);

        View_Setting_More.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(),Setting.class);
                startActivity(intent);
            }
        });
        View_Call_More.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(),CallUS.class);
                startActivity(intent);
            }
        });

        View_About_More.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(),AboutUS.class);
                startActivity(intent);
            }
        });

        View_Enter_Login_More.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(),Register.class);
                startActivity(intent);
            }
        });







        return view;
    }

}
