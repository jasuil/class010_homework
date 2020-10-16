package net.class101.homework1.data.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Product {

    @Id
    private Integer id;
    private String category;
    private String name;
    private Integer price;
    private Integer stocks;
}
