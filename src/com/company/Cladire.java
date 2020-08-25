package com.company;

public class Cladire extends Proprietati {
    public Cladire(String strada, int numar, int suprafata) {
        super.setStrada(strada);
        super.setNumar(numar);
        super.setSuprafata(suprafata);
    }
    public String toString() {
        String mesaj;
        mesaj = "Contribuabil: " + contribuabil.getNume() + "\n \n";
        for (Proprietati p : contribuabil.getProprietati()) {
            mesaj = mesaj + "Cladire: Strada " + p.getStrada() + " nr " + p.getNumar() + "\n Suprafata: " + p.getSuprafata() + "\n Cost:" + (500 * p.getSuprafata()) + "\n";
        }
        return mesaj;
    }
}
