package com.example.client.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "Maindata")
public class Maindata {

    @Id
    @SequenceGenerator(name="maindata_seq",sequenceName="maindata_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="maindata_seq")
    @Column(name="Maindata_Id",unique = true, nullable = false)

    private  @NonNull Long mainDataID;
    private  @NonNull String firstName;
    private  @NonNull String lastName;
    private  @NonNull String phone;
    private  @NonNull String address;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Sex.class)
    @JoinColumn(name = "Sex_Id")
    @JsonIgnore
    private Sex sexType;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = TimeWorking.class)
    @JoinColumn(name = "TimeWorkingType_Id")
    @JsonIgnore
    private TimeWorking timeWorkingType;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = TypeWorking.class)
    @JoinColumn(name = "TypeWorking_Id")
    @JsonIgnore
    private TypeWorking typeWorkingType;


}
