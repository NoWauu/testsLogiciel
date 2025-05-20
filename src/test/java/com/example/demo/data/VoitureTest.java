package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
         Voiture voiture = new Voiture("McLaren", 100_000);
         assertAll(
                 () -> assertEquals(100_000, voiture.getPrix(), "Le prix doit être 100 000"),
                 () -> assertEquals("McLaren", voiture.getMarque(), "La marque doit être McLaren")
         );
    }

}
