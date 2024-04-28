package pe.edu.upc.EduPack_Solutions_sem5.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upc.EduPack_Solutions_sem5.entities.Pedido;

@Repository
public interface IPedidoRepository extends JpaRepository<Pedido, Integer> {
	@Query(value = "SELECT sum(total_pedido) AS total_pedidos\n" +
			"FROM pedido\n" +
			"WHERE fecha_pedido = :fecha;", nativeQuery = true)
	Double TotalPedidoPorFecha(@Param("fecha")LocalDate fecha);
}
