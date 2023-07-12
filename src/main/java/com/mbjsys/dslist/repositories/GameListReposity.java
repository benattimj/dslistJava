package com.mbjsys.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbjsys.dslist.entities.GameList;

public interface GameListReposity extends JpaRepository <GameList, Long > {
	
	

}
