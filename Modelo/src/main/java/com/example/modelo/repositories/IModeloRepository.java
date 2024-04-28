package com.example.modelo.repositories;

import com.example.modelo.entities.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IModeloRepository extends JpaRepository<Modelo, Integer>{
    public List<Modelo> findByNombreModelo(String name);


}
