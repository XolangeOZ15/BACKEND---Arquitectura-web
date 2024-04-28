package pe.edu.upc.EduPack_Solutions_sem5.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.EduPack_Solutions_sem5.dtos.TipoProductoDTO;
import pe.edu.upc.EduPack_Solutions_sem5.entities.TipoProducto;
import pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces.ITipoProductoService;

import java.util.List;
import java.util.stream.Collectors;

@PreAuthorize("hasAuthority('admin')")
@RestController
@RequestMapping("/tiposproductos")
public class TipoProductoController {
    @Autowired
    private ITipoProductoService tS;

    @PostMapping
    public void insertar(@RequestBody TipoProductoDTO tipoProductoDTO){
        ModelMapper m=new ModelMapper();
        TipoProducto tipoProducto =m.map(tipoProductoDTO, TipoProducto.class);
        tS.insert(tipoProducto);
    }
    @PutMapping
    public void modificar(@RequestBody TipoProductoDTO tipoProductoDTO){
        ModelMapper m=new ModelMapper();
        TipoProducto c=m.map(tipoProductoDTO, TipoProducto.class);
        tS.insert(c);
    }
    @GetMapping
    public List<TipoProductoDTO> listar(){
        return tS.list().stream().map(y-> {
            ModelMapper m=new ModelMapper();
            return m.map(y, TipoProductoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable ("id") Integer id) {tS.delete(id);}

    @GetMapping("/{id}")
    public TipoProductoDTO listarid(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        TipoProductoDTO dto=m.map(tS.listid(id), TipoProductoDTO.class);
        return dto;
    }
}
