package com.aulaodevsuperior.nathan.dslist.controller;

import com.aulaodevsuperior.nathan.dslist.dto.GameMinDTO;
import com.aulaodevsuperior.nathan.dslist.entities.Game;
import com.aulaodevsuperior.nathan.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;
    @GetMapping
    public List<GameMinDTO> findAll(){
     //  List<GameMinDTO> gameMinDTOS = gameService.findAll();
       return gameService.findAll();
    }
}
