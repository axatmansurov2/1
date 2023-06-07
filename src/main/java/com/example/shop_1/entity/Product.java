package com.example.shop_1.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Entity(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product extends BaseEntity {

    private String name;

    private String description;

    private String category;

    private Double price;
}
