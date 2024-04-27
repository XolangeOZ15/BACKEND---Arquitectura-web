package pe.edu.upc.producto.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.producto.entities.Producto;
import pe.edu.upc.producto.repositories.IProductoRepository;
import pe.edu.upc.producto.servicesinterfaces.IProductoService;

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
    public List<Producto> findByNombreProducto(String name) {
        return pR.findByNombreProducto(name);
    }
}
