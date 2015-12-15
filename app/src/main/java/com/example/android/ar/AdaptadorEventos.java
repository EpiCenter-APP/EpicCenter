package com.example.android.ar;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Vector;

/**
 * Created by Android on 11/13/2015.
 */
public class AdaptadorEventos extends BaseAdapter {

    private final Activity activity;
    private final Vector<ComponenteEvento> list;

    public AdaptadorEventos(Activity activity, Vector<ComponenteEvento> list) {
        super();
        this.activity = activity;
        this.list = list;

    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = activity.getLayoutInflater();

        View view = inflater.inflate(R.layout.evento_list_item, null, true);

        ImageView preview = (ImageView) view.findViewById(R.id.imageList);
        preview.setImageBitmap(list.elementAt(position).getImage());

        TextView tipo = (TextView) view.findViewById(R.id.tipoEvento);
        tipo.setText(list.elementAt(position).getTipoEvento());

        TextView nombre = (TextView) view.findViewById(R.id.nombreEvento);
        nombre.setText(list.elementAt(position).getNombreEvento());

        TextView fecha = (TextView) view.findViewById(R.id.eventoFecha);
        fecha.setText(list.elementAt(position).getFechaEvento());

        TextView ubicacion = (TextView) view.findViewById(R.id.eventoLocalizacion);
        ubicacion.setText(list.elementAt(position).getLugarEvento());

        TextView comentarios = (TextView) view.findViewById(R.id.eventoComentario);
        comentarios.setText(list.elementAt(position).getComentarioEvento());

        TextView likes = (TextView) view.findViewById(R.id.eventoLike);
        likes.setText(list.elementAt(position).getLikesEvento());

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
