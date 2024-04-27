package pe.edu.upc.EduPack.servicesimplements;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.EduPack.entities.Almacen;

import pe.edu.upc.EduPack.repositories.IAlmacenRepository;
import pe.edu.upc.EduPack.servicesinterfaces.IAlmacenService;

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


}
