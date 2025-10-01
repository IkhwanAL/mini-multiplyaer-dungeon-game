package com.project.mini_multiplyaer_dungeon.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.mini_multiplyaer_dungeon.entity.Player;
import com.project.mini_multiplyaer_dungeon.repository.PlayerRepository;

@RestController
@RequestMapping("/player")
public class PlayerController {

  private final PlayerRepository playerRepo;
  
  public PlayerController(PlayerRepository playerRepo) {
    this.playerRepo = playerRepo;
  }
  

  @PostMapping
  public Player savePlayer(@RequestBody Player player) {
    return playerRepo.save(player);
  }

  @GetMapping
  public List<Player> getAllPlayer() {
    return playerRepo.findAll();
  }
}
