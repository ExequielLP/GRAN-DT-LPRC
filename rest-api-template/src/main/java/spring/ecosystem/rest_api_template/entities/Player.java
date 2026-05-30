package spring.ecosystem.rest_api_template.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import spring.ecosystem.rest_api_template.dto.PlayerDTO;
import spring.ecosystem.rest_api_template.enums.Position;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String firstName;
    private String lastName;
    @Enumerated(EnumType.STRING)
    private Position position;
    private double puntaje;

    public Player(String firstName, String lastName, Position position, double puntaje) {
    }

    public Player(PlayerDTO auxDTO) {
        this.id = auxDTO.getId();
        this.firstName = auxDTO.getFirstName();
        this.lastName = auxDTO.getLastName();
        this.position = auxDTO.getPosition();
    }



}
