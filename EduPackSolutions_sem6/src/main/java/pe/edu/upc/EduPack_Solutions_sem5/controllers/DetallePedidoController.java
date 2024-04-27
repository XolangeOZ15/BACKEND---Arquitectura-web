package pe.edu.upc.EduPack_Solutions_sem5.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.EduPack_Solutions_sem5.dtos.DetallePedidoDTO;
import pe.edu.upc.EduPack_Solutions_sem5.dtos.PedidoDTO;
import pe.edu.upc.EduPack_Solutions_sem5.entities.DetallePedido;
import pe.edu.upc.EduPack_Solutions_sem5.entities.Pedido;
import pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces.IDetallePedidoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/detallepedido")
public class DetallePedidoController {
    @Autowired
    private IDetallePedidoService dS;

    @PostMapping
    public void insertar(@RequestBody DetallePedidoDTO bd) {
        ModelMapper m = new ModelMapper();
        DetallePedido b = m.map(bd, DetallePedido.class);
        dS.insertar(b);

    }
    @PutMapping
    public void modificar(@RequestBody DetallePedidoDTO dtoD) {
        ModelMapper c = new ModelMapper();
        DetallePedido pedido = c.map(dtoD, DetallePedido.class);
        dS.insertar(pedido);
    }
    @GetMapping
   // @PreAuthorize("hasAuthority('ADMIN')")
    public List<DetallePedidoDTO> listar() {
        return dS.list().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, DetallePedidoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        dS.delete(id);
    }

    @GetMapping("/{id}")
    public DetallePedidoDTO listarId(@PathVariable("id")Integer id) {
        ModelMapper m=new ModelMapper();
        DetallePedidoDTO dto=m.map(dS.listId(id), DetallePedidoDTO.class);
        return dto;
    }
}
