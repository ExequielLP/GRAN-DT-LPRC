package spring.ecosystem.rest_api_template.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.ecosystem.rest_api_template.dto.UserDTO;
import spring.ecosystem.rest_api_template.entities.Player;
import spring.ecosystem.rest_api_template.services.impl.PlayerService;
import spring.ecosystem.rest_api_template.services.impl.UserService;

import java.util.List;

@RestController
@RequestMapping("/apli/admin")
public class AdminController {
    @Autowired
    private PlayerService jugadoresService;
    @Autowired
    private UserService userService;
// vemos que hacemos aqui
    public void registerPlayer(@RequestBody Player jugador) {
        jugadoresService.registerPlayer(jugador);
    }

    @GetMapping("/listUser")
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

}
