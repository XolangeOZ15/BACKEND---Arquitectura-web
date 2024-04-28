package pe.edu.upc.EduPack_Solutions_sem5.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.EduPack_Solutions_sem5.dtos.CantidadPedidosPorEstadoDTO;
import pe.edu.upc.EduPack_Solutions_sem5.dtos.ProductoDTO;
import pe.edu.upc.EduPack_Solutions_sem5.entities.Producto;
import pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces.IProductoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@PreAuthorize("hasAuthority('admin')")
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
    @GetMapping("/yaniraconsulta01")
    public List<ProductoDTO> getProductosMenorStockYTotal() {
        List<String[]> productosConMenorStockYTotal = pS.getProductosMenorStockYTotal();
        List<ProductoDTO> resultado = new ArrayList<>();

        for (String[] fila : productosConMenorStockYTotal) {
            ProductoDTO dto = new ProductoDTO();
            dto.setIdProducto(Integer.parseInt(fila[0]));
            dto.setNombreProducto(fila[1]);
            dto.setMarcaProducto(fila[2]);
            dto.setPrecioProducto(Double.parseDouble(fila[3]));
            dto.setStockProducto(Integer.parseInt(fila[4]));
            dto.setMontoTotal(Double.parseDouble(fila[5]));
            resultado.add(dto);
        }
        return resultado;
    }
    @GetMapping("/yaniraconsulta02")
    public List<ProductoDTO> cantidadMarcasRepetidas() {
        List<String[]> marcasRepetidas = pS.cantidadMarcasRepetidas();
        List<ProductoDTO> resultado = new ArrayList<>();

        for (String[] columna : marcasRepetidas) {
            ProductoDTO dto = new ProductoDTO();
            dto.setMarcaProducto(columna[0]);
            dto.setCantidadMarcas(Integer.parseInt(columna[1]));
            resultado.add(dto);
        }
        return resultado;
    }


}
