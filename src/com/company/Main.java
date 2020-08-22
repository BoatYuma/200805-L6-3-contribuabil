package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Contribuabil[] contribuabil = new Contribuabil[10];

        Proprietati[] proprietati = new Proprietati[10];
        proprietati[0] = new Cladire("Parvan", 2, 20);
        proprietati[1] = new Teren("Parvan", 2, 10, 1);
        proprietati[2] = new Cladire("Lugoj", 4, 25);
        contribuabil[0] = new Contribuabil("Ion Popescu", "1801218423355", proprietati);

        System.out.println(contribuabil[0]);
    }
}
