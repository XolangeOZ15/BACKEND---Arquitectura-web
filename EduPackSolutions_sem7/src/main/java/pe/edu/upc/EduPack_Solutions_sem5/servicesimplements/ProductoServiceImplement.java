package pe.edu.upc.EduPack_Solutions_sem5.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.EduPack_Solutions_sem5.entities.Producto;
import pe.edu.upc.EduPack_Solutions_sem5.repositories.IProductoRepository;
import pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces.IProductoService;

import java.util.List;
@Service
public class ProductoServiceImplement implements IProductoService {
    @Autowired
    private IProductoRepository pR;
    @Override
    public void insert(Producto producto) {
        pR.save(producto);
    }

    @Override
    public List<Producto> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }

    @Override
    public Producto listid(int id) {
        return pR.findById(id).orElse(new Producto());
    }

    @Override
    public void actualizarStockProducto(Producto producto, int cantidad) {
        int stockActual = producto.getStockProducto();
        int nuevoStock = stockActual - cantidad;
        if (nuevoStock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }
        producto.setStockProducto(nuevoStock);
        pR.save(producto);
    }

    @Override
    public List<String[]> getProductosMenorStockYTotal() {
        return pR.getProductosMenorStockYTotal();
    }

    @Override
    public List<String[]> cantidadMarcasRepetidas() {
        return pR.cantidadMarcasRepetidas();
    }

    @Override
    public List<String[]> materialMasConsumido() {
        return pR.materialMasConsumido();
    }
}
