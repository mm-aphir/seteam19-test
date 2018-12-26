package com.se.team19.server.entity;

import lombok.*;

import javax.persistence.Id;

import javax.persistence.CascadeType;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Collection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import java.util.Date;
import java.util.Optional;

@Entity
@Data

@Getter @Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Province{
    @Id
    @SequenceGenerator(name="province_seq",sequenceName="province_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="province_seq")
    @Column(name="ProvinceId",unique = true, nullable = false)
    private @NonNull Long id;
    public Province(){
    }



}
