package upc.edu.pe.Usuario.repositories;
import org.springframework.stereotype.Repository;
import upc.edu.pe.Usuario.entities.Rol;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
    public List<Rol> findByDenominacionRol(String name);
}
