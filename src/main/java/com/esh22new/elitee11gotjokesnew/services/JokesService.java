package com.esh22new.elitee11gotjokesnew.services;

import com.esh22new.elitee11gotjokesnew.models.Joke;
import com.esh22new.elitee11gotjokesnew.repo.JokeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class JokesService {

    @Autowired
    private JokeRepository jokeRepository;

    //fake database
//
//


    public void saveJoke(Joke joke){
        jokeRepository.save(joke);
    }

    public List<Joke> getAllJokes(){
        List<Joke> jokes = new ArrayList<>();
         jokeRepository.findAll().forEach(jokes::add);
         return jokes;

    }

    public Joke updateJoke(Long jokeId, Joke joke){
        for (Joke j: getAllJokes()) {
            if (j.getId().equals(jokeId)){
                jokeRepository.save(joke);
            }
        }
        return joke;
    }

}
