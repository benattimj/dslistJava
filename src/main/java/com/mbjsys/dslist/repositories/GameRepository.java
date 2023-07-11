package com.mbjsys.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbjsys.dslist.entities.Game;

public interface GameRepository extends JpaRepository <Game, Long > {
	
	

}
