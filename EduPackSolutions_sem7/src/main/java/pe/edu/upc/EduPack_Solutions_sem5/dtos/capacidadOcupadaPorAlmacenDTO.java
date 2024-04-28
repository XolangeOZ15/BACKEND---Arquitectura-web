package pe.edu.upc.EduPack_Solutions_sem5.dtos;

public class capacidadOcupadaPorAlmacenDTO {
    private int idAlmacen;
    private int stockProducto;
    private String nombreClasificacion;
    private int cantidadProducto;
    private int capacidadAlmacen;
    private int idProducto;

    public int getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        stockProducto = stockProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public capacidadOcupadaPorAlmacenDTO() {
    }

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public String getNombreClasificacion() {
        return nombreClasificacion;
    }

    public void setNombreClasificacion(String nombreClasificacion) {
        this.nombreClasificacion = nombreClasificacion;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int getCapacidadAlmacen() {
        return capacidadAlmacen;
    }

    public void setCapacidadAlmacen(int capacidadAlmacen) {
        this.capacidadAlmacen = capacidadAlmacen;
    }
}
