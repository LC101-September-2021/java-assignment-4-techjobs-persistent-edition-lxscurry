package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity{

    @NotEmpty(message = "Location cannot be empty.")
    private String location;

    @OneToMany
    @JoinColumn(name="employer_id")
    private final List<Job> job = new ArrayList<>();

    public Employer(){

    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
