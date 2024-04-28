package pe.edu.upc.tipoproducto.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tipoproducto.entities.TipoProducto;
import pe.edu.upc.tipoproducto.repositories.ITipoProductoRepository;
import pe.edu.upc.tipoproducto.servicesinterfaces.ITipoProductoService;

import java.util.List;

@Service
public class TipoProductoServiceImplement implements ITipoProductoService {
    @Autowired
    private ITipoProductoRepository tR;
    @Override
    public void insert(TipoProducto tipoProducto) {
        tR.save(tipoProducto);
    }

    @Override
    public List<TipoProducto> list() {
        return tR.findAll();
    }

    @Override
    public void delete(int id) {
        tR.deleteById(id);
    }

    @Override
    public TipoProducto listid(int id) {
        return tR.findById(id).orElse(new TipoProducto());
    }

    @Override
    public List<TipoProducto> findByDescripcionTipoProducto(String name) {
        return tR.findByDescripcionTipoProducto(name);
    }
}
