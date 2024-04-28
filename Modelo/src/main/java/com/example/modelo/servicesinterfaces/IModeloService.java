package com.example.modelo.servicesinterfaces;

import com.example.modelo.entities.Modelo;

import java.util.List;

public interface IModeloService {

    public void  insert(Modelo modelo);
    public List<Modelo> list();
    public void delete(int id);
    public Modelo listId(int id);

    public List<Modelo> findbyNombreModelo(String name);
}
