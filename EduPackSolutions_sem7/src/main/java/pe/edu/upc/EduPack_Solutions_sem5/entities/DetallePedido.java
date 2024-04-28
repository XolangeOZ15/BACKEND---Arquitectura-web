package pe.edu.upc.EduPack_Solutions_sem5.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "DetallePedido")
public class DetallePedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetallePedido;
    @Column(name = "estadoPedido", length = 20,nullable = false)
    private String estadoPedido;
    @Column(name = "cantidadPedido",nullable = false)
    private Integer cantidadPedido;
    @Column(name = "precioUnitario",nullable = false)
    private double precioUnitario;
    @Column(name = "subtotalPedido")
    private double subtotalPedido;
    @ManyToOne
    @JoinColumn(name="idPedido")
    private Pedido pedido;
    @ManyToOne
    @JoinColumn(name="idProducto")
    private Producto producto;

    public DetallePedido() {
    }

    public DetallePedido(int idDetallePedido, String estadoPedido, Integer cantidadPedido, double precioUnitario, double subtotalPedido, Pedido pedido, Producto producto) {
        this.idDetallePedido = idDetallePedido;
        this.estadoPedido = estadoPedido;
        this.cantidadPedido = cantidadPedido;
        this.precioUnitario = precioUnitario;
        this.subtotalPedido = subtotalPedido;
        this.pedido = pedido;
        this.producto = producto;
    }

    public int getIdDetallePedido() {
        return idDetallePedido;
    }

    public void setIdDetallePedido(int idDetallePedido) {
        this.idDetallePedido = idDetallePedido;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public int getCantidadPedido() {
        return cantidadPedido;
    }

    public void setCantidadPedido(int cantidadPedido) {
        this.cantidadPedido = cantidadPedido;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getSubtotalPedido() {
        return subtotalPedido;
    }

    public void setSubtotalPedido(double subtotalPedido) {
        this.subtotalPedido = subtotalPedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
