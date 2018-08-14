package com.example.aluno.myapplication;

import com.orm.SugarRecord;

/**
 * Created by aluno on 14/08/18.
 */

public class Goleiro extends SugarRecord {

    private String nome;
    private double defesaCSE;
    private double defesaCIE;
    private double defesaCSD;
    private double defesaCID;
    private double defesaMeio;
    private double golCSE;

    public Goleiro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDefesaCSE() {
        return defesaCSE;
    }

    public void setDefesaCSE(double defesaCSE) {
        this.defesaCSE = defesaCSE;
    }

    public double getDefesaCIE() {
        return defesaCIE;
    }

    public void setDefesaCIE(double defesaCIE) {
        this.defesaCIE = defesaCIE;
    }

    public double getDefesaCSD() {
        return defesaCSD;
    }

    public void setDefesaCSD(double defesaCSD) {
        this.defesaCSD = defesaCSD;
    }

    public double getDefesaCID() {
        return defesaCID;
    }

    public void setDefesaCID(double defesaCID) {
        this.defesaCID = defesaCID;
    }

    public double getDefesaMeio() {
        return defesaMeio;
    }

    public void setDefesaMeio(double defesaMeio) {
        this.defesaMeio = defesaMeio;
    }
}
