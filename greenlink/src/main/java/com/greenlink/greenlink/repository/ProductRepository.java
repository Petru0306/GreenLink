package com.greenlink.greenlink.repository;

import com.greenlink.greenlink.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Dacă ai nevoie de metode personalizate, le poți defini aici
}
