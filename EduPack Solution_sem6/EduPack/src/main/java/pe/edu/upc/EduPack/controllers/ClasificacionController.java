package pe.edu.upc.EduPack.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.EduPack.dtos.ClasificacionDTO;
import pe.edu.upc.EduPack.entities.Clasificacion;
import pe.edu.upc.EduPack.servicesinterfaces.IClasificacionService;

import java.util.List;
import java.util.stream.Collectors;
@PreAuthorize("hasAuthority('Admin')")
@RestController
@RequestMapping("/clasificaciones")
public class ClasificacionController {
    @Autowired
    private IClasificacionService cS;

    @PostMapping
    public void insertar(@RequestBody ClasificacionDTO ClasificacionDTO){
        ModelMapper m=new ModelMapper();
        Clasificacion c=m.map(ClasificacionDTO,Clasificacion.class);
        cS.insert(c);
    }
    @PutMapping
    public void modificar(@RequestBody ClasificacionDTO dto) {
        ModelMapper m = new ModelMapper();
        Clasificacion r = m.map(dto, Clasificacion.class);
        cS.insert(r);
    }
    @GetMapping
    public List<ClasificacionDTO> listar(){
        return cS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,ClasificacionDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        cS.delete(id);
    }
    @GetMapping("/{id}")
    public ClasificacionDTO listarId(@PathVariable("id")Integer id) {
        ModelMapper m=new ModelMapper();
        ClasificacionDTO dto=m.map(cS.listId(id), ClasificacionDTO.class);
        return dto;
    }
}
