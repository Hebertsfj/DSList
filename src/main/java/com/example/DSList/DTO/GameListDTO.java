package com.example.DSList.DTO;

import com.example.DSList.entities.GameList;

public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(){}

    public GameListDTO(GameList entity) {
        name = entity.getName();
        id = entity.getId();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
