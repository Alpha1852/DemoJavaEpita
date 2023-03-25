package com.formation.epita.heritage;

public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");
        Velo monVelo = new Velo(2);
        Train monTrain = new Train(100);
        //System.out.println(monVelo.direBonjour());
        //System.out.println(monTrain.direBonjour());
        System.out.println(monVelo);
        System.out.println(monTrain);
    }
}