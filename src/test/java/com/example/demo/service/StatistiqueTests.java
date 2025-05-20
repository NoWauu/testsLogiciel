package com.example.demo.service;

import com.example.demo.data.Voiture;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


@SpringBootTest
public class StatistiqueTests {

    @MockBean
    StatistiqueImpl statistiqueImpl;

    @Test
    public void test_ajouter() {
        Voiture voiture = new Voiture("McLaren", 1_000_000);

        statistiqueImpl.ajouter(voiture);
        verify(statistiqueImpl, times(1)).ajouter(voiture);
    }

    @Test
    public void test_prix_moyen() {
        when(statistiqueImpl.prixMoyen()).thenReturn(new Echantillon(2, 750_000));

        Echantillon echantillon = statistiqueImpl.prixMoyen();
        verify(statistiqueImpl, times(1)).prixMoyen();

        assertEquals(2, echantillon.nombreDeVoitures);
        assertEquals(750_000, echantillon.prixMoyen);
    }

}
