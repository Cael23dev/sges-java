package br.com.sges.exceptions;

public class InvalidPersonData extends RuntimeException {

    public InvalidPersonData(String message) {
        super(message);
    }

    public String getMesege() {
        return this.getMessage();
    }
}