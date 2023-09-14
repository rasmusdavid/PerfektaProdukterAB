package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Intern extends Staff{

    private LocalDate endDate;
    private String evaluation;

    public Intern(int id, String name, String gender, LocalDate endDate, String evaluation) {
        super(id, name, gender);
        this.endDate = endDate;
        this.evaluation = evaluation;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", endDate=" + endDate.format(DateTimeFormatter.ISO_LOCAL_DATE) +
                ", evaluation='" + evaluation;
    }
}
