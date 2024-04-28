package pe.edu.upc.EduPack_Solutions_sem5.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Almacen")
public class Almacen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAlmacen;

    @Column(name = "cantidadCapacidad", nullable = false)
    private int cantidadCapacidad;

    @Column(name = "direccionAlmacen", length = 300, nullable = false)
    private String direccionAlmacen;
    @ManyToOne
    @JoinColumn(name = "idClasificacion")
    private Clasificacion clasificacion;

    public Almacen(){
        super();
    }

    public Almacen(int idAlmacen, int cantidadCapacidad, String direccionAlmacen, Clasificacion clasificacion) {
        this.idAlmacen = idAlmacen;
        this.cantidadCapacidad = cantidadCapacidad;
        this.direccionAlmacen = direccionAlmacen;
        this.clasificacion = clasificacion;
    }

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public int getCapacidadAlmacen() {
        return cantidadCapacidad;
    }

    public void setCapacidadAlmacen(int capacidadAlmacen) {
        this.cantidadCapacidad = capacidadAlmacen;
    }

    public String getDireccionAlmacen() {
        return direccionAlmacen;
    }

    public void setDireccionAlmacen(String direccionAlmacen) {
        this.direccionAlmacen = direccionAlmacen;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

}
