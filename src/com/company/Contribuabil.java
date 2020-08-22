package com.company;

public class Contribuabil {
    String nume;
    String cnp;
    Proprietati[] proprietati=new Proprietati[10];

    public Contribuabil(String nume, String cnp, Proprietati[] proprietati) {
        this.nume = nume;
        this.cnp = cnp;
        this.proprietati = proprietati;
    }
}
