package pe.edu.upc.tipoproducto.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "TipoProducto")
public class TipoProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoProducto;
    @Column(name = "descripcionTipoProducto", length = 100, nullable = false)
    private String descripcionTipoProducto;

    public TipoProducto() {
    }

    public TipoProducto(int idTipoProducto, String descripcionTipoProducto){
        this.idTipoProducto = idTipoProducto;
        this.descripcionTipoProducto = descripcionTipoProducto;
    }

    public int getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(int idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public String getDescripcionTipoProducto() {
        return descripcionTipoProducto;
    }

    public void setDescripcionTipoProducto(String descripcionTipoProducto) {
        this.descripcionTipoProducto = descripcionTipoProducto;
    }
}
