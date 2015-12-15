package com.example.android.ar;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.Vector;

public class AdaptadorCalendario extends BaseAdapter {

    private final Activity activity;
    private final Vector<ComponenteEvento> list;

    public AdaptadorCalendario(Activity activity, Vector<ComponenteEvento> list) {
        super();
        this.activity = activity;
        this.list = list;

    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = activity.getLayoutInflater();

        View view = inflater.inflate(R.layout.evento_list_item_2, null, true);

        TextView dia = (TextView) view.findViewById(R.id.dia);
        dia.setText(list.elementAt(position).getDia());

        TextView fecha = (TextView) view.findViewById(R.id.fecha);
        fecha.setText(list.elementAt(position).getFechaEvento());

        TextView tipo = (TextView) view.findViewById(R.id.tipo);
        tipo.setText(list.elementAt(position).getTipoEvento());

        TextView nombre = (TextView) view.findViewById(R.id.nombre);
        nombre.setText(list.elementAt(position).getNombreEvento());

        TextView hora = (TextView) view.findViewById(R.id.hora);
        hora.setText(list.elementAt(position).getHoraEvento());

        return view;

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.elementAt(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

}
