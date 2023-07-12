package com.mbjsys.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbjsys.dslist.dto.GameListDTO;
import com.mbjsys.dslist.entities.GameList;
import com.mbjsys.dslist.repositories.GameListReposity;

@Service
public class GameListService {

	@Autowired
	private GameListReposity gameListReposity;

	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public List<GameListDTO> findall() {
		List<GameList> result = gameListReposity.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}

}
