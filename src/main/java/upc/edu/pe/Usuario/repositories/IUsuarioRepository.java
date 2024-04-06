package upc.edu.pe.Usuario.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import upc.edu.pe.Usuario.entities.Usuario;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>  {
    public List<Usuario> findByDenominacionUsuario(String name);
}
