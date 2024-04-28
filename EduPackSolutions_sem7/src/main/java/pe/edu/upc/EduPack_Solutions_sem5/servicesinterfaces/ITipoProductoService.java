package pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces;

import pe.edu.upc.EduPack_Solutions_sem5.entities.TipoProducto;

import java.util.List;

public interface ITipoProductoService {
    public void insert(TipoProducto tipoProducto);
    public List<TipoProducto> list();
    public void delete(int id);
    public TipoProducto listid(int id);
}
