package pe.edu.upc.producto.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.producto.dtos.ProductoDTO;
import pe.edu.upc.producto.entities.Producto;
import pe.edu.upc.producto.servicesinterfaces.IProductoService;

import java.util.List;
import java.util.stream.Collectors;

@PreAuthorize("hasAuthority('Admin')")
@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private IProductoService pS;

    @PostMapping
    public void insertar(@RequestBody ProductoDTO productoDTO){
        ModelMapper m=new ModelMapper();
        Producto producto = m.map(productoDTO, Producto.class);
        pS.insert(producto);
    }
    @PutMapping
    public void modificar(@RequestBody ProductoDTO productoDTO){
        ModelMapper m=new ModelMapper();
        Producto c=m.map(productoDTO, Producto.class);
        pS.insert(c);
    }

    @GetMapping
    public List<ProductoDTO> listar(){
        return pS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, ProductoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable ("id") Integer id) {pS.delete(id);}

    @GetMapping("/{id}")
    public ProductoDTO listarid(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        ProductoDTO dto=m.map(pS.listid(id), ProductoDTO.class);
        return dto;
    }

}
