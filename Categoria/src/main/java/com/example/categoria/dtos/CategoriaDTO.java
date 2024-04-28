package com.example.categoria.dtos;

import jakarta.persistence.Column;

public class CategoriaDTO {

    private  int idCategoria;

    private String descripcionCategoria;

    public int getIdCategoria() {
        return idCategoria;


    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getTipoCategoria() {
        return descripcionCategoria;
    }


}
