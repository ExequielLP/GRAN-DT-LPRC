package spring.ecosystem.rest_api_template.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.ecosystem.rest_api_template.dto.PlayerDTO;
import spring.ecosystem.rest_api_template.enums.Position;
import spring.ecosystem.rest_api_template.services.impl.PlayerService;

import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayersController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/jugadores/{posicoin}")
    List<PlayerDTO> jugadores(@PathVariable Position posicoin) {

        return playerService.listJugadoresDTO(posicoin);
    }

    @GetMapping("/listPlayers")
    List<PlayerDTO> playersDtoList() {
        return playerService.playerList();
    }

}
