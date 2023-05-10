package com.aulaodevsuperior.nathan.dslist.repositories;

import com.aulaodevsuperior.nathan.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList,Long> {
}
