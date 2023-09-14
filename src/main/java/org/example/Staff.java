package org.example;

public class Staff {

    private int id;
    private String name;
    private String gender;

    public Staff(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", id=" + id +
                ", gender='" + gender + '\'';
    }
}
