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
        Voiture voiture = mock(Voiture.class);
        when(voiture.getPrix()).thenReturn(1_000_000);

        Statistique statistique = new StatistiqueImpl();

        statistique.ajouter(voiture);
        statistique.ajouter(voiture);

        Echantillon echantillon = statistique.prixMoyen();

        assertEquals(2, echantillon.getNombreDeVoitures());
        assertEquals(1_000_000, echantillon.getPrixMoyen());
    }

}
