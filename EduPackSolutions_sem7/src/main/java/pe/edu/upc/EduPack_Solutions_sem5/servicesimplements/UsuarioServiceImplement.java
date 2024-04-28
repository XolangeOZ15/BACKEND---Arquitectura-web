package pe.edu.upc.EduPack_Solutions_sem5.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.EduPack_Solutions_sem5.entities.Usuario;
import pe.edu.upc.EduPack_Solutions_sem5.repositories.IUsuarioRepository;
import pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;

    @Override
    public void insert(Usuario usuario) {
    uR.save(usuario);
    }

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    @Override
    public void delete(Long idUsuario) {
    uR.deleteById(idUsuario);
    }

    @Override
    public Usuario listarId(Long idUsuario) {
        return uR.findById(idUsuario).orElse(new Usuario());
    }
}
