package com.example.tarearecycler;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String titulo;
    private String descripcion;
    private int img;

    public Usuario(String titulo, String descripcion, int imgResource) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.img = imgResource;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getImgResource() {
        return img;
    }
}