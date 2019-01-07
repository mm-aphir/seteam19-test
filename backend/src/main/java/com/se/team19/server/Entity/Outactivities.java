package com.se.team19.server.Entity;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Outactivities")
public class Outactivities {
    @Id
    @SequenceGenerator(name="activities_seq",sequenceName="activities_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="activities_seq")
    @Column(name="Outactivities_id",unique = true, nullable = false)

    private @NonNull Long activities_id;
    private @NonNull String nameActivities;
    private @NonNull String nameRequestor;
    private @NonNull String Description;
    private @NonNull String phonenumber;




    public Outactivities() {}

    public Outactivities(Long activities_id, String nameActivities,String nameRequestor,String Description,String phonenumber) {
        this.activities_id = activities_id;
        this.nameActivities = nameActivities;
        this.nameRequestor = nameRequestor;
        this.Description = Description;
        this.phonenumber = phonenumber;
    }

}