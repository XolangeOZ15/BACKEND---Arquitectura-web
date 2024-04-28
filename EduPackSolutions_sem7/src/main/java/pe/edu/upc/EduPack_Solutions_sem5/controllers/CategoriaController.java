package pe.edu.upc.EduPack_Solutions_sem5.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.EduPack_Solutions_sem5.dtos.CategoriaDTO;
import pe.edu.upc.EduPack_Solutions_sem5.entities.Categoria;
import pe.edu.upc.EduPack_Solutions_sem5.servicesinterfaces.ICategoriaService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@PreAuthorize("hasAuthority('admin')")
@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private ICategoriaService cS;
    @PostMapping
    public void insertar(@RequestBody CategoriaDTO categoriaDTO) {
        ModelMapper m = new ModelMapper();
        Categoria c = m.map(categoriaDTO, Categoria.class);
        cS.insert(c);
    }
    @PutMapping
    public void modificar(@RequestBody CategoriaDTO categoriaDTO) {
        ModelMapper m = new ModelMapper();
        Categoria c = m.map(categoriaDTO, Categoria.class);
        cS.insert(c);
    }
    @GetMapping
    public List<CategoriaDTO> listar(){
        return cS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,CategoriaDTO.class);
        }).collect(Collectors.toList());}


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable ("id") Integer id){
        cS.delete(id);
    }
    @GetMapping("/{id}")
    public CategoriaDTO listarid(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        CategoriaDTO dto=m.map(cS.listId(id),CategoriaDTO.class);
        return dto;
    }
    @GetMapping("/kaletbconsulta01")
    public List<CategoriaDTO> CategoriasMasRepetidas() {
        List<String[]> categoriasRepetidas = cS.CategoriasMasRepetidas();
        List<CategoriaDTO> resultado = new ArrayList<>();

        for (String[] columna : categoriasRepetidas) {
            CategoriaDTO dto = new CategoriaDTO();
            dto.setIdCategoria(Integer.parseInt(columna[0]));
            dto.setCantidad_de_categorias(Integer.parseInt(columna[1]));
            resultado.add(dto);
        }
        return resultado;
    }
}
