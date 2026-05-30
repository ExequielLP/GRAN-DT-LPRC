package spring.ecosystem.rest_api_template.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.ecosystem.rest_api_template.dto.PlayerDTO;
import spring.ecosystem.rest_api_template.entities.Player;
import spring.ecosystem.rest_api_template.enums.Position;
import spring.ecosystem.rest_api_template.mappers.UserMapper;
import spring.ecosystem.rest_api_template.repositories.PlayerRepository;
import spring.ecosystem.rest_api_template.services.interfaces.IJugadorService;

import java.util.List;

@Service
public class PlayerService implements IJugadorService {
    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public List<PlayerDTO> listJugadoresDTO(Position position) {

        return playerRepository.findByPosition(position).stream().map(
                jugador -> new PlayerDTO(jugador.getId(), jugador.getFirstName(), jugador.getLastName(), jugador.getPosition(), jugador.getPuntaje())
        ).toList();
    }

    @Override
    public List<PlayerDTO> playerList() {
        System.out.println("3333333");
        System.out.println(playerRepository.findAll());
        return playerRepository.findAll().stream().map(player -> new PlayerDTO(player.getId(), player.getFirstName(), player.getLastName(), player.getPosition(), player.getPuntaje())).toList();
    }


    public void registerPlayer(PlayerDTO playerDTO) {
        playerRepository.save(new Player(playerDTO.getFirstName(), playerDTO.getLastName(), playerDTO.getPosition(), playerDTO.getPuntaje()));
    }
}
