package com.example.android.ar;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.Vector;

public class EventosCalendario extends ListFragment {

    Vector<ComponenteEvento> eventos = new Vector<ComponenteEvento>();

    public EventosCalendario() {
        // Required empty public constructor
    }

    private static View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        eventos.add(new ComponenteEvento("TEATRO", "El Cavernicola", "13.11.2015", "20:00 HRS", "Teatro Luis Poma", "123", "231", BitmapFactory.decodeResource(getResources(), R.drawable.test), "LUNES"));
        eventos.add(new ComponenteEvento("CONCIERTO", "IRON MAIDEN", "6.3.2016", "19:00 HRS", "Estadio Jorge Magico", "896", "1187", BitmapFactory.decodeResource(getResources(), R.drawable.iron), "MARTES"));
        eventos.add(new ComponenteEvento("TORNEO", "F.I.S.T", "18.10.2015", "9:00 HRS", "CIFCO", "102", "97", BitmapFactory.decodeResource(getResources(), R.drawable.smash), "MIERCOLES"));
        eventos.add(new ComponenteEvento("CONFERENCIA", "Seguridad informática en computadoras y móviles", "12.11.2015", "8:00 HRS", "Universidad Don Bosco", "10", "184", BitmapFactory.decodeResource(getResources(), R.drawable.seguridad), "JUEVES"));
        eventos.add(new ComponenteEvento("CAPACITACION", "iOS Swift", "29.7.2015","13:00 HRS", "Teatro Luis Poma", "100", "100", BitmapFactory.decodeResource(getResources(), R.drawable.swift), "VIERNES"));
        eventos.add(new ComponenteEvento("CHARLA", "Responsabilidad Movil", "1.1.2015", "15:00 HRS", "CIFCO", "3", "75", BitmapFactory.decodeResource(getResources(), R.drawable.movil), "SABADO"));
        eventos.add(new ComponenteEvento("CONFERENCIA", "Cibercrimenes", "25.10.2015", "7:00 HRS", "DODECA", "85", "34", BitmapFactory.decodeResource(getResources(), R.drawable.crime), "DOMINGO"));
        eventos.add(new ComponenteEvento("GALERIA", "Arte contemporaneo", "4.4.2015", "16:00 HRS", "Neptune", "213", "321", BitmapFactory.decodeResource(getResources(), R.drawable.gallery), "LUNES"));
        eventos.add(new ComponenteEvento("TEATRO", "El retorno", "6.7.2015", "23:00 HRS", "Teatro theater", "999", "999", BitmapFactory.decodeResource(getResources(), R.drawable.ret), "MARTES"));

        setListAdapter(new AdaptadorCalendario(getActivity(), eventos));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = (LinearLayout) inflater.inflate(R.layout.evento_calendario, container, false);

        Spinner spinner = (Spinner) v.findViewById(R.id.spinnerCalendario);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.fechas_array, R.layout.spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        return v;
    }

    @Override
    public void onListItemClick(ListView listView, View view, int position, long id){
        super.onListItemClick(listView, view, position, id);

        Intent intent = new Intent(getContext(), EventoDetalle.class);
        startActivity(intent);

    }

}
