package com.corso.java.hibernate.studente;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Department {
    private int id;
    private String name;
    private Set<Student> studenti = new HashSet<Student>();

    public Set<Student> getStudenti() {
        return studenti;
    }

    public void setId_Department(Set<Student> studenti) {
        this.studenti = studenti;
    }

    public Department() {
    }

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
