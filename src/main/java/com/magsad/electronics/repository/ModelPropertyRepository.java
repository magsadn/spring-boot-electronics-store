package com.magsad.electronics.repository;

import com.magsad.electronics.entity.ModelProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelPropertyRepository extends JpaRepository<ModelProperty, Long> {
}
