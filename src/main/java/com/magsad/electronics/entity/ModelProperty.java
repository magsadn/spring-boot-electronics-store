package com.magsad.electronics.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "model_properties")
@Data
public class ModelProperty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /*    @ManyToOne
        @ToString.Exclude
        private Model model;*/
    private Double price;
    private String cpu;
    private String ram;
    private String screen;
    private String camera;
    private String battery;
    private Integer stockCount;
    private String storage;
    private Boolean nfc;
    private String bluetooth;
    private String wifi;
    private String connection;
    private String chargeType;
    private String extraProperty;
}
