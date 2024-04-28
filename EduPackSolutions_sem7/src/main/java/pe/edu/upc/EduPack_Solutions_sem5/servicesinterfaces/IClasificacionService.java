package pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces;

import pe.edu.upc.EduPack_Solutions_sem5.entities.Clasificacion;

import java.util.List;

public interface IClasificacionService {
    void insert(Clasificacion clasificacion);

    List<Clasificacion> list();

    void delete(int id);

    Clasificacion listId(int id);
}
