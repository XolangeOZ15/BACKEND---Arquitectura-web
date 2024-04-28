package pe.edu.upc.EduPack_Solutions_sem5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.EduPack_Solutions_sem5.entities.Producto;

import java.util.List;

@Repository
public interface IProductoRepository extends JpaRepository<Producto,Integer> {
    @Query(value = "SELECT id_producto, nombre_producto, marca_producto, precio_producto, stock_producto,\n" +
            "       CAST(ROUND(CAST(precio_producto * stock_producto AS integer)::numeric, 2) AS numeric(10,2)) AS monto_total\n" +
            "FROM Producto p\n" +
            "WHERE stock_producto < 10;",nativeQuery = true)
    List<String[]> getProductosMenorStockYTotal();
    @Query(value = "SELECT marca_producto, COUNT(*) AS cantidad_marca " +
            "FROM Producto " +
            "GROUP BY marca_producto " +
            "ORDER BY COUNT(*) DESC", nativeQuery = true)
    List<String[]> cantidadMarcasRepetidas();

    @Query(value = "SELECT dp.id_producto as Producto, sum(dp.cantidad_pedido) as CantConsumido\n" +
            "FROM tipo_producto tp inner join producto pd on tp.id_tipo_producto=pd.id_tipo_producto,\n" +
            "\t\t      inner join detalle_pedido dp on pd.id_producto = dp.id_producto,\n" +
            "\t\t      inner join pedido p on dp.id_pedido=p.id_pedido\n" +
            "where tp.descripcion_tipo_producto = \"material\" and p.fecha_pedido between '2024-03-27' and '2024-04-27'\n" +
            "group by dp.id_producto",nativeQuery = true)
    List<String[]>materialMasConsumido();
}
