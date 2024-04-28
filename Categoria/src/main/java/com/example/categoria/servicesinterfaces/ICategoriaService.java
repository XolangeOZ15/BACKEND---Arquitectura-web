<<<<<<< HEAD
package com.example.categoria.servicesinterfaces;

import com.example.categoria.entities.Categoria;

import java.util.Collection;
import java.util.List;

public interface ICategoriaService {

    public void  insert(Categoria categoria);
    public List<Categoria> list();
    public void delete(int id);
    public Categoria listId(int id);

    public List<Categoria> findbyNombreCategoria(String name);
}
=======
package com.example.categoria.servicesinterfaces;

import com.example.categoria.entities.Categoria;

import java.util.Collection;
import java.util.List;

public interface ICategoriaService {

    public void  insert(Categoria categoria);
    public List<Categoria> list();
    public void delete(int id);
    public Categoria listId(int id);

    public List<Categoria> findbyNombreCategoria(String name);
}
>>>>>>> feature/crud-categoria
