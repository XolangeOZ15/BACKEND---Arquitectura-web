package com.example.categoria.serviceimplements;

import com.example.categoria.entities.Categoria;
import com.example.categoria.repositories.ICategoriaRepository;
import com.example.categoria.servicesinterfaces.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImplement implements ICategoriaService {



    @Autowired
    private ICategoriaRepository cR;
    @Override
    public void insert(Categoria categoria) {
    cR.save(categoria);

    }

    @Override
    public List<Categoria> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int id) {
    cR.deleteById(id);
    }

    @Override
    public Categoria listId(int id) {
        return cR.findById(id).orElse(new Categoria());
    }

    @Override
    public List<Categoria> findbyNombreCategoria(String name) {
        return cR.findbyNombreCategoria(name);
    }
}
