/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.guilhermedelemos.atividade07;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author guilherme
 */
public class VetorTest {

    public VetorTest() {
    }

    @Test(expected = Exception.class)
    public void validarVetorNuloTest() throws Exception {
        double[] entrada = null;
        ValidarVetor vv = new ValidarVetor();
        vv.validar(entrada);
    }

    @Test
    public void validarVetorVazioTest() throws Exception {
        double[] entrada = {};
        ValidarVetor vv = new ValidarVetor();
        try {
            vv.validar(entrada);
        } catch (Exception e) {
            assertEquals("Vetor com zero elementos", e.getMessage());
        }
    }

    @Test
    public void medianaTest() {
        Vetor v = new Vetor();

        double[] entradaImpar = {5.8, 4.6, 9.2};
        assertEquals(5.8, v.mediana(entradaImpar), 0.1);

        double[] entradaPar = {5.8, 4.6, 9.2, 1.1};
        assertEquals(5.2, v.mediana(entradaPar), 0.1);
    }

}
