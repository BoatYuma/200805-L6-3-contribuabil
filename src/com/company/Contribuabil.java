package com.company;

public class Contribuabil {
    private String nume;
    private String cnp;
    private final Proprietati[] proprietati;

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

    public String toString() {
        int suma = 0;
        String mesaj = "Contribuabil: " + this.getNume() + "\n \n";
        for (Proprietati proprietate : proprietati) {
            if (proprietate != null) {
                mesaj = mesaj + proprietate.toString();
                suma = suma + proprietate.getSuma();
            }
        }
        return mesaj + "\n Suma:" + suma;
    }
}