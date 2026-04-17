package spring.ecosystem.rest_api_template.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import spring.ecosystem.rest_api_template.enums.Posicion;

import java.util.UUID;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class player {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String firstName;
    private String lastName;
    @Enumerated(EnumType.STRING)
    private Posicion posicion;
    private double puntaje;
    private int partidosJugados;

    public player(String firstName, String lastName, Posicion posicion, double puntaje, int partidosJugados) {
    }
}
