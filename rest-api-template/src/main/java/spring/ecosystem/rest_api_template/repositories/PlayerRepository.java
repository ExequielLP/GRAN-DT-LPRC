package spring.ecosystem.rest_api_template.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.ecosystem.rest_api_template.entities.Player;
import spring.ecosystem.rest_api_template.enums.Posicion;

import java.util.List;
import java.util.UUID;

public interface JugadoresRepository extends JpaRepository<Player, UUID> {
List<Player> findByPosicion(Posicion posicion);
}
