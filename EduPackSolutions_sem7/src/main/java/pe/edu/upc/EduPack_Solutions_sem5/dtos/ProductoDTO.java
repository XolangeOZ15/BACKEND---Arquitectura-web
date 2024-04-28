package pe.edu.upc.EduPack_Solutions_sem5.dtos;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.EduPack_Solutions_sem5.entities.Almacen;
import pe.edu.upc.EduPack_Solutions_sem5.entities.Modelo;
import pe.edu.upc.EduPack_Solutions_sem5.entities.TipoProducto;

public class ProductoDTO {
    private int idProducto;
    private String nombreProducto;
    private String marcaProducto;
    private double precioProducto;
    private int stockProducto;
    private Modelo modelo;
    private Almacen almacen;
    private TipoProducto tipoProducto;
    private double montoTotal;
    private Integer cantidadMarcas;

    public Integer getCantidadMarcas() {
        return cantidadMarcas;
    }

    public void setCantidadMarcas(Integer cantidadMarcas) {
        this.cantidadMarcas = cantidadMarcas;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
}
