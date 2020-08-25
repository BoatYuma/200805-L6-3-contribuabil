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
        String mesaj = "Contribuabil: " + this.getNume() + "\n \n";
        for (Proprietati p : proprietati) {
            if(p!=null)
            mesaj=mesaj+p.toString();
        }
    return mesaj;
    }

}
