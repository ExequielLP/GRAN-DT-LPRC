package spring.ecosystem.rest_api_template.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.ecosystem.rest_api_template.dto.JugadoresDTO;
import spring.ecosystem.rest_api_template.entities.Jugador;
import spring.ecosystem.rest_api_template.enums.Posicion;
import spring.ecosystem.rest_api_template.repositories.JugadoresRepository;
import spring.ecosystem.rest_api_template.services.interfaces.IJugadorService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class JugadoresService implements IJugadorService {

    @Autowired
    private JugadoresRepository jugadoresRepository;

    @Override
    public List<JugadoresDTO> listJugadoresDTO(Posicion posicion) {

        return jugadoresRepository.findByPosicion(posicion).stream().map(
                jugador -> new JugadoresDTO(jugador.getFirstName(), jugador.getLastName())
        ).toList();
    }


    public void registerPlayer(Jugador jugador) {
        jugadoresRepository.save(new Jugador(jugador.getFirstName(), jugador.getLastName(), jugador.getPosicion(), jugador.getPuntaje(), jugador.getPartidosJugados()));
    }
}
