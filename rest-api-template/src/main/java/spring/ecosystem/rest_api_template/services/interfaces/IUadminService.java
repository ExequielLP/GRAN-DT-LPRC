package spring.ecosystem.rest_api_template.services.interfaces;

import spring.ecosystem.rest_api_template.dto.PlayerDTO;

import java.util.List;

public interface IUadminService {
    void procesarResultados(List<PlayerDTO> resultados);
}
