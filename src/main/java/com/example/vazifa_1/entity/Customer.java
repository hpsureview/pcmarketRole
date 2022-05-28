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
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Date date;
    @Column(nullable = false)
    private int wherehouse_id;
    @Column(nullable = false)
    private int supplier_id;
    @Column(nullable = false)
    private int currency_id;
    @Column(nullable = false)
    private int facture_number;
    @Column(nullable = false)
    private int code;
    @OneToOne
    Wherehouse wherehouse;
    @OneToOne
    Supplier supplier;
}
