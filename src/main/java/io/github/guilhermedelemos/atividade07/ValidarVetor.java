/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.guilhermedelemos.atividade07;

/**
 *
 * @author guilherme
 */
public class ValidarVetor {

    public void validar(double[] entrada) throws Exception {
        if (entrada == null) {
            throw new Exception("vetor nao pode ser nulo");
        }
        if(entrada.length == 0) {
            throw new Exception("Vetor com zero elementos");
        }
    }

}
