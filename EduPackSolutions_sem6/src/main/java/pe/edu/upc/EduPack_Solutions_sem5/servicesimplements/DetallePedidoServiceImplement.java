package pe.edu.upc.EduPack_Solutions_sem5.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.EduPack_Solutions_sem5.entities.DetallePedido;
import pe.edu.upc.EduPack_Solutions_sem5.entities.Pedido;
import pe.edu.upc.EduPack_Solutions_sem5.repositories.IDetallePedidoRepository;
import pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces.IDetallePedidoService;

import java.util.List;

@Service
public class DetallePedidoServiceImplement implements IDetallePedidoService {
    private IDetallePedidoRepository dR;
    @Override
    public void insertar(DetallePedido dp) {
        dR.save(dp);
    }

    @Override
    public List<DetallePedido> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int id) {
        dR.deleteById(id);
    }

    @Override
    public DetallePedido listId(int id) {
        return dR.findById(id).orElse(new DetallePedido());
    }
}
