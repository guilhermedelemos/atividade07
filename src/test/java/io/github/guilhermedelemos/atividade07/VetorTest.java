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
        double[] entrada = {5.8, 4.6, 9.2};
        Vetor v = new Vetor();
        assertEquals(5.8, v.mediana(entrada), 0.1);
    }

}
