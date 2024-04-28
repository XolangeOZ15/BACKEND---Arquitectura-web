package pe.edu.upc.tipoproducto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tipoproducto.entities.TipoProducto;

import java.util.List;
@Repository
public interface ITipoProductoRepository extends JpaRepository <TipoProducto, Integer> {
    public List<TipoProducto> findByDescripcionTipoProducto(String name);
}
