package com.ingressou.Ingressou.repositories;

import com.ingressou.Ingressou.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Integer> {
    Optional<ProductModel> findById(int id);

    Optional<ProductModel> findAllById(int id);
}
