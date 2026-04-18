package spring.ecosystem.rest_api_template.services.interfaces;

import spring.ecosystem.rest_api_template.dto.PlayerDTO;
import spring.ecosystem.rest_api_template.enums.Position;

import java.util.List;

public interface IJugadorService {
    List<PlayerDTO> listJugadoresDTO(Position position);
    List<PlayerDTO>playerList();

}
