package com.formation.epita.exceptions;

public class Except {

    public int factorielle(int nombre) throws FactorielleException {
        int i, fact = 1;
        if (nombre > 14) {
            System.out.print("Superieur à 14!!!!!");
            throw new FactorielleException(nombre);
        } else {
            for (i = 1; i <= nombre; i++) {
                fact = fact * i;
            }
            System.out.println("La factorielle de " + nombre + " est : " + fact);
            return fact;
        }
    }
}
