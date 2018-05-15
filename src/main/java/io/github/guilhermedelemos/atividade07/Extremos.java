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
public class Extremos {

    private double maior;
    private int indiceMaior;
    private double menor;
    private int indiceMenor;

    public Extremos() {
        super();
    }

    public Extremos(double maior, int indiceMaior, double menor, int indiceMenor) {
        this.maior = maior;
        this.indiceMaior = indiceMaior;
        this.menor = menor;
        this.indiceMenor = indiceMenor;
    }

    public double getMaior() {
        return maior;
    }

    public void setMaior(double maior) {
        this.maior = maior;
    }

    public int getIndiceMaior() {
        return indiceMaior;
    }

    public void setIndiceMaior(int indiceMaior) {
        this.indiceMaior = indiceMaior;
    }

    public double getMenor() {
        return menor;
    }

    public void setMenor(double menor) {
        this.menor = menor;
    }

    public int getIndiceMenor() {
        return indiceMenor;
    }

    public void setIndiceMenor(int indiceMenor) {
        this.indiceMenor = indiceMenor;
    }

}
