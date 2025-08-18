package com.example.DSList.repositories;

import com.example.DSList.entities.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamesRepository extends JpaRepository<Games, Long> {

}
