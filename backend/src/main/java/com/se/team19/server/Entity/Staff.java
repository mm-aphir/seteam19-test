package com.se.team19.server.Entity;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Data
@Table(name = "staff")
public class Staff {
    @Id
    @SequenceGenerator(name="staff_seq",sequenceName="staff_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="staff_seq")
    @Column(name ="STAFF_ID",unique = true, nullable = false)
    private @NonNull Long StaffId;
    private @NonNull String StaffName;
    private @NonNull int Age;
    private @NonNull String Address;
    private @NonNull String Phone;

    public Staff() {}

    public Staff(String staffName, int age, String address, String phone) {
        StaffName = staffName;
        Age = age;
        Address = address;
        Phone = phone;
    }

    @ManyToOne()
    @JoinColumn(name = "GENDER_ID", insertable = true)
    private Gender StaffGender;

    @ManyToOne()
    @JoinColumn(name = "PROVINCE_ID", insertable = true)
    private Province StaffProvince;

    @ManyToOne()
    @JoinColumn(name = "POSITION_ID", insertable = true)
    private Position StaffPosition;


}
