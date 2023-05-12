package com.aulaodevsuperior.nathan.dslist.services;

import com.aulaodevsuperior.nathan.dslist.dto.GameDTO;
import com.aulaodevsuperior.nathan.dslist.dto.GameMinDTO;
import com.aulaodevsuperior.nathan.dslist.entities.Game;
import com.aulaodevsuperior.nathan.dslist.projections.GameMinProjection;
import com.aulaodevsuperior.nathan.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
       var gameList = gameRepository.findAll();
       return gameList.stream().map(x -> new GameMinDTO(x)).toList();
    }
    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Optional<Game> obj = gameRepository.findById(id);
        return obj.map(x -> new GameDTO(x)).orElseThrow(() -> new ResourceNotFoundException(id));
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }

}
