package com.magsad.electronics.repository;

import com.magsad.electronics.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BrandRepository extends JpaRepository<Brand, Long> {

}