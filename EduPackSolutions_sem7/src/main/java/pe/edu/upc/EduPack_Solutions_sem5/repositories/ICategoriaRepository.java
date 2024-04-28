package pe.edu.upc.EduPack_Solutions_sem5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.EduPack_Solutions_sem5.entities.Categoria;

import java.util.List;

@Repository
public interface ICategoriaRepository extends JpaRepository<Categoria,Integer> {
    @Query(value = "SELECT TOP(10) id_categoria, COUNT(id_categoria) as cantidad_de_categorias \n" +
            "FROM categoria \n" +
            "GROUP BY id_categoria\n" +
            "ORDER BY COUNT(id_categoria) DESC;",nativeQuery = true)
    List<String[]>CategoriasMasRepetidas();
}
