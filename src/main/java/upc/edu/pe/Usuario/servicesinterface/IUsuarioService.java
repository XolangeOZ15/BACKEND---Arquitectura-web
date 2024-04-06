package upc.edu.pe.Usuario.servicesinterface;

import upc.edu.pe.Usuario.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public void insert(Usuario Usuario);
    public List<Usuario> list();
    public void delete(int id);
    public Usuario listId(int id);
    public List<Usuario> findByDenominacionUsuario(String name);
}
