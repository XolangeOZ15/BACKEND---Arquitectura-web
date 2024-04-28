package pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces;

import pe.edu.upc.EduPack_Solutions_sem5.entities.Producto;

import java.util.List;

public interface IProductoService {
    public void insert(Producto producto);
    public List<Producto> list();
    public void delete(int id);
    public Producto listid(int id);

    void actualizarStockProducto(Producto producto, int cantidad);
    List<String[]> getProductosMenorStockYTotal();
    List<String[]>cantidadMarcasRepetidas();
    List<String[]>materialMasConsumido();
}
