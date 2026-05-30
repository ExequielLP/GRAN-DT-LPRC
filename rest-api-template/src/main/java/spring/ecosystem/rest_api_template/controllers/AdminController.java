package spring.ecosystem.rest_api_template.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.ecosystem.rest_api_template.dto.PlayerDTO;
import spring.ecosystem.rest_api_template.dto.UserDTO;
import spring.ecosystem.rest_api_template.entities.Player;
import spring.ecosystem.rest_api_template.services.impl.AdminService;
import spring.ecosystem.rest_api_template.services.impl.PlayerService;
import spring.ecosystem.rest_api_template.services.impl.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private PlayerService playerService;
    @Autowired
    private UserService userService;

    @Autowired
    private AdminService adminService;

    // vemos que hacemos aqui
    @PostMapping("/createPlayer")
    public void registerPlayer(@RequestBody PlayerDTO playerDTO) {
        playerService.registerPlayer(playerDTO);
    }

//    @GetMapping("/listUser")
//    public ResponseEntity<List<UserDTO>> getAllUsers() {
//        return ResponseEntity.ok(userService.getAllUsers());
//    }

    @PostMapping("/postResultados")
    public void postResult(@RequestBody List<PlayerDTO> listPlayers) {
        adminService.procesarResultados(listPlayers);
    }

    @GetMapping("/listUsers")
    ResponseEntity<List<UserDTO>> listUsers() {
        System.out.println(userService.listUser());
        return ResponseEntity.ok(userService.listUser());
    }


}

