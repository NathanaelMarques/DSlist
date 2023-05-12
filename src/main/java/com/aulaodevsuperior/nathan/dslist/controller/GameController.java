package com.aulaodevsuperior.nathan.dslist.controller;

import com.aulaodevsuperior.nathan.dslist.dto.GameDTO;
import com.aulaodevsuperior.nathan.dslist.dto.GameMinDTO;
import com.aulaodevsuperior.nathan.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){

       return gameService.findAll();
    }
    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
       return gameService.findById(id);
    }



}
