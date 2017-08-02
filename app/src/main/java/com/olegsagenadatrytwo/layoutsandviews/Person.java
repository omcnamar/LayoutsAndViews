package com.olegsagenadatrytwo.layoutsandviews;

import java.io.Serializable;

/**
 * Created by omcna on 8/2/2017.
 */

public class Person implements Serializable{
    String name;
    String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
