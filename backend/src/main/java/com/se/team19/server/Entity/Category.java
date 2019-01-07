package com.se.team19.server.Entity;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Category")
public class Category {
    @Id
    @SequenceGenerator(name="category_seq",sequenceName="category_seq")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="category_seq")
    @Column(name="Category_id",unique = true, nullable = false)

    private @NonNull Long category_id;
    private @NonNull String namecategory;

    public Category() {}

    public Category(Long category_id, String namecategory) {
        this.category_id = category_id;
        this.namecategory = namecategory;
    }
}
