package pe.edu.vallegrande.viajes_backend.service.impl;

import org.springframework.stereotype.Service;
import pe.edu.vallegrande.viajes_backend.model.Destino;
import pe.edu.vallegrande.viajes_backend.repository.DestinoRepository;
import pe.edu.vallegrande.viajes_backend.service.DestinoService;

import java.util.List;

@Service
public class DestinoServiceImpl implements DestinoService {

    private final DestinoRepository repository;

    public DestinoServiceImpl(DestinoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Destino> listar() {
        return repository.findAll();
    }

    @Override
    public Destino guardar(Destino destino) {
        return repository.save(destino);
    }

    @Override
    public Destino actualizar(Integer id, Destino destino) {

        Destino existente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Destino no encontrado"));

        existente.setNombre(destino.getNombre());
        existente.setDescripcion(destino.getDescripcion());
        existente.setPrecio(destino.getPrecio());
        existente.setImagenUrl(destino.getImagenUrl());

        return repository.save(existente);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}