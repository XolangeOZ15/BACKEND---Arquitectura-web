package pe.edu.upc.EduPack_Solutions_sem5.dtos;

import pe.edu.upc.EduPack_Solutions_sem5.entities.Clasificacion;

public class AlmacenDTO {
    private int idAlmacen;
    private int cantidadCapacidad;
    private String direccionAlmacen;
    private Clasificacion clasificacion;

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
