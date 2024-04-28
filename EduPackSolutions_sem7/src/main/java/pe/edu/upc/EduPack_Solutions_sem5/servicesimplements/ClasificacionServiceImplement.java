package pe.edu.upc.EduPack_Solutions_sem5.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.EduPack_Solutions_sem5.entities.Clasificacion;
import pe.edu.upc.EduPack_Solutions_sem5.repositories.IClasificacionRepository;
import pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces.IClasificacionService;

import java.util.List;

@Service
public class ClasificacionServiceImplement implements IClasificacionService {
    @Autowired
    private IClasificacionRepository cR;
    @Override
    public void insert(Clasificacion clasificacion) {
        cR.save(clasificacion);
    }

    @Override
    public List<Clasificacion> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }

    @Override
    public Clasificacion listId(int id) {
        return cR.findById(id).orElse(new Clasificacion());
    }
}
