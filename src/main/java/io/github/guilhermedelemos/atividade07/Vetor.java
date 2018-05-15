/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.guilhermedelemos.atividade07;

import java.util.Arrays;

/**
 *
 * @author guilherme
 */
public class Vetor {

    public double mediana(double[] v) {
        Arrays.sort(v);
        int meio = v.length / 2;
        if (v.length % 2 == 0) //módulo (resto da divisão)
            return (v[meio-1] + v[meio]) / 2.0;
        else
            return v[meio];
    }

}
