package com.example.DSList.services;


import com.example.DSList.DTO.GameMinDTO;
import com.example.DSList.entities.Games;
import com.example.DSList.repositories.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GamesRepository gamesRepository;
    public List<GameMinDTO> findAll(){
        List<Games> result = gamesRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
