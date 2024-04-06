package com.example.categoria.repositories;

import com.example.categoria.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICategoriaRepository extends JpaRepository<Categoria, Integer>{

public List<Categoria> findbyNombreCategoria(String name);


}
