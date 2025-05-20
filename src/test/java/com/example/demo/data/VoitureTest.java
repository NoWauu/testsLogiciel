package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void creerVoitureVide() {
            Voiture voiture = new Voiture();
            assertAll(
                    () -> assertEquals(0, voiture.getPrix(), "Le prix doit être 0"),
                    () -> assertNull(voiture.getMarque(), "La marque doit être null")
            );
    }

    @Test
    void testGetSetId(){
         Voiture voiture = new Voiture("McLaren", 100_000);
         voiture.setId(1);
         assertAll(
                 () -> assertEquals(1, voiture.getId(), "L'id doit être 1"),
                 () -> assertEquals(100_000, voiture.getPrix(), "Le prix doit être 100 000"),
                 () -> assertEquals("McLaren", voiture.getMarque(), "La marque doit être McLaren")
         );
    }

    @Test
    void testGetSetMarque(){
         Voiture voiture = new Voiture("McLaren", 100_000);
         voiture.setMarque("Ferrari");
         assertAll(
                 () -> assertEquals(100_000, voiture.getPrix(), "Le prix doit être 100 000"),
                 () -> assertEquals("Ferrari", voiture.getMarque(), "La marque doit être Ferrari")
         );
    }

    @Test
    void testGetSetPrix(){
         Voiture voiture = new Voiture("McLaren", 100_000);
         voiture.setPrix(200_000);
         assertAll(
                 () -> assertEquals(200_000, voiture.getPrix(), "Le prix doit être 200 000"),
                 () -> assertEquals("McLaren", voiture.getMarque(), "La marque doit être McLaren")
         );
    }

    @Test
    void testToString(){
         Voiture voiture = new Voiture("McLaren", 100_000);
         voiture.setId(1);
         String expected = "Car{marque='McLaren', prix=100000, id=1}";
         assertEquals(expected, voiture.toString(), "La méthode toString doit retourner la chaîne attendue");
    }



}
