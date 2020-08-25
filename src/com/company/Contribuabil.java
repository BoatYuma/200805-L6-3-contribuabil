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

    public String toString() {
        String mesaj;
        mesaj = "Contribuabil: " + this.nume + "\n \n";
        for (Proprietati p : proprietati) {
            if (p instanceof Cladire) {
                mesaj = mesaj + "Cladire: Strada " + p.getStrada() + " nr " + p.getNumar() + "\n Suprafata: " + p.getSuprafata() + "\n Cost:" + (500 * p.getSuprafata()) + "\n";
            } else if (p instanceof Teren) {
                mesaj = mesaj + "Teren: Strada " + p.getStrada() + " nr " + p.getNumar() + "\n Suprafata: " + p.getSuprafata() + ", Rang: " + ((Teren) p).getRang() + "\n Cost:" + ((350 * p.getSuprafata()) / ((Teren) p).getRang()) + "\n";
            }

        }
        return mesaj;
    }
}
