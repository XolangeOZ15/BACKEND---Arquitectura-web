package pe.edu.upc.EduPack_Solutions_sem5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.EduPack_Solutions_sem5.entities.Almacen;

import java.util.List;

@Repository
public interface IAlmacenRepository extends JpaRepository<Almacen,Integer> {
    @Query(value = "SELECT al.id_almacen as Almacen,c.nombre_clasificacion as Nombre, sum(p.stock_producto) as CantProducto,\n" +
            "al.cantidad_capacidad as Capacidad \n" +
            "FROM clasificacion c inner join almacen al on c.id_clasificacion=al.id_clasificacion, \t\n" +
            "\t\t     inner join producto p on al.id_almacen=p.id_almacen, \t\n" +
            "\t\t     inner join tipo_producto tp on p.id_tipo_producto = tp.id_tipo_producto\n" +
            "where tp.descripcion_tipo_producto = \"material\"\n" +
            "group by al.id_almacen\n",nativeQuery = true)
    List<String[]> capacidadOcupadaPorAlmacen();
}
