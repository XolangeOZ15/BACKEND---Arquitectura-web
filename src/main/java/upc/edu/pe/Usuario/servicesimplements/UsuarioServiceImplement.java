package upc.edu.pe.Usuario.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import upc.edu.pe.Usuario.entities.Usuario;
import upc.edu.pe.Usuario.repositories.IUsuarioRepository;

import java.util.List;

public class UsuarioServiceImplement {
    @Autowired
    private IUsuarioRepository cR;

    @Override
    public void insert(Usuario Usuario) {
        cR.save(Usuario);
    }

    @Override
    public List<Usuario> list() {
        return cR.findAll();
    }
    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        cR.deleteById(id);
    }

    @Override
    public Usuario listId(int id) {
        // TODO Auto-generated method stub
        return cR.findById(id).orElse(new Usuario());
    }
}
