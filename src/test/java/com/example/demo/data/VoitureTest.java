package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
         Voiture voiture = new Voiture("McLaren", 100_000);
         Assert.isTrue(voiture.getMarque().equals("McLaren"), "La marque doit être McLaren");
         Assert.isTrue(voiture.getPrix() == 100_000, "Le prix doit être 100 000");
    }

}
