package br.com.sges.app;


import br.com.sges.exceptions.InvalidPersonData;
import br.com.sges.model.Client;
import br.com.sges.model.Employee;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Client client = new Client(
                "Micael",
                "86981298190",
                LocalDate.of(2002, 8, 5));
        client.displayData();

        Client client1 = new Client(
                "Otavio",
                "86981723435",
                LocalDate.of(2008, 4, 27));
        client1.displayData();


try {

    Employee employee = new Employee(
            "micael",
            "86981459784",
            LocalDate.of(2008, 5, 4),
            "");
    employee.displayData();
}
 catch(InvalidPersonData e){

        System.out.println("Cadastro invalido " + e.getMesege());
    }

    }
}
