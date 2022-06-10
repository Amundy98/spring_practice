package com.esh22new.elitee11gotjokesnew.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Joke {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //primary key

    private String value;




    public Joke(Long id, String value) {
        this.id = id;
        this.value = value;
    }

    public Joke(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }




    @Override
    public String toString() {
        return "Joke{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }
}
