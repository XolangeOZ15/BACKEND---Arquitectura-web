package pe.edu.upc.EduPack_Solutions_sem5.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.EduPack_Solutions_sem5.dtos.ModeloDTO;
import pe.edu.upc.EduPack_Solutions_sem5.entities.Modelo;
import pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces.IModeloService;

import java.util.List;
import java.util.stream.Collectors;

@PreAuthorize("hasAuthority('admin')")
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
    @PutMapping
    public void modificar(@RequestBody ModeloDTO modeloDTO) {
        ModelMapper c = new ModelMapper();
        Modelo modelo = c.map(modeloDTO, Modelo.class);
        mS.insert(modelo);
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

}
