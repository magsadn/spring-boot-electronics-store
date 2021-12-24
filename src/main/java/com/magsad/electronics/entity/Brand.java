package com.magsad.electronics.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "brands")
@Data
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "brand_id")
    @ToString.Exclude
    private List<Model> modelList = new ArrayList<>();
}
