package pe.edu.upc.EduPack_Solutions_sem5.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.EduPack_Solutions_sem5.entities.TipoProducto;
import pe.edu.upc.EduPack_Solutions_sem5.repositories.ITipoProductoRepository;
import pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces.ITipoProductoService;

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
}
