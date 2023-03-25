package com.formation.epita;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Enfant olivier = new Enfant("Olivier", "Dusopt", 4);
        olivier.presentation();
        Enfant charlotte = new Enfant("Charlotte", "Dupont", 16);
        charlotte.presentation();

        olivier.feterAnniversaire();
        charlotte.feterAnniversaire();
        olivier.jouerAuballon(charlotte);
        charlotte.tomberAmoureux("Olivier");
        charlotte.estAmoureux();

    }
}