package com.magsad.electronics;

import com.magsad.electronics.repository.BrandRepository;
import com.magsad.electronics.repository.ModelRepository;
import com.magsad.electronics.service.BrandService;
import com.magsad.electronics.service.ModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@RequiredArgsConstructor
public class ElectronicStoreApplication implements CommandLineRunner {
    private final BrandRepository brandRepository;
    private final ModelRepository modelRepository;

    private final BrandService brandService;
    private final ModelService modelService;

    public static void main(String[] args) {
        SpringApplication.run(ElectronicStoreApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(brandService.findAll());
//        System.out.println(modelService.findAll());
    }
}
