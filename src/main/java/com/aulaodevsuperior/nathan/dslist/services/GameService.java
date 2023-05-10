package com.aulaodevsuperior.nathan.dslist.services;

import com.aulaodevsuperior.nathan.dslist.dto.GameMinDTO;
import com.aulaodevsuperior.nathan.dslist.entities.Game;
import com.aulaodevsuperior.nathan.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findAll(){
       var gameList = gameRepository.findAll();
       return gameList.stream().map(x -> new GameMinDTO(x)).toList();

    }
}
