package br.com.sges.model;

import br.com.sges.exceptions.InvalidPersonData;
import java.time.LocalDate;

public abstract class Person {

     private final String name;


     private String phone;
     private final LocalDate dateBirthday;

     public Person(String name, String phone, LocalDate dateBirthday) {

          if (name == null || name.isBlank()) {
               throw new InvalidPersonData("nome obrigatório!");
          }

          if (phone == null || phone.isBlank()) {
               throw new InvalidPersonData("telefone obrigatório!");
               }

               if (dateBirthday == null || dateBirthday.isAfter(LocalDate.now())) {
                    throw new InvalidPersonData("você não pode ser do futuro!");

               }

          this.name = name;
          this.phone = phone;
          this.dateBirthday = dateBirthday;

     }

     public String getName() {

          return name;
     }

     public String getPhone() {

          return phone;
     }

     public LocalDate getDateBirthday() {


               return dateBirthday;
     }

          public abstract void displayData ();

     }
