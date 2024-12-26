package com.greenlink.greenlink.service;

import com.greenlink.greenlink.dto.ProductDto;
import com.greenlink.greenlink.model.Product;
import com.greenlink.greenlink.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Preia toate produsele
    public List<ProductDto> getAllProducts() {
        return productRepository.findAll().stream()
                .map(product -> new ProductDto(
                        product.getId(),
                        product.getName(),
                        product.getDescription(),
                        product.getPrice()
                ))
                .collect(Collectors.toList());
    }

    // Preia un produs după ID
    public ProductDto getProductById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produsul nu a fost găsit"));
        return new ProductDto(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice()
        );
    }

    // Adaugă un produs nou
    public ProductDto addProduct(ProductDto productDto) {
        Product product = new Product(
                null,
                productDto.getName(),
                productDto.getDescription(),
                productDto.getPrice()
        );
        Product savedProduct = productRepository.save(product);
        return new ProductDto(
                savedProduct.getId(),
                savedProduct.getName(),
                savedProduct.getDescription(),
                savedProduct.getPrice()
        );
    }
}
