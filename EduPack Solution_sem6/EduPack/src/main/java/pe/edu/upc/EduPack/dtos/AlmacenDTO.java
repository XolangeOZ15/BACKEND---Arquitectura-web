package pe.edu.upc.EduPack.dtos;

import pe.edu.upc.EduPack.entities.Clasificacion;

public class AlmacenDTO {
    private int idAlmacen;
    private float capacidadAlmacen;
    private String direccionAlmacen;
     private Clasificacion clasificacion;

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
