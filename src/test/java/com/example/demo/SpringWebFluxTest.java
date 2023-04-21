package com.example.demo;

import com.example.entity.Joke;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringWebFluxTest {

    @Autowired
    private WebTestClient webTestClient;


    @Test
    public void testHelloWorld()
    {
        webTestClient.get().uri("/helloWorld").accept(MediaType.TEXT_PLAIN)
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class).isEqualTo("Hello World");
    }

    @Test
    public void testgetJoke()
    {
        webTestClient.get().uri("https://official-joke-api.appspot.com/random_joke").accept(MediaType.TEXT_PLAIN)
                .exchange()
                .expectStatus().isOk()
                .expectBody((Joke.class));
    }

}
