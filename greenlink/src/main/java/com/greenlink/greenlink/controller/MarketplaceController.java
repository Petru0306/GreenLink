package com.greenlink.greenlink.controller;

import com.greenlink.greenlink.dto.ProductDto;
import com.greenlink.greenlink.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/marketplace")
public class MarketplaceController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public String getAllProducts(Model model) {
        List<ProductDto> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "marketplace"; // Returnează fișierul marketplace.html
    }

    @GetMapping("/{productId}")
    public String getProductDetails(@PathVariable Long productId, Model model) {
        ProductDto product = productService.getProductById(productId);
        model.addAttribute("product", product);
        return "product-details"; // Returnează fișierul product-details.html
    }
}
