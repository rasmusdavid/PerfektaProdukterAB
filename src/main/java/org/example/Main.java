package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static final List<Staff> staff = new ArrayList<>();
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        System.out.println("Välkommen till Perfekta produkter AB\n");

        int menuChoice = -1;

        while (menuChoice != 0){

            System.out.println("1. Lägg till personal");
            System.out.println("2. Antal personal i systemet");
            System.out.println("3. Kolla snittlön");
            System.out.println("4. Rangordna personal efter anställning");
            System.out.println("0. Avsluta programmet");

            menuChoice = scanner.nextInt();

            switch (menuChoice) {
                case 1 -> addStaffToArray();
                case 2 -> GetNumberOfStaff.numberOfStaff(staff);
                case 3 -> CalculateAverageSalary.averageSalary(staff);
                case 4 -> SortEmployeeAfterHiring.SortEmployees(staff);
                case 0 -> System.out.println("Programmet avslutas");
                default -> {
                    System.out.println(ANSI_RED + "Felaktigt val" + ANSI_RESET);
                    System.out.println();
                }
            }
        }
    }

    private static void addStaffToArray() {
        System.out.println("Vill du lägga till en:");
        System.out.println("1. Anställd");
        System.out.println("2. Praktikant");
        int menuChoice = scanner.nextInt();
        scanner.nextLine();

        if(menuChoice == 1){
            System.out.println("Vad heter personen?");
            String name = scanner.nextLine();
            System.out.println("Ge " + name + " ett unikt id (Endast siffror)");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Vilket kön har " + name + "? (Anges i male eller female)");
            String gender = scanner.nextLine().toLowerCase();
            System.out.println("Ange lön för " + name);
            int salary = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ange anställningsdatum för " + name + " (YYYY-MM-DD)");
            LocalDate startDate = LocalDate.parse(scanner.nextLine(), ISO_LOCAL_DATE);
            staff.add(new Employee(id, name, gender, salary, startDate));
        }
        if(menuChoice == 2){

            System.out.println("Vad heter personen?");
            String name = scanner.nextLine();
            System.out.println("Ge " + name + " ett unikt id");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Vilket kön har " + name + "? (Anges i male eller female)");
            String gender = scanner.nextLine().toLowerCase();
            System.out.println("Ange slutdatum för " + name + " (YYYY-MM-DD)");
            LocalDate endDate = LocalDate.parse(scanner.nextLine(), ISO_LOCAL_DATE);
            System.out.println("Ange vitsord för " + name);
            String evaluation = scanner.nextLine();
            staff.add(new Intern(id, name, gender, endDate, evaluation));
        }
    }
}