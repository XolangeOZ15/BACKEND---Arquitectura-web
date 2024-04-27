package pe.edu.upc.EduPack_Solutions_sem5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.EduPack_Solutions_sem5.entities.DetallePedido;

import java.util.List;

@Repository
public interface IDetallePedidoRepository extends JpaRepository<DetallePedido,Integer> {
@Query(value = "SELECT detalle_pedido.estado_pedido, COUNT(*) AS cantidad_pedidos\n" +
        "FROM pedido\n" +
        "JOIN detalle_pedido ON pedido.id_pedido = detalle_pedido.id_pedido\n" +
        "GROUP BY detalle_pedido.estado_pedido;", nativeQuery = true)
    List<String[]>CantidadPedidosPorEstado();
}
