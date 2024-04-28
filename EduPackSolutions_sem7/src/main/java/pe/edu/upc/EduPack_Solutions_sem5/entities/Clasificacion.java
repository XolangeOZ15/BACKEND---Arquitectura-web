package pe.edu.upc.EduPack_Solutions_sem5.entities;

import jakarta.persistence.*;

@Entity
@Table(name ="Clasificacion")
public class Clasificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClasificacion;
    @Column(name = "nombreClasificacion", length = 100, nullable = false)
    private String nombreClasificacion;

    public Clasificacion(int idClasificacion, String nombreClasificacion) {
        this.idClasificacion = idClasificacion;
        this.nombreClasificacion = nombreClasificacion;
    }

    public Clasificacion() {

    }

    public int getIdClasificacion() {
        return idClasificacion;
    }

    public void setIdClasificacion(int idClasificacion) {
        this.idClasificacion = idClasificacion;
    }

    public String getNombreClasificacion() {
        return nombreClasificacion;
    }

    public void setNombreClasificacion(String nombreClasificacion) {
        this.nombreClasificacion = nombreClasificacion;
    }

}
