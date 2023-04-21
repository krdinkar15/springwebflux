package com.example.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class HelloWorldWebClient {
    private static Logger LOG= LoggerFactory.getLogger(HelloWorldWebClient.class);

    public static void main(String[] args)
    {
        WebClient webClient=WebClient.create("http://localhost:8080");
        Mono<ClientResponse> result=webClient.get()
                .uri("/helloWorld")
                .accept(MediaType.TEXT_PLAIN)
                .exchange();

        LOG.info("Result = {}",result.flatMap(res->res.bodyToMono(String.class)).block());
    }
}
