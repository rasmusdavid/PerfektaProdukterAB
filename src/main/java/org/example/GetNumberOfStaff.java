package org.example;

import java.util.List;

public class GetNumberOfStaff {

    public static void numberOfStaff(List<Staff> staff) {
        System.out.println("Där är " + staff.size() + " personer i systemet");

        int numberOfEmployees = 0;
        int numberOfInterns = 0;

        for (Object person : staff){
            if(person instanceof Employee){
                numberOfEmployees++;
            }else{
                numberOfInterns++;
            }
        }

        System.out.println("Varav " + numberOfEmployees + " är anställda");
        System.out.println("och " + numberOfInterns + " är praktikanter\n");
    }

}
