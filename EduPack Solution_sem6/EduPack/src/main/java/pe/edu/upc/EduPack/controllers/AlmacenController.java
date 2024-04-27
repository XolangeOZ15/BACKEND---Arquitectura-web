package pe.edu.upc.EduPack.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.EduPack.dtos.AlmacenDTO;
import pe.edu.upc.EduPack.entities.Almacen;
import pe.edu.upc.EduPack.servicesinterfaces.IAlmacenService;
import java.util.List;
import java.util.stream.Collectors;


@PreAuthorize("hasAuthority('Admin')")
@RestController
@RequestMapping("/almacenes")
public class AlmacenController {

    @Autowired
    private IAlmacenService aS;

    @PostMapping
    public void insertar(@RequestBody AlmacenDTO AlmacenDTO){
        ModelMapper m=new ModelMapper();
        Almacen c=m.map(AlmacenDTO,Almacen.class);
        aS.insert(c);
    }
    @PutMapping
    public void modificar(@RequestBody AlmacenDTO dto) {
        ModelMapper m = new ModelMapper();
        Almacen r = m.map(dto, Almacen.class);
        aS.insert(r);
    }
    @GetMapping
    public List<AlmacenDTO> listar(){
        return aS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,AlmacenDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        aS.delete(id);
    }
    @GetMapping("/{id}")
    public AlmacenDTO listarId(@PathVariable("id")Integer id) {
        ModelMapper m=new ModelMapper();
        AlmacenDTO dto=m.map(aS.listId(id), AlmacenDTO.class);
        return dto;
    }



}
