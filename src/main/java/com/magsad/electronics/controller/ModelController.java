package com.magsad.electronics.controller;

import com.magsad.electronics.entity.Model;
import com.magsad.electronics.service.ModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/models")
@RequiredArgsConstructor
public class ModelController {
    private final ModelService modelService;

    @GetMapping
    public ResponseEntity<List<Model>> findAll(){
        return ResponseEntity.ok(modelService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Model> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(modelService.findById(id));
    }

    @PostMapping
    public Model save(@RequestBody Model model){
        return modelService.save(model);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        modelService.delete(id);
    }

    @PutMapping
    public ResponseEntity<Model> update(@RequestBody Model model){
        return ResponseEntity.ok(modelService.update(model));
    }
}
