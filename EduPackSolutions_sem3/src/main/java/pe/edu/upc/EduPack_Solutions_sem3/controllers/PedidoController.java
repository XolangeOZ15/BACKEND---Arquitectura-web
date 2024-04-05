package pe.edu.upc.EduPack_Solutions_sem3.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.EduPack_Solutions_sem3.dtos.PedidoDTO;
import pe.edu.upc.EduPack_Solutions_sem3.entities.Pedido;
import pe.edu.upc.EduPack_Solutions_sem3.servicesinterfaces.IPedidoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    @Autowired
    private IPedidoService pS;

    @PostMapping
    public void insertar(@RequestBody PedidoDTO pedidoDTO){
        ModelMapper m=new ModelMapper();
        Pedido c=m.map(pedidoDTO, Pedido.class);
        pS.insert(c);
    }
    @GetMapping
    public List<PedidoDTO> listar(){
        return pS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, PedidoDTO.class);
        }).collect(Collectors.toList());
    }
   /* @PutMapping("/{id}")
    public void modificar(@PathVariable("id") Integer id, @RequestBody PedidoDTO pedidoDTO) {
        ModelMapper m = new ModelMapper();
        Pedido pedidoActualizado = m.map(pedidoDTO, Pedido.class);
        pS.update(id, pedidoActualizado);
    }
*/

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
    	pS.delete(id);
    }

    @GetMapping("/{id}")
    public PedidoDTO listarId(@PathVariable("id")Integer id) {
    	ModelMapper m=new ModelMapper();
    	PedidoDTO dto=m.map(pS.listId(id), PedidoDTO.class);
		return dto;    	
    } 
    
    @GetMapping("/buscar") 
    public List<PedidoDTO> buscarNombrePedido(@RequestParam String nombrepedido){
    	
		return pS.findByNombrePedido(nombrepedido).stream().map(y->{
			ModelMapper m=new ModelMapper();
			return m.map(y, PedidoDTO.class);
		}).collect(Collectors.toList());
    }
}
