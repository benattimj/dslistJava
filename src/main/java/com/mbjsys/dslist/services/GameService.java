package com.mbjsys.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbjsys.dslist.dto.GameDTO;
import com.mbjsys.dslist.dto.GameMinDto;
import com.mbjsys.dslist.entities.Game;
import com.mbjsys.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);

	}

	public List<GameMinDto> findAll() {
		var result = gameRepository.findAll();
		List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
		return dto;
	}

}
