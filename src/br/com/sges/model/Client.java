package br.com.sges.model;

import java.time.LocalDate;

public class Client extends Person {

    public Client(String name, String phone, LocalDate dateBirthday) {
        super(name, phone, dateBirthday);
    }

    @Override
    public  void displayData() {

        System.out.println("**********Cadastro de cliente*********");
        System.out.println("Cliente: " + getName());
        System.out.println("Numero de contato " + getPhone());
        System.out.println("Data de nascimento" + getDateBirthday());
        System.out.println("**************************************");

    }
}
