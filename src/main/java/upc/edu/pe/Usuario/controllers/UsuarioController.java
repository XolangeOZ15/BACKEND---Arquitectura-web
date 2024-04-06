package upc.edu.pe.Usuario.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.Usuario.dtos.UsuarioDTO;
import upc.edu.pe.Usuario.entities.Usuario;
import upc.edu.pe.Usuario.servicesinterface.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioController {
    @Autowired
    private IUsuarioService cS;

    @PostMapping
    public void insertar(@RequestBody UsuarioDTO UsuarioDTO){
        ModelMapper m=new ModelMapper();
        Usuario c=m.map(UsuarioDTO,Usuario.class);
        cS.insert(c);
    }
    @GetMapping
    public List<UsuarioDTO> listar(){
        return cS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        cS.delete(id);
    }
    @GetMapping("/{id}")
    public UsuarioDTO listarId(@PathVariable("id")Integer id) {
        ModelMapper m=new ModelMapper();
        UsuarioDTO dto=m.map(cS.listId(id), UsuarioDTO.class);
        return dto;
    }

    @GetMapping("/buscar")
    public List<UsuarioDTO> buscarDenominacion(@RequestParam String denominacion){

        return cS.findByDenominacionUsuario(denominacion).stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, UsuarioDTO.class);
        }).collect(Collectors.toList());

    }



}
