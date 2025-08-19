package com.example.DSList.services;


import com.example.DSList.DTO.GameDTO;
import com.example.DSList.DTO.GameMinDTO;
import com.example.DSList.entities.Games;
import com.example.DSList.projections.GameMinProjection;
import com.example.DSList.repositories.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GamesRepository gamesRepository;
    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Games result = gamesRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Games> result = gamesRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gamesRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }



}
