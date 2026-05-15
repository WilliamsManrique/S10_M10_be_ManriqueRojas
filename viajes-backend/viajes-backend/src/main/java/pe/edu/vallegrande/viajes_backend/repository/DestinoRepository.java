package pe.edu.vallegrande.viajes_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.vallegrande.viajes_backend.model.Destino;

public interface DestinoRepository extends JpaRepository<Destino, Integer> {
}