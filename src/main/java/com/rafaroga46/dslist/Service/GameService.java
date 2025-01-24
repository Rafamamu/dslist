package com.rafaroga46.dslist.Service;

import com.rafaroga46.dslist.DTO.GameMinDTO;
import com.rafaroga46.dslist.Game;
import com.rafaroga46.dslist.Repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {


    @Autowired
    private GameRepository gameRepository;

    // Listar todos os jogos usando DTO
    public List<GameMinDTO> findAll() {
       List<Game> result = gameRepository.findAll();
       return result.stream()
               .map(x -> new GameMinDTO(x)).toList();
    }
}
