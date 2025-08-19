package com.example.DSList.services;


import com.example.DSList.DTO.GameDTO;
import com.example.DSList.DTO.GameListDTO;
import com.example.DSList.DTO.GameMinDTO;
import com.example.DSList.entities.GameList;
import com.example.DSList.entities.Games;
import com.example.DSList.repositories.GameListRepository;
import com.example.DSList.repositories.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return  result.stream().map(x -> new GameListDTO(x)).toList();

    }


}
