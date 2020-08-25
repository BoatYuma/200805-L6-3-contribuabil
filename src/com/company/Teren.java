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
}
