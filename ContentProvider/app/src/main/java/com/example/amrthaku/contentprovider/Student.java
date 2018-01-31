package com.example.amrthaku.contentprovider;

/**
 * Created by amrthaku on 1/31/2018.
 */

public class Student {

    private String name,roll;

    public Student() {
    }

    public Student(String name, String roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll='" + roll + '\'' +
                '}';
    }
}
