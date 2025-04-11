package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
         Voiture voiture = new Voiture("McLaren", 100000);
         assertEquals("McLaren", voiture.getMarque());
         assertEquals(100000, voiture.getPrix());
    }

}
