package com.example.service;

import com.example.entity.Joke;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class SampleService {

    private static Logger LOG=LoggerFactory.getLogger(SampleService.class);

    public Mono<Joke> getRndomJoke() {

        LOG.info("Jokes service Called");
        WebClient webClient2=WebClient.create("https://official-joke-api.appspot.com");
        Mono<Joke>  responseMono=webClient2.get()
                .uri("/random_joke")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Joke.class);
        return responseMono;

    }
}
