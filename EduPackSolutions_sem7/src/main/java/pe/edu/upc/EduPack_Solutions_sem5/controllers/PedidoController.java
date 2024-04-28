package pe.edu.upc.EduPack_Solutions_sem5.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.EduPack_Solutions_sem5.dtos.PedidoDTO;
import pe.edu.upc.EduPack_Solutions_sem5.entities.Pedido;
import pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces.IPedidoService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    @Autowired
    private IPedidoService pS;
    @PreAuthorize("hasAuthority('admin')")
    @PostMapping
    public void insertar(@RequestBody PedidoDTO pedidoDTO){
        ModelMapper m=new ModelMapper();
        Pedido c=m.map(pedidoDTO, Pedido.class);
        pS.insert(c);
    }
    @PreAuthorize("hasAuthority('admin')")
    @PutMapping
    public void modificar(@RequestBody PedidoDTO dtoP) {
        ModelMapper c = new ModelMapper();
        Pedido pedido = c.map(dtoP, Pedido.class);
        pS.insert(pedido);
    }
    @PreAuthorize("hasAuthority('admin')")
    @GetMapping
    public List<PedidoDTO> listar(){
        return pS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, PedidoDTO.class);
        }).collect(Collectors.toList());
    }
    @PreAuthorize("hasAuthority('admin')")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
    	pS.delete(id);
    }
    @PreAuthorize("hasAuthority('admin')")
    @GetMapping("/{id}")
    public PedidoDTO listarId(@PathVariable("id")Integer id) {
    	ModelMapper m=new ModelMapper();
    	PedidoDTO dto=m.map(pS.listId(id), PedidoDTO.class);
		return dto;    	
    }
    @PreAuthorize("hasAuthority('admin')")
    @GetMapping("/xolangeconsulta01")
    public Double getTotalPedidoPorFecha(@RequestParam LocalDate fecha) {
        return pS.getTotalPedidoPorFecha(fecha);
    }
}
