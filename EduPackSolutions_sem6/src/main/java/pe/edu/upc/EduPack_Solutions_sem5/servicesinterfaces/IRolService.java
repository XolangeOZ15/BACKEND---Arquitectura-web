package pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces;

import pe.edu.upc.EduPack_Solutions_sem5.entities.Rol;

import java.util.List;

public interface IRolService {
    public void insert(Rol rol);

    public List<Rol> list();

    public void delete(Long idRol);

    public Rol listarId(Long idRol);
}
