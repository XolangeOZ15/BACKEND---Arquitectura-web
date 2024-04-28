package pe.edu.upc.tipoproducto.servicesinterfaces;

import pe.edu.upc.tipoproducto.entities.TipoProducto;

import java.util.List;

public interface ITipoProductoService {
    public void insert(TipoProducto tipoProducto);
    public List<TipoProducto> list();
    public void delete(int id);
    public TipoProducto listid(int id);
    public List<TipoProducto> findByDescripcionTipoProducto(String name);
}
