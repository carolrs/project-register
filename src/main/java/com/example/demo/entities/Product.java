package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_product")
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String igmUrl;

    @Transient
    private Set<Category> categories = new HashSet<>();

    public Product(Long id, String name, String description, Double price, String igmUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.igmUrl = igmUrl;
    }
}
