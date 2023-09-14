package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class SortEmployeeAfterHiring {

    public static void SortEmployees(List<Staff> staff) {
        List<Employee> employees = new ArrayList<>();

        for(Object person : staff){
            if(person instanceof Employee){
                Employee employee = (Employee) person;
                employees.add(employee);
            }
        }
        if(employees.size() == 0){
            System.out.println("Där finns ingen personal registrerad");
        }else{
            System.out.println("Här är en lista över de anställda sorterad efter anställningsdatum: ");
        }
        employees.sort((Comparator.comparing(Employee::getStartDate)));
        employees.forEach(System.out::println);
        System.out.println();
    }
}
