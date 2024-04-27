package pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces;


import java.util.List;

import pe.edu.upc.EduPack_Solutions_sem5.entities.Pedido;

public interface IPedidoService {
	public void insert(Pedido pedido);
	public List<Pedido> list();
	public void delete(int id);
	public Pedido listId(int id);

}
