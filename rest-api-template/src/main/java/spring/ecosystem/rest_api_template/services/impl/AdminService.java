package spring.ecosystem.rest_api_template.services.impl;

import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.ecosystem.rest_api_template.dto.PlayerDTO;
import spring.ecosystem.rest_api_template.repositories.PlayerRepository;
import spring.ecosystem.rest_api_template.services.interfaces.IUadminService;

import java.util.List;

@Service
public class AdminService implements IUadminService {

    @Autowired
    private PlayerRepository playerRepository;


    @Transactional
    public void procesarResultados(List<PlayerDTO> resultados) {
        for (PlayerDTO dto : resultados) {
            playerRepository.sumarPuntaje(dto.getId(), dto.getPuntaje());
        }
    }
}
