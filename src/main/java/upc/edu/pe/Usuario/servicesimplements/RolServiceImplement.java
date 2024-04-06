package upc.edu.pe.Usuario.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import upc.edu.pe.Usuario.entities.Rol;
import upc.edu.pe.Usuario.repositories.IRolRepository;

import java.util.List;

public class RolServiceImplement {
    @Autowired
    private IRolRepository cR;

    @Override
    public void insert(Rol Rol) {
        cR.save(Rol);
    }

    @Override
    public List<Rol> list() {
        return cR.findAll();
    }
    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        cR.deleteById(id);
    }

    @Override
    public Rol listId(int id) {
        // TODO Auto-generated method stub
        return cR.findById(id).orElse(new Rol());
    }
}
