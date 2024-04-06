package upc.edu.pe.Usuario.entities;
import jakarta.persistence.*;
@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(name = "nombreUsuario",length = 35,nullable = false)
    private String nombreUsuario;

    @Column(name = "fechaUsuario",length = 38,nullable = false)
    private String fechaUsuario;

    @Column(name = "correoUsuario",length = 40,nullable = false)
    private String correoUsuario;

    @Column(name = "contraseñaUsuario",nullable = false)
    private String contraseñaUsuario;

    public Usuario() {
        super();
        // TODO Auto-generated constructor stub
    }
}
public Usuario(int idUsuario, String nombreUsuario, String fechaUsuario, String correoUsuario,
               String contraseñaUsuario) {
    super();
    this.idUsuario = idUsuario;
    this.nombreUsuario = nombreUsuario;
    this.fechaUsuario = fechaUsuario;
    this.correoUsuario = correoUsuario;
    this.contraseñaUsuario = contraseñaUsuario;
}
public int getIdUsuario() {
    return idUsuario;
}

public void setIdUsuario(int idUsuario) {
    this.idUsuario = idUsuario;
}

public String getNombreUsuario() {
    return nombreUsuario;
}

public void setNombreUsuario(String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
}

public String getFechaUsuario() {
    return fechaUsuario;
}

public void setFechaUsuario(String fechaUsuario) {
    this.fechaUsuario = fechaUsuario;
}

public String getCorreoUsuario() {
    return correoUsuario;
}

public void setCorreoUsuario(String correoUsuario) {
    this.correoUsuario = correoUsuario;
}

public String getContraseñaUsuario() {
    return contraseñaUsuario;
}

public void setContraseñaUsuario(String contraseñaUsuario) {
    this.contraseñaUsuario = contraseñaUsuario;
}
