package com.magsad.electronics.repository;

import com.magsad.electronics.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Long> {
}
