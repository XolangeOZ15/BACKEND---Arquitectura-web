package pe.edu.upc.EduPack_Solutions_sem5.entities;
import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "Pedido")
public class Pedido {
	
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int idPedido;
 
 @Column(name = "nombrePedido",length = 30,nullable = false)
 private String nombrePedido;
 @Column(name = "totalPedido",nullable = false)
 private double totalPedido;
 @Column(name = "fechaPedido",nullable = false)
 private LocalDate fechaPedido;
 @ManyToOne
 @JoinColumn(name = "id")
 private Usuario usuario;



 public Pedido() {
	super();
	// TODO Auto-generated constructor stub
 }

	public Pedido(int idPedido, String nombrePedido, double totalPedido, LocalDate fechaPedido, Usuario usuario) {
		this.idPedido = idPedido;
		this.nombrePedido = nombrePedido;
		this.totalPedido = totalPedido;
		this.fechaPedido = fechaPedido;
		this.usuario = usuario;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public String getNombrePedido() {
		return nombrePedido;
	}

	public void setNombrePedido(String nombrePedido) {
		this.nombrePedido = nombrePedido;
	}

	public double getTotalPedido() {
		return totalPedido;
	}

	public void setTotalPedido(double totalPedido) {
		this.totalPedido = totalPedido;
	}

	public LocalDate getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(LocalDate fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
