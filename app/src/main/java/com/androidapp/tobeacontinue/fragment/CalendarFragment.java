package com.androidapp.tobeacontinue.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.androidapp.tobeacontinue.R;
import com.androidapp.tobeacontinue.Todolist.CalendarTodolist;


public class CalendarFragment extends Fragment {


    ImageView calendarButton;
    public CalendarFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calendar, container, false);

        calendarButton = view.findViewById(R.id.calendarButton);

        calendarButton.setOnClickListener(new View.OnClickListener() {                       //버튼이 클릭시 Todolist 액티비티로 넘어가게 하였음
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CalendarTodolist.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
