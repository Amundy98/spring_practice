package com.esh22new.elitee11gotjokesnew.controllers;

import com.esh22new.elitee11gotjokesnew.models.Joke;
import com.esh22new.elitee11gotjokesnew.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JokesController {



    @Autowired
    private JokesService jokesService;

    @PostMapping("/jokes")
    public void addJoke(@RequestBody Joke joke){
    jokesService.saveJoke(joke);
    }



    @GetMapping("/jokes")
    public List<Joke> getAllJokes(){
        return jokesService.getAllJokes();
    }

    @PutMapping("/jokes/{id}")
    public Joke updateJoke(@PathVariable Long id, @RequestBody Joke joke){
        return jokesService.updateJoke(id, joke);
    }


    //come up w a delete functionality- so that we can delete a joke
}
