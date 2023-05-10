package com.aulaodevsuperior.nathan.dslist.dto;

import com.aulaodevsuperior.nathan.dslist.entities.GameList;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@NoArgsConstructor
@Getter
@Setter
public class GameListDTO extends GameList {
    public GameListDTO(GameList gameList){
        this.setId(gameList.getId());
        this.setId(gameList.getId());
    }
}
