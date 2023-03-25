package com.formation.epita.abstractclass;

public class Centaure {
    final static int bras = 2;
    final static int patess = 4;

    private static int population = 0;

    public Centaure() {
        population++;
    }

    public static int getPopulation() {
        return population;
    }

    public static void setPopulation(int population) {
        Centaure.population = population;
    }
}
