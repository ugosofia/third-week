package com.corso.java.hibernate;

import java.util.Date;

public class Event {

    private Long id;
    private Date date;
    private String title;
    private String description;

    public Event() {
    }

    public Event(Date date, String title, String description) {
        this.date = date;
        this.title = title;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
