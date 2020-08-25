package com.company;

public class Teren extends Proprietati {
    private int rang;

    public Teren(String strada, int numar, int suprafata, int rang) {
        super.setStrada(strada);
        super.setNumar(numar);
        super.setSuprafata(suprafata);
        this.rang = rang;
    }

    public int getRang() {
        return rang;
    }

    public String toString() {
        String mesaj;
        mesaj = "Contribuabil: " + this.nume + "\n \n";
        for (Proprietati p : proprietati) {
            mesaj = mesaj + "Teren: Strada " + p.getStrada() + " nr " + p.getNumar() + "\n Suprafata: " + p.getSuprafata() + ", Rang: " + ((Teren) p).getRang() + "\n Cost:" + ((350 * p.getSuprafata()) / ((Teren) p).getRang()) + "\n";
        }
        return mesaj;
    }
}
