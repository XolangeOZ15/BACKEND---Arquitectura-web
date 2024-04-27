package pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces;

import pe.edu.upc.EduPack_Solutions_sem5.entities.DetallePedido;
import pe.edu.upc.EduPack_Solutions_sem5.entities.Pedido;

import java.util.List;

public interface IDetallePedidoService {
    public void insertar(DetallePedido dp);
    public List<DetallePedido>list();
    public void delete(int id);
    public DetallePedido listId(int id);
}
