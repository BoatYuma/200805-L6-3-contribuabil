package com.company;

public class Teren extends Proprietati {
    private final int rang;

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
        return "Teren: Strada " + super.getStrada() + " nr " + super.getNumar() + "\n Suprafata: " + super.getSuprafata() + ", Rang: " + this.getRang() + "\n Cost:" + ((350 * super.getSuprafata()) / this.getRang()) + "\n";
    }
}
