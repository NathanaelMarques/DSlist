package com.aulaodevsuperior.nathan.dslist.dto;

import com.aulaodevsuperior.nathan.dslist.entities.Game;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;


@NoArgsConstructor
@Getter
@Setter
public class GameDTO extends Game {

    public GameDTO(Game game){
        BeanUtils.copyProperties(game,this);
    }
}
