package pe.edu.upc.EduPack_Solutions_sem5.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.EduPack_Solutions_sem5.dtos.AlmacenDTO;
import pe.edu.upc.EduPack_Solutions_sem5.dtos.capacidadOcupadaPorAlmacenDTO;
import pe.edu.upc.EduPack_Solutions_sem5.entities.Almacen;
import pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces.IAlmacenService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@PreAuthorize("hasAuthority('Supervisor')")
@RestController
@RequestMapping("/almacen")
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
    @GetMapping("/weslyconsulta01")
    public List<capacidadOcupadaPorAlmacenDTO> capacidadOcupadaPorAlmacen() {
        List<String[]> capacidadOcupada = aS.capacidadOcupadaPorAlmacen();
        List<capacidadOcupadaPorAlmacenDTO> resultado = new ArrayList<>();
        for (String[] fila : capacidadOcupada) {
            capacidadOcupadaPorAlmacenDTO dto = new capacidadOcupadaPorAlmacenDTO();
            dto.setIdAlmacen(Integer.parseInt(fila[0]));
            dto.setNombreClasificacion(fila[1]);
            dto.setStockProducto(Integer.parseInt(fila[2]));
            dto.setCapacidadAlmacen(Integer.parseInt(fila[3]));
            resultado.add(dto);
        }
        return resultado;
    }
}
