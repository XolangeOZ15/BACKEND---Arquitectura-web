package pe.edu.upc.EduPack_Solutions_sem5.dtos;

public class CategoriaDTO {
    private  int idCategoria;

    private String descripcionCategoria;
    private Integer cantidad_de_categorias;

    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getCantidad_de_categorias() {
        return cantidad_de_categorias;
    }

    public void setCantidad_de_categorias(Integer cantidad_de_categorias) {
        this.cantidad_de_categorias = cantidad_de_categorias;
    }
}
