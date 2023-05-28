package com.example.component;

import com.example.entity.Joke;
import com.example.demo.SampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class JokeHandler {
    private static Logger LOG= LoggerFactory.getLogger(JokeHandler.class);

    @Autowired
    private SampleService sampleService;

    @GetMapping("getJokes")
    public Mono<Joke>  getJoke()
    {
        return sampleService.getRndomJoke();
    }
}
