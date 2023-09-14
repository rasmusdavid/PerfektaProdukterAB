package org.example;

import java.time.LocalDate;

public class Employee extends Staff {

    private int salary;
    private final LocalDate startDate;

    public Employee(int id, String name, String gender, int salary, LocalDate startDate) {
        super(id, name, gender);
        this.salary = salary;
        this.startDate = startDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", salary=" + salary +
                ", startDate=" + startDate;
    }
}