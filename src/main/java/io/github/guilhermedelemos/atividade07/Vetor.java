/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.guilhermedelemos.atividade07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
        for (int i = 0; i < v.length; i++) {
            if (v[i] < e.getMenor()) {
                e.setMenor(v[i]);
                e.setIndiceMenor(i);
            }
            if (v[i] > e.getMaior()) {
                e.setMaior(v[i]);
                e.setIndiceMaior(i);
            }
        }
        return e;
    }

    public int getQtdeValoresAcimaMedia(double[] v) {
        double media = media(v);
        int contador = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > media) {
                contador++;
            }
        }
        return contador;
    }

    public int getQtdeValoresAbaixoMedia(double[] v) {
        double media = media(v);
        int contador = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] < media) {
                contador++;
            }
        }
        return contador;
    }

    public double variancia(double[] v) {
        double media = media(v);
        double soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma += Math.pow(v[i] - media, 2);
        }
        return soma / v.length;
    }

    public double desvioPadrao(double[] v) {
        return Math.sqrt(variancia(v));
    }

    public double[] encontrarMaiores(double[] v, int qtde) {
        double[] retorno = new double[qtde];
        Arrays.fill(retorno, Integer.MIN_VALUE);
        for (double e : v) {
            if (e > retorno[qtde - 1]) {
                retorno[qtde - 1] = e;
                
                Arrays.sort(retorno);
                double[] apoio = new double[retorno.length];
                int j = retorno.length-1;
                for (int i = 0; i < apoio.length; i++) {
                    apoio[i] = retorno[j];
                    j--;
                }
                retorno = apoio;
            }
        }
        return retorno;
    }

    public double[] encontrarMenores(double[] v, int qtde) {
        /*List<Double> elementos = new ArrayList<>();
        double menor = Double.MAX_VALUE;
        for(int i=0;i<qtde;i++) {
            for(int j=0;j<v.length;j++) {
                if(v[j] < menor) {
                    menor = v[j];
                }
            }
            elementos.add(menor);
        }
        double[] retorno = new double[elementos.size()];
        for(int i=0;i<retorno.length;i++) {
            retorno[i] = elementos.get(i);
        }
        Arrays.sort(retorno);
        return retorno;*/
        double[] retorno = new double[qtde];
        Arrays.fill(retorno, Integer.MAX_VALUE);
        for (double e : v) {
            if (e < retorno[qtde - 1]) {
                retorno[qtde - 1] = e;
                Arrays.sort(retorno);
            }
        }
        return retorno;
    }

}
