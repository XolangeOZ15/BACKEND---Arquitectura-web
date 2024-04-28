package pe.edu.upc.EduPack_Solutions_sem5.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;
    @Column(name = "nombreProducto", length = 30, nullable = false)
    private String nombreProducto;
    @Column(name = "marcaProducto", length = 30, nullable = false)
    private String marcaProducto;
    @Column(name = "precioProducto", nullable = false)
    private double precioProducto;
    @Column(name = "stockProducto", nullable = false)
    private int stockProducto;
    @ManyToOne
    @JoinColumn(name="idCategoria")
    private Categoria categoria;
    @ManyToOne
    @JoinColumn(name="idModelo")
    private Modelo modelo;
    @ManyToOne
    @JoinColumn(name="idAlmacen")
    private Almacen almacen;
    @ManyToOne
    @JoinColumn(name="idTipoProducto")
    private TipoProducto tipoProducto;

    public Producto() {
    }

    public Producto(int idProducto, String nombreProducto, String marcaProducto, double precioProducto, int stockProducto, Categoria categoria, Modelo modelo, Almacen almacen, TipoProducto tipoProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.marcaProducto = marcaProducto;
        this.precioProducto = precioProducto;
        this.stockProducto = stockProducto;
        this.categoria = categoria;
        this.modelo = modelo;
        this.almacen = almacen;
        this.tipoProducto = tipoProducto;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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
