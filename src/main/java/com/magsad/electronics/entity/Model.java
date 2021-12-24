package com.magsad.electronics.entity;

import com.magsad.electronics.enums.ModelType;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "models")
@Data
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Enumerated(value = EnumType.STRING)
    private ModelType modelType;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "model_id")
    @ToString.Exclude
    private List<ModelProperty> modelPropertyList = new ArrayList<>();
}
