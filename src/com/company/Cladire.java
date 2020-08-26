package com.company;

public class Cladire extends Proprietati {
    public Cladire(String strada, int numar, int suprafata) {
        super.setStrada(strada);
        super.setNumar(numar);
        super.setSuprafata(suprafata);
    }

    public String toString() {
        return "Cladire: Strada " + super.getStrada() + " nr " + super.getNumar() + "\n Suprafata: " + super.getSuprafata() + "\n Cost:" + (500 * super.getSuprafata()) + "\n";
    }

    public int getSuma() {
        return (500 * super.getSuprafata());
    }
}
