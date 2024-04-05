package pe.edu.upc.EduPack_Solutions_sem3.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.EduPack_Solutions_sem3.entities.Pedido;

@Repository
public interface IPedidoRepository extends JpaRepository<Pedido, Integer> {
	public List<Pedido> findByNombrePedido(String name);
}
