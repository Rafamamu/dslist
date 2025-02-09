package com.rafaroga46.dslist.Controller;

import com.rafaroga46.dslist.DTO.GameMinDTO;
import com.rafaroga46.dslist.Game;
import com.rafaroga46.dslist.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;


    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll();

        return result;
    }
}
