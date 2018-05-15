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
        if (v.length % 2 == 0) {
            //módulo (resto da divisão)
            return (v[meio - 1] + v[meio]) / 2.0;
        } else {
            return v[meio];
        }
    }

    public double media(double[] v) {
        double resultado = 0.0;
        for (int i = 0; i < v.length; i++) {
            resultado += v[i];
        }
        return resultado / v.length;
    }
    
    public Extremos getExtremos(double[] v) {
        Extremos e = new Extremos();
        e.setMenor(v[0]);
        e.setMaior(v[0]);
        for(int i=0;i<v.length;i++) {
            if(v[i] < e.getMenor()) {
                e.setMenor(v[i]);
                e.setIndiceMenor(i);
            }
            if(v[i] > e.getMaior()) {
                e.setMaior(v[i]);
                e.setIndiceMaior(i);
            }
        }
        return e;
    }

}
