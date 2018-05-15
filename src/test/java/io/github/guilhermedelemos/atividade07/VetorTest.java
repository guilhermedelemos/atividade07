/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.guilhermedelemos.atividade07;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import static org.mockito.Mockito.*;

/**
 *
 * @author guilherme
 */
public class VetorTest {

    private static Vetor v;
    private static ValidarVetor vv;
    private static double[] vetorNulo, vetorVazio, vetorPar, vetorImpar, vetorGrande;

    public VetorTest() {
    }

    @Before
    public void setUp() {
        v = new Vetor();
        vv = new ValidarVetor();
        vetorNulo = null;
        double[] vazio = {};
        vetorVazio = vazio;
        double[] par = {5.8, 4.6, 9.2, 1.1};
        vetorPar = par;
        double[] impar = {5.8, 4.6, 9.2};
        vetorImpar = impar;
        double[] grande = {5.8, 4.6, 9.2, 1.1, 4.0, 1.6, 3.0}; // média=4,1857
        vetorGrande = grande;

    }

    @Test(expected = Exception.class)
    public void validarVetorNuloTest() throws Exception {
        vv.validar(vetorNulo);
    }

    @Test
    public void validarVetorVazioTest() throws Exception {
        try {
            vv.validar(vetorVazio);
        } catch (Exception e) {
            assertEquals("Vetor com zero elementos", e.getMessage());
        }
    }

    @Test
    public void medianaTest() {
        assertEquals(5.8, v.mediana(vetorImpar), 0.1);
        assertEquals(5.2, v.mediana(vetorPar), 0.1);
    }

    @Test
    public void mediaTest() {
        assertEquals(6.53, v.media(vetorImpar), 0.1);
    }

    @Test
    public void extremosTest() {
        Extremos e = v.getExtremos(vetorGrande);
        assertEquals(1.1, e.getMenor(), 0.1);
        assertEquals(3, e.getIndiceMenor());
        assertEquals(9.2, e.getMaior(), 0.1);
        assertEquals(2, e.getIndiceMaior());
    }
    
    @Test
    public void acimaMediaTest() {
        int qtde = v.getQtdeValoresAcimaMedia(vetorGrande);
        assertEquals(3, qtde);
    }
    
    @Test
    public void abaixoMediaTest() {
        int qtde = v.getQtdeValoresAbaixoMedia(vetorGrande);
        assertEquals(4, qtde);
    }
    
    @Test
    public void varianciaTest() {
        double variancia = v.variancia(vetorImpar);
        assertEquals(3.7955, variancia, 0.1);
    }
    
    @Test
    public void desvioPadraoTest() {
        double desvioPadrao = v.desvioPadrao(vetorImpar);
        assertEquals(1.9448, desvioPadrao, 0.1);
    }

}
