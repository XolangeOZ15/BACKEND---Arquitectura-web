package pe.edu.upc.EduPack_Solutions_sem5.dtos;

import pe.edu.upc.EduPack_Solutions_sem5.entities.Usuario;

public class RolDTO {
    private Long id;
    private String rol;
    private Usuario user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
