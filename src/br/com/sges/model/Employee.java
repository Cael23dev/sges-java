package br.com.sges.model;

import br.com.sges.exceptions.InvalidPersonData;

import java.security.InvalidParameterException;
import java.time.LocalDate;

public class Employee extends Person{

    private final String jobTitle;

    public Employee(String name, String phone, LocalDate dateBirthday, String jobTitle) {
        super(name, phone, dateBirthday);

        if (jobTitle == null || jobTitle.isEmpty() ) {

            throw new InvalidPersonData("Informe seu cargo!!");

        }

       this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public void displayData() {

        System.out.println("**********Cadastro de Funcionario*********");
        System.out.println("Funionario: " + getName());
        System.out.println("Numero de contato: " + getPhone());
        System.out.println("Data de nascimento: " + getDateBirthday());
        System.out.println("Cargo: " + getJobTitle());
        System.out.println("********************************************");

    }
}
