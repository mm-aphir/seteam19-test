package com.se.team19.server.Entity;

import lombok.Data;
import lombok.NonNull;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "DateTime")
public class DateTime {
    @Id
    @SequenceGenerator(name="datetime_seq",sequenceName="datetime_seq")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="datetime_seq")
    @Column(name="DateTime_id",unique = true, nullable = false)

    private @NonNull Long id;
    private @NonNull Date date;

}
