<<<<<<< HEAD
package com.example.categoria.dtos;

import jakarta.persistence.Column;

public class CategoriaDTO {

    private  int idCategoria;

    private String descripcionCategoria;

    private String tipoCategoria;

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
=======
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
>>>>>>> feature/crud-categoria
