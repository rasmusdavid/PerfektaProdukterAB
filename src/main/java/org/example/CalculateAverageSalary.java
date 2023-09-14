package org.example;

import java.util.ArrayList;
import java.util.List;


public class CalculateAverageSalary {

    public static void averageSalary(List<Staff> staff) {

        List<Staff> males = new ArrayList<>();
        List<Staff> females = new ArrayList<>();

        int femaleSalarySum = 0;
        int maleSalarySum = 0;

        for(Object person : staff){
            if(person instanceof Employee){
                Employee employee = (Employee) person;
                if (employee.getGender().equals("male")) {
                    males.add(employee);
                    maleSalarySum = maleSalarySum + employee.getSalary();
                } else {
                    females.add(employee);
                    femaleSalarySum = femaleSalarySum + employee.getSalary();
                }
            }
        }
        if(males.size() == 0){
            System.out.println("Ingen data för snittlön för män");
        }else{
            System.out.println("Snittlönen för män är: " + maleSalarySum / males.size() + " kr");
        }
        if(females.size() == 0){
            System.out.println("Ingen data för snittlön för kvinnor");
        }else{
            System.out.println("Snittlönen för kvinnor är: " + femaleSalarySum / females.size() + " kr");
        }
        System.out.println();
    }

}
