package upc.edu.pe.Usuario.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.Usuario.dtos.RolDTO;
import upc.edu.pe.Usuario.entities.Rol;
import upc.edu.pe.Usuario.servicesinterface.IRolService;

import java.util.List;
import java.util.stream.Collectors;

public class RolController {
    @Autowired
    private IRolService cS;

    @PostMapping
    public void insertar(@RequestBody RolDTO RolDTO){
        ModelMapper m=new ModelMapper();
        Rol c=m.map(RolDTO,Rol.class);
        cS.insert(c);
    }
    @GetMapping
    public List<RolDTO> listar(){
        return cS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,RolDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        cS.delete(id);
    }
    @GetMapping("/{id}")
    public RolDTO listarId(@PathVariable("id")Integer id) {
        ModelMapper m=new ModelMapper();
        RolDTO dto=m.map(cS.listId(id), RolDTO.class);
        return dto;
    }

    @GetMapping("/buscar")
    public List<RolDTO> buscarDenominacion(@RequestParam String denominacion){

        return cS.findByDenominacionUsuario(denominacion).stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, RolDTO.class);
        }).collect(Collectors.toList());

    }
}
