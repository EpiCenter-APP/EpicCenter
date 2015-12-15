package com.example.android.ar;

import android.graphics.Bitmap;

public class ComponenteEvento {

    private String tipoEvento;
    private String nombreEvento;
    private String fechaEvento;
    private String horaEvento;
    private String lugarEvento;
    private String likesEvento;
    private String comentarioEvento;
    private Bitmap image;
    private String dia;

    public ComponenteEvento(String tipoEvento, String nombreEvento, String fechaEvento, String horaEvento, String lugarEvento, String likesEvento, String comentarioEvento, Bitmap image, String dia) {
        this.tipoEvento = tipoEvento;
        this.nombreEvento = nombreEvento;
        this.fechaEvento = fechaEvento;
        this.setHoraEvento(horaEvento);
        this.lugarEvento = lugarEvento;
        this.likesEvento = likesEvento;
        this.comentarioEvento = comentarioEvento;
        this.image = image;
        this.setDia(dia);

    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(String fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getLugarEvento() {
        return lugarEvento;
    }

    public void setLugarEvento(String lugarEvento) {
        this.lugarEvento = lugarEvento;
    }

    public String getLikesEvento() {
        return likesEvento;
    }

    public void setLikesEvento(String likesEvento) {
        this.likesEvento = likesEvento;
    }

    public String getComentarioEvento() {
        return comentarioEvento;
    }

    public void setComentarioEvento(String comentarioEvento) {
        this.comentarioEvento = comentarioEvento;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public String getHoraEvento() {
        return horaEvento;
    }

    public void setHoraEvento(String horaEvento) {
        this.horaEvento = horaEvento;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
}
