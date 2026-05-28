package spring.ecosystem.rest_api_template.dto;

import lombok.*;
import spring.ecosystem.rest_api_template.enums.Position;

import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class PlayerDTO {
    private UUID id;
    private String firstName;
    private String lastName;
    private Position position;
    private double puntaje;

}
