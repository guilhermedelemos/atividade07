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
    public void validarVetorTest() throws Exception{
        double[] entrada = null;
        ValidarVetor vv = new ValidarVetor();
        vv.validar(entrada);
    }
    
}
