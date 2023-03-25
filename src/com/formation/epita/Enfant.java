package com.formation.epita;

public class Enfant {
    private String nom;
    private String prenom;
    private int age;

    private String amoureux;

    public Enfant(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public Enfant(String noom, String prenom) {
        this.nom = noom;
        this.prenom = prenom;
    }

    public void presentation(){

             System.out.println("Bonjour je m appelle:"+prenom+" "+nom+" "+age);

    }
    public void feterAnniversaire(){
        if (age < 17){
            age++;
        }else{
            System.out.println("trop vieux");
        }
    }

    public void jouerAuballon(Enfant copain){
          System.out.println(this.nom+" Joue au ballon avec "+copain.getNom());

    }

    public void tomberAmoureux(String amoureux){
        this.amoureux = amoureux;

    }


    public boolean estAmoureux() {
        if(this.getAmoureux()!=null){
            System.out.println(this.prenom+"est amoureux de: "+this.getAmoureux());
        return true;
        }
        else {
            return false;
        }
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAmoureux() {
        return amoureux;
    }

    public void setAmoureux(String amoureux) {
        this.amoureux = amoureux;
    }
}
