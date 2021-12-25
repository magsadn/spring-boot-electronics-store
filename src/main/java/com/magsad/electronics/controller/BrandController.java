package com.magsad.electronics.controller;

import com.magsad.electronics.entity.Brand;
import com.magsad.electronics.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brands")
@RequiredArgsConstructor
public class BrandController {
    private final BrandService brandService;

    @GetMapping
    public ResponseEntity<List<Brand>> findAll(){
        return ResponseEntity.ok(brandService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Brand> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(brandService.findById(id));
    }

    @PostMapping
    public Brand save(@RequestBody Brand brand){
        return brandService.save(brand);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        brandService.delete(id);
    }

    @PutMapping
    public ResponseEntity<Brand> update(@RequestBody Brand brand){
        return ResponseEntity.ok(brandService.update(brand));
    }
}
