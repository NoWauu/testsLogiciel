package com.example.demo.service;

import com.example.demo.data.Voiture;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.*;


@SpringBootTest
public class StatistiqueTests {

    @MockBean
    StatistiqueImpl statistiqueImpl;

    @Test
    public void test_ajouter() {
        doNothing().when(statistiqueImpl).ajouter(new Voiture());
    }

    @Test
    public void test_prix_moyen_voiture_simple() {
        doNothing().when(statistiqueImpl).ajouter(new Voiture("McLaren", 1_000_000));
        when(statistiqueImpl.prixMoyen()).thenReturn(new Echantillon(1, 1_000_000));
    }

    @Test
    public void test_prix_moyen_multi_voitures() {
        doNothing().when(statistiqueImpl).ajouter(new Voiture("McLaren", 1_000_000));
        doNothing().when(statistiqueImpl).ajouter(new Voiture("Ferrari", 500_000));
        when(statistiqueImpl.prixMoyen()).thenReturn(new Echantillon(2, 750_000));
    }

    @Test
    public void test_prix_moyen_exception() {
        doThrow(ArithmeticException.class).when(statistiqueImpl).prixMoyen();
    }

}
