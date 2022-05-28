package com.example.vazifa_1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product_properties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private int product_id;
    @Column(nullable = false)
    private int amount;
    @Column(nullable = false)
    private int price;
    @Column(nullable = false)
    private Date expire_date;
    @Column(nullable = false)
    private int input_id;
    @OneToOne
    Customer input;
}
