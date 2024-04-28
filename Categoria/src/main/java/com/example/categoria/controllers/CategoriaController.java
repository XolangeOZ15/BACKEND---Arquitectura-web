<<<<<<< HEAD
package com.example.categoria.controllers;


import com.example.categoria.dtos.CategoriaDTO;
import com.example.categoria.entities.Categoria;
import com.example.categoria.servicesinterfaces.ICategoriaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private ICategoriaService cS;
    @PostMapping
    public void insertar(@RequestBody CategoriaDTO categoriaDTO) {
        ModelMapper m = new ModelMapper();
        Categoria c = m.map(categoriaDTO, Categoria.class);
        cS.insert(c);
    }
    @GetMapping
    public List<CategoriaDTO> listar(){
    return cS.list().stream().map(y->{
        ModelMapper m=new ModelMapper();
        return m.map(y,CategoriaDTO.class);
    }).collect(Collectors.toList());}


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable ("id") Integer id){
        cS.delete(id);
    }
    @GetMapping("/{id}")
    public CategoriaDTO listarid(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        CategoriaDTO dto=m.map(cS.listId(id),CategoriaDTO.class);
        return dto;
    }


    @GetMapping("/buscar")
    public List<CategoriaDTO> buscar(@RequestParam String name){
        return cS.findbyNombreCategoria(name).stream().map(y-> {
            ModelMapper m = new ModelMapper();
            return m.map(y, CategoriaDTO.class);
        }).collect(Collectors.toList());
    }


}
=======
package com.example.categoria.controllers;


import com.example.categoria.dtos.CategoriaDTO;
import com.example.categoria.entities.Categoria;
import com.example.categoria.servicesinterfaces.ICategoriaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@PreAuthorize("hasAuthority('Admin')")
@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private ICategoriaService cS;
    @PostMapping
    public void insertar(@RequestBody CategoriaDTO categoriaDTO) {
        ModelMapper m = new ModelMapper();
        Categoria c = m.map(categoriaDTO, Categoria.class);
        cS.insert(c);
    }
    @GetMapping
    public List<CategoriaDTO> listar(){
    return cS.list().stream().map(y->{
        ModelMapper m=new ModelMapper();
        return m.map(y,CategoriaDTO.class);
    }).collect(Collectors.toList());}


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable ("id") Integer id){
        cS.delete(id);
    }
    @GetMapping("/{id}")
    public CategoriaDTO listarid(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        CategoriaDTO dto=m.map(cS.listId(id),CategoriaDTO.class);
        return dto;
    }


    @GetMapping("/buscar")
    public List<CategoriaDTO> buscar(@RequestParam String name){
        return cS.findbyNombreCategoria(name).stream().map(y-> {
            ModelMapper m = new ModelMapper();
            return m.map(y, CategoriaDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/editar")
    public List<CategoriaDTO> editar(@RequestParam String name){
        return cS.findbyNombreCategoria(name).stream().map(y-> {
            ModelMapper m = new ModelMapper();
            return m.map(y, CategoriaDTO.class);
        }).collect(Collectors.toList());
    }
}
>>>>>>> feature/crud-categoria
