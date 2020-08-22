package com.company;

public class Contribuabil {
    String nume;
    String cnp;
    Proprietati[] proprietati=new Proprietati[10];

    public Contribuabil(String nume, String cnp, Proprietati[] proprietati) {
        this.nume = nume;
        this.cnp = cnp;
        this.proprietati = proprietati;
    }

    public String toString(){
        String mesaj;
        mesaj = "Contribuabil: "+this.nume+"\n \n";
        for (Proprietati p: proprietati) {
            if (p instanceof Cladire){
                mesaj=mesaj+"Cladire: Strada "+p.strada+" nr "+p.numar+"\n Suprafata: "+p.suprafata+"\n Cost:"+ (500*p.suprafata)+"\n";
            }
            else if (p instanceof Teren){
                mesaj=mesaj+"Teren: Strada "+p.strada+" nr "+p.numar+"\n Suprafata: "+p.suprafata+", Rang: "+((Teren) p).rang+"\n Cost:"+ ((350*p.suprafata)/((Teren)p).rang)+"\n";
            }

        }
        return mesaj;
    }
}
