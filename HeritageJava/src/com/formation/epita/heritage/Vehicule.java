package com.formation.epita.heritage;

public class Vehicule {
    private int nbRoues;

    public Vehicule(int nbRoues) {
        this.nbRoues = nbRoues;
    }
    public String direBonjour(){
        return "bonjour j ai "+this.nbRoues+" roues";
    }
    @Override
    public String toString(){
        return direBonjour();
    }
  /*  public void direBonjour(){
        System.out.println("bonjour j ai "+this.nbRoues+" roues");
    }  */
    public int getNbRoues() {
        return nbRoues;
    }

    public void setNbRoues(int nbRoues) {
        this.nbRoues = nbRoues;
    }
}
