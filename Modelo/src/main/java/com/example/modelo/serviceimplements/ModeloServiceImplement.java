package com.example.modelo.serviceimplements;

import com.example.modelo.entities.Modelo;
import com.example.modelo.repositories.IModeloRepository;
import com.example.modelo.servicesinterfaces.IModeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeloServiceImplement implements IModeloService {



    @Autowired
    private IModeloRepository cR;
    @Override
    public void insert(Modelo modelo) {
    cR.save(modelo);

    }

    @Override
    public List<Modelo> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int id) {
    cR.deleteById(id);
    }

    @Override
    public Modelo listId(int id) {
        return cR.findById(id).orElse(new Modelo());
    }

    @Override
    public List<Modelo> findbyNombreModelo(String name) {
        return cR.findByNombreModelo(name);
    }
}
