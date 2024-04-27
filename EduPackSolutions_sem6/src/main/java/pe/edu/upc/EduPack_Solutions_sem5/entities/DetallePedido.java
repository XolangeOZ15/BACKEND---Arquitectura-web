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
    private double cantidadPedido;
    @Column(name = "precioUnitario",nullable = false)
    private double precioUnitario;
    @Column(name = "subtotalPedido",nullable = false)
    private double subtotalPedido;
    @ManyToOne
    @JoinColumn(name="idPedido")
    private Pedido pedido;
    @ManyToOne
    @JoinColumn(name="idProducto")
    private Producto producto;

    public DetallePedido() {
    }

    public DetallePedido(int idDetallePedido, String estadoPedido, double cantidadPedido, double precioUnitario, double subtotalPedido, Pedido pedido, Producto producto) {
        this.idDetallePedido = idDetallePedido;
        this.estadoPedido = estadoPedido;
        this.cantidadPedido = cantidadPedido;
        this.precioUnitario = precioUnitario;
        this.subtotalPedido = subtotalPedido;
        this.pedido = pedido;
        this.producto = producto;
    }


}
