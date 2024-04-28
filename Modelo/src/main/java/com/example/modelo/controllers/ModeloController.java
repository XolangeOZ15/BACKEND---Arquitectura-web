package com.example.modelo.controllers;


import com.example.modelo.dtos.ModeloDTO;
import com.example.modelo.entities.Modelo;
import com.example.modelo.servicesinterfaces.IModeloService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
@PreAuthorize("hasAuthority('Admin')")
@RestController
@RequestMapping("/modelos")
public class ModeloController {

    @Autowired
    private IModeloService mS;
    @PostMapping
    public void insertar(@RequestBody ModeloDTO modeloDTO) {
        ModelMapper m = new ModelMapper();
        Modelo c = m.map(modeloDTO, Modelo.class);
        mS.insert(c);
    }
    @GetMapping
    public List<ModeloDTO> listar(){
    return mS.list().stream().map(y->{
        ModelMapper m=new ModelMapper();
        return m.map(y, ModeloDTO.class);
    }).collect(Collectors.toList());}


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable ("id") Integer id){
        mS.delete(id);
    }
    @GetMapping("/{id}")
    public ModeloDTO listarid(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        ModeloDTO dto=m.map(mS.listId(id), ModeloDTO.class);
        return dto;
    }


    @GetMapping("/buscar")
    public List<ModeloDTO> buscar(@RequestParam String name){
        return mS.findbyNombreModelo(name).stream().map(y-> {
            ModelMapper m = new ModelMapper();
            return m.map(y, ModeloDTO.class);
        }).collect(Collectors.toList());
    }


}
