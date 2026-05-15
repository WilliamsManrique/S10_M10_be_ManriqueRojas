package pe.edu.vallegrande.viajes_backend.service;

import pe.edu.vallegrande.viajes_backend.model.Destino;

import java.util.List;

public interface DestinoService {

    List<Destino> listar();

    Destino guardar(Destino destino);

    Destino actualizar(Integer id, Destino destino);

    void eliminar(Integer id);
}