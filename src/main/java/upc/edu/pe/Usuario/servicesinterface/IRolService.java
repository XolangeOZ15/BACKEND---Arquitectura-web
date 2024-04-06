package upc.edu.pe.Usuario.servicesinterface;

import upc.edu.pe.Usuario.entities.Rol;


import java.util.List;

public interface IRolService {
    public void insert( Rol Rol);
    public List<Rol> list();
    public void delete(int id);
    public Rol listId(int id);
    public List<Rol> findByDenominacionRol(String name);
}
