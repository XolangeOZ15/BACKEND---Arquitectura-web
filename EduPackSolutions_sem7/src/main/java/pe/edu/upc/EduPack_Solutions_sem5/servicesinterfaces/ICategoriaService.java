package pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces;

import pe.edu.upc.EduPack_Solutions_sem5.entities.Categoria;

import java.util.List;

public interface ICategoriaService {
    public void  insert(Categoria categoria);
    public List<Categoria> list();
    public void delete(int id);
    public Categoria listId(int id);
    List<String[]>CategoriasMasRepetidas();
}
