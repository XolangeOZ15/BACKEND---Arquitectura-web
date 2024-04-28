package pe.edu.upc.EduPack_Solutions_sem5.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.EduPack_Solutions_sem5.dtos.RolDTO;
import pe.edu.upc.EduPack_Solutions_sem5.entities.Rol;
import pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces.IRolService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/roles")
public class RolController {
    @Autowired
    private IRolService rS;

    @PostMapping
    public void registrar(@RequestBody RolDTO dto) {
        ModelMapper m = new ModelMapper();
        Rol r = m.map(dto, Rol.class);
        rS.insert(r);
    }

    @PutMapping
    public void modificar(@RequestBody RolDTO dto) {
        ModelMapper m = new ModelMapper();
        Rol r = m.map(dto, Rol.class);
        rS.insert(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        rS.delete(id);
    }

    @GetMapping("/{id}")
    public RolDTO listarId(@PathVariable("id") Long id) {
        ModelMapper m = new ModelMapper();
        RolDTO dto = m.map(rS.listarId(id), RolDTO.class);
        return dto;
    }

    @GetMapping
    public List<RolDTO> listar() {
        return rS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RolDTO.class);
        }).collect(Collectors.toList());
    }
}
