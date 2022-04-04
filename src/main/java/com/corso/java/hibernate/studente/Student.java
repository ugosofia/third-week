package com.corso.java.hibernate.studente;

public class Student {
    private int id_student;
    private String name;
    private String lastname;
    private int idDepartment;

    public Student() {
    }

    public Student(int id, String name, String lastname, int idDepartment) {
        this.id_student = id;
        this.name = name;
        this.lastname = lastname;
        this.idDepartment = idDepartment;
    }

    public int getId() {
        return id_student;
    }

    public void setId(int id) {
        this.id_student = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(int idDepartment) {
        this.idDepartment = idDepartment;
    }
}


