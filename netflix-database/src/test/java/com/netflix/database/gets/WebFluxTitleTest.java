package com.netflix.database.gets;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
class WebFluxTitleTest {

	@Autowired
    private WebTestClient webTestClient;
	
	@Test
	void testFindByName() {
		webTestClient.get()
        .uri("/titles/search/findByName?name=Zoom")
        .exchange()
        .expectStatus().isOk()
        .expectBody()
        .jsonPath("$._embedded.title[0].name").isEqualTo("Zoom");
	}

}
