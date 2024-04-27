package pe.edu.upc.EduPack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.EduPack.entities.Clasificacion;

@Repository
public interface IClasificacionRepository extends JpaRepository<Clasificacion, Integer> {
}
