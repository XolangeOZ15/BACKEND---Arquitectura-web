package com.example.categoria.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idCategoria;
    @Column(name = "descripcionCategoria",length = 100, nullable = false)
    private String descripcionCategoria;
    @Column(name = "tipoCategoria",length = 100,nullable = false)
    private String tipoCategoria;



    public Categoria(){
        super();

    }

    public Categoria(int idCategoria, String descripcionCategoria, String tipoCategoria) {
        this.idCategoria = idCategoria;
        this.descripcionCategoria = descripcionCategoria;
        this.tipoCategoria = tipoCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }
}
