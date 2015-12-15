package com.example.android.ar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/**
 * Created by Android on 11/13/2015.
 */
public class EventosMes extends Fragment {

    public EventosMes() {
        // Required empty public constructor
    }

    private static View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.content_evento_mes, container, false);

        //return inflater.inflate(R.layout.content_evento_mes, container, false);

        return view;
    }

}
