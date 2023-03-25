package com.formation.epita.heritage;

public class Train extends Vehicule{
    public Train(int nbRoues) {
        super(nbRoues);
    }
    public String direBonjour(){
        String bonjour = super.direBonjour();
       // System.out.println("TchooTchoo !");
        bonjour = bonjour+"TchooTchoo";
        return bonjour;
    }
}
