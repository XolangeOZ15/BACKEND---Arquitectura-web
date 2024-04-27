package pe.edu.upc.EduPack.repositories;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.EduPack.entities.Almacen;



@Repository
public interface IAlmacenRepository extends JpaRepository<Almacen, Integer> {

}
