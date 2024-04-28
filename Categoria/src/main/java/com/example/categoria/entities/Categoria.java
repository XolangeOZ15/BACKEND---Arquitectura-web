package com.example.categoria.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idCategoria;
    @Column(name = "descripcionCategoria",length = 100,nullable = false)
    private String descripcionCategoria;



    public Categoria(){
        super();

    }

    public Categoria(int idCategoria, String descripcionCategoria) {
        this.idCategoria = idCategoria;
        this.descripcionCategoria = descripcionCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }


    }

