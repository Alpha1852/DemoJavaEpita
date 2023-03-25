package com.formation.epita.exceptions;

import com.formation.epita.heritage.Train;
import com.formation.epita.heritage.Velo;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        Except fact = new Except();

        try {
            int facto = fact.factorielle(20);
        } catch (FactorielleException e) {
            System.out.println("Exception dans la factorielle");
            e.printStackTrace();
        }
    }


}