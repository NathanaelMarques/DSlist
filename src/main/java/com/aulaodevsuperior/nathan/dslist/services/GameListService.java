package com.aulaodevsuperior.nathan.dslist.services;

import com.aulaodevsuperior.nathan.dslist.entities.GameList;
import com.aulaodevsuperior.nathan.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;
    @Transactional(readOnly = true)
    public List<GameList> findAll(){
        return gameListRepository.findAll();
    }
}
