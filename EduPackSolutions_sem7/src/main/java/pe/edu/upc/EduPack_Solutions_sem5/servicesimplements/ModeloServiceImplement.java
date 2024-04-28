package pe.edu.upc.EduPack_Solutions_sem5.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.EduPack_Solutions_sem5.entities.Modelo;
import pe.edu.upc.EduPack_Solutions_sem5.repositories.IModeloRepository;
import pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces.IModeloService;

import java.util.List;

@Service
public class ModeloServiceImplement implements IModeloService {
    @Autowired
    private IModeloRepository cR;
    @Override
    public void insert(Modelo modelo) {
        cR.save(modelo);
    }

    @Override
    public List<Modelo> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }

    @Override
    public Modelo listId(int id) {
        return cR.findById(id).orElse(new Modelo());
    }
}
