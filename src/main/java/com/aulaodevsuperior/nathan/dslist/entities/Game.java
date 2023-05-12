package com.aulaodevsuperior.nathan.dslist.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import jakarta.websocket.Encoder;
import lombok.*;
import org.hibernate.validator.constraints.URL;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(of = {"id"})
@Table(name = "tb_game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name = "game_year")
    @Size(min = 4, max = 4)//definindo o quantos números podem possuir o ano
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    @URL
    private String imgUrl;
    @Column(columnDefinition = "TEXT")
    private String shortDescription;
    @Column(columnDefinition = "TEXT")
    private String longDescription;

}
