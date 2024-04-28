package pe.edu.upc.EduPack_Solutions_sem5.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Modelo")
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idModelo;
    @Column(name = "nombreModelo",length = 100, nullable = false)
    private String nombreModelo;

    public Modelo(){
        super();

    }

    public Modelo(int idModelo, String nombreModelo) {
        this.idModelo = idModelo;
        this.nombreModelo = nombreModelo;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

}
