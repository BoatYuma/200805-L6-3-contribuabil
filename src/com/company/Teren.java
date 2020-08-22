package com.company;

public class Teren extends Proprietati{
    int rang;
    public Teren(String strada, int numar, int suprafata, int rang) {
        super.strada=strada;
        super.numar=numar;
        super.suprafata=suprafata;
        this.rang=rang;
    }
}
