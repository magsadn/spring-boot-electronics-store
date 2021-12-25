package com.magsad.electronics.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "model_properties")
@Data
public class ModelProperty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

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


    @ManyToOne
    @ToString.Exclude
    @JsonIgnore
    private Model model;
}
