package com.aulaodevsuperior.nathan.dslist.repositories;

import com.aulaodevsuperior.nathan.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}
