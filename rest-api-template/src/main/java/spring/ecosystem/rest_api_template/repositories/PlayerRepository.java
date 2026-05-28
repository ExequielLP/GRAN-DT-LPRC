package spring.ecosystem.rest_api_template.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import spring.ecosystem.rest_api_template.entities.Player;
import spring.ecosystem.rest_api_template.enums.Position;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

public interface PlayerRepository extends JpaRepository<Player, UUID> {
List<Player> findByPosition(Position position);

    @Modifying
    @Query("UPDATE Player p SET p.puntaje = p.puntaje + :puntaje WHERE p.id = :id")
    void sumarPuntaje(@Param("id") UUID id, @Param("puntaje") double puntaje);
}
