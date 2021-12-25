package com.magsad.electronics.controller;


import com.magsad.electronics.entity.ModelProperty;
import com.magsad.electronics.service.ModelPropertyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/modelproperties")
@RequiredArgsConstructor
public class ModelPropertyController {
    private final ModelPropertyService modelPropertyService;

    @GetMapping
    public ResponseEntity<List<ModelProperty>> findAll() {
        return ResponseEntity.ok(modelPropertyService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ModelProperty> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(modelPropertyService.findById(id));
    }

    @PostMapping
    public ModelProperty save(@RequestBody ModelProperty modelProperty) {
        return modelPropertyService.save(modelProperty);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        modelPropertyService.delete(id);
    }

    @PutMapping
    public ResponseEntity<ModelProperty> update(@RequestBody ModelProperty modelProperty) {
        return ResponseEntity.ok(modelPropertyService.update(modelProperty));
    }
}
