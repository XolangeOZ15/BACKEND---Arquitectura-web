package pe.edu.upc.EduPack_Solutions_sem5.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.EduPack_Solutions_sem5.entities.DetallePedido;
import pe.edu.upc.EduPack_Solutions_sem5.entities.Pedido;
import pe.edu.upc.EduPack_Solutions_sem5.entities.Producto;
import pe.edu.upc.EduPack_Solutions_sem5.repositories.IDetallePedidoRepository;
import pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces.IDetallePedidoService;

import java.util.List;

@Service
public class DetallePedidoServiceImplement implements IDetallePedidoService {
    @Autowired
    private IDetallePedidoRepository dR;
    @Autowired
    private ProductoServiceImplement ps;
    @Override
    public void insertar(DetallePedido dp) {
        Producto producto = dp.getProducto();
        int cantidadPedido = dp.getCantidadPedido();
        if (cantidadPedido > producto.getStockProducto()) {
            throw new IllegalArgumentException("La cantidad solicitada es mayor que el stock disponible");
        }
        dR.save(dp);
        ps.actualizarStockProducto(producto, cantidadPedido);
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

    @Override
    public List<String[]> CantidadPedidosPorEstado() {
    return dR.CantidadPedidosPorEstado();
}
}