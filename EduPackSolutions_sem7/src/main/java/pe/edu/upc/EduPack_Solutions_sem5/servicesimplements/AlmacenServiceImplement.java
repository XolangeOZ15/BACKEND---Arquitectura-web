package pe.edu.upc.EduPack_Solutions_sem5.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.EduPack_Solutions_sem5.entities.Almacen;
import pe.edu.upc.EduPack_Solutions_sem5.repositories.IAlmacenRepository;
import pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces.IAlmacenService;

import java.util.List;

@Service
public class AlmacenServiceImplement implements IAlmacenService {
    @Autowired
    private IAlmacenRepository aR;
    @Override
    public void insert(Almacen almacen) {
        aR.save(almacen);
    }

    @Override
    public List<Almacen> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int id) {
        aR.deleteById(id);
    }

    @Override
    public Almacen listId(int id) {
        return aR.findById(id).orElse(new Almacen());
    }

    @Override
    public List<String[]> capacidadOcupadaPorAlmacen() {
        return aR.capacidadOcupadaPorAlmacen();
    }
}
