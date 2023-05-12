package com.aulaodevsuperior.nathan.dslist.dto;

import com.aulaodevsuperior.nathan.dslist.entities.Game;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;


@NoArgsConstructor
@Getter
@Setter
public class GameDTO {
    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO(Game game){
        id = game.getId();
        title = game.getTitle();
        year = game.getYear();
        genre = game.getGenre();
        platforms = game.getPlatforms();
        score = game.getScore();
        imgUrl = game.getImgUrl();
        shortDescription = game.getShortDescription();
        longDescription = game.getLongDescription();
    }
}
