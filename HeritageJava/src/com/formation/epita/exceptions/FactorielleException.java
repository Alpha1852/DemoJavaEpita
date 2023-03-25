package com.formation.epita.exceptions;

public class FactorielleException extends Exception {
    public FactorielleException() {
        super("Exception par Defaut");
    }
    public FactorielleException(String message){
        super(message);
    }
    public FactorielleException(int nombre){
        super("Exception pour" +nombre);
    }
}
