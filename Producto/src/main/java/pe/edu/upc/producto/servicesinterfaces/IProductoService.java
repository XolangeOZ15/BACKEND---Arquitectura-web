package pe.edu.upc.producto.servicesinterfaces;

import pe.edu.upc.producto.entities.Producto;

import java.util.List;

public interface IProductoService {
    public void insert(Producto producto);
    public List<Producto> list();
    public void delete(int id);
    public Producto listid(int id);
    public List<Producto> findByNombreProducto(String name);
}
