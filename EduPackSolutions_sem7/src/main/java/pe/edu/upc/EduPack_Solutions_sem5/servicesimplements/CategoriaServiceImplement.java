package pe.edu.upc.EduPack_Solutions_sem5.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.EduPack_Solutions_sem5.entities.Categoria;
import pe.edu.upc.EduPack_Solutions_sem5.repositories.ICategoriaRepository;
import pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces.ICategoriaService;

import java.util.List;

@Service
public class CategoriaServiceImplement implements ICategoriaService {
    @Autowired
    private ICategoriaRepository cR;
    @Override
    public void insert(Categoria categoria) {
        cR.save(categoria);
    }

    @Override
    public List<Categoria> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }

    @Override
    public Categoria listId(int id) {
        return cR.findById(id).orElse(new Categoria());
    }

    @Override
    public List<String[]> CategoriasMasRepetidas() {
        return cR.CategoriasMasRepetidas();
    }
}
