package pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces;

import pe.edu.upc.EduPack_Solutions_sem5.entities.Modelo;

import java.util.List;

public interface IModeloService {
    public void  insert(Modelo modelo);
    public List<Modelo> list();
    public void delete(int id);
    public Modelo listId(int id);
}
