package pe.edu.upc.producto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.producto.entities.Producto;

import java.util.List;
@Repository
public interface IProductoRepository extends JpaRepository <Producto, Integer> {
    public List<Producto> findByNombreProducto(String name);
}
