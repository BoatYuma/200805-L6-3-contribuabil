package com.company;

public class Contribuabil {
    private String nume;
    private String cnp;
    private Proprietati[] proprietati = new Proprietati[10];

    public Contribuabil(String nume, String cnp, Proprietati[] proprietati) {
        this.nume = nume;
        this.cnp = cnp;
        this.proprietati = proprietati;
    }

    public String getNume() {
        return nume;
    }

    public Proprietati[] getProprietati() {
        return proprietati;
    }
}
