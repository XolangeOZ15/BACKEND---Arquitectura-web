package pe.edu.upc.EduPack.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "Almacen")
public class Almacen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAlmacen;

    @Column(name = "capacidadAlmacen", nullable = false)
    private float capacidadAlmacen;

    @Column(name = "direccionAlmacen", length = 300, nullable = false)
    private String direccionAlmacen;
    @ManyToOne
    @JoinColumn(name = "idClasificacion")
    private Clasificacion clasificacion;

   public Almacen(){
        super();
    }

    public Almacen(int idAlmacen, float capacidadAlmacen, String direccionAlmacen, Clasificacion clasificacion) {
        this.idAlmacen = idAlmacen;
        this.capacidadAlmacen = capacidadAlmacen;
        this.direccionAlmacen = direccionAlmacen;
        this.clasificacion = clasificacion;
    }

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public float getCapacidadAlmacen() {
        return capacidadAlmacen;
    }

    public void setCapacidadAlmacen(float capacidadAlmacen) {
        this.capacidadAlmacen = capacidadAlmacen;
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

