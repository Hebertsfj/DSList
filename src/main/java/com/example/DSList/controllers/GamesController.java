package com.example.DSList.controllers;

import com.example.DSList.DTO.GameMinDTO;
import com.example.DSList.entities.Games;
import com.example.DSList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GamesController {
    @Autowired
    private GameService gameService;
    @GetMapping
    public List<GameMinDTO> findAll(){
       List<GameMinDTO> result = gameService.findAll();
       return result;
    }
}
