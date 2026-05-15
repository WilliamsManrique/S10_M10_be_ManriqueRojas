package pe.edu.vallegrande.viajes_backend.controller;

import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.viajes_backend.model.Destino;
import pe.edu.vallegrande.viajes_backend.service.DestinoService;

import java.util.List;

@RestController
@RequestMapping("/api/destinos")
@CrossOrigin("*")
public class DestinoController {

    private final DestinoService service;

    public DestinoController(DestinoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Destino> listar() {
        return service.listar();
    }

    @PostMapping
    public Destino guardar(@RequestBody Destino destino) {
        return service.guardar(destino);
    }

    @PutMapping("/{id}")
    public Destino actualizar(
            @PathVariable Integer id,
            @RequestBody Destino destino
    ) {
        return service.actualizar(id, destino);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }
}