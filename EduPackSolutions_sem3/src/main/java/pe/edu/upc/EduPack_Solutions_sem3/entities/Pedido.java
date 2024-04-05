package pe.edu.upc.EduPack_Solutions_sem3.entities;
import jakarta.persistence.*;


@Entity
@Table(name = "Pedido")
public class Pedido {
	
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int idPedido;
 
 @Column(name = "nombrePedido",length = 30,nullable = false)
 private String nombrePedido;
 
 @Column(name = "cantidadPedido",nullable = false)
 private int cantidadPedido;
 
 @Column(name = "estadoPedido",length = 20,nullable = false)
 private String estadoPedido;

 //me faltan las 2 FK de modelo y usuario

 public Pedido() {
	super();
	// TODO Auto-generated constructor stub
 }

	public Pedido(int idPedido, String nombrePedido, int cantidadPedido, String estadoPedido) {
		this.idPedido = idPedido;
		this.nombrePedido = nombrePedido;
		this.cantidadPedido = cantidadPedido;
		this.estadoPedido = estadoPedido;
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

	public int getCantidadPedido() {
		return cantidadPedido;
	}

	public void setCantidadPedido(int cantidadPedido) {
		this.cantidadPedido = cantidadPedido;
	}

	public String getEstadoPedido() {
		return estadoPedido;
	}

	public void setEstadoPedido(String estadoPedido) {
		this.estadoPedido = estadoPedido;
	}
}
