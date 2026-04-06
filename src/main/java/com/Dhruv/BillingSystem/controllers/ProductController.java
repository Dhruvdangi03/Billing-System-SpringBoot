package com.Dhruv.BillingSystem.controllers;

import com.Dhruv.BillingSystem.DTO.product.ProductDTO;
import com.Dhruv.BillingSystem.entities.Product;
import com.Dhruv.BillingSystem.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<?> createProduct(ProductDTO productDTO){
        return ResponseEntity.ok(productService.createProduct(productDTO));
    }

    @GetMapping
    public ResponseEntity<?> getAllProducts(){
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Long id){
        Product product = productService.getProductById(id);
        if(product == null)
            return ResponseEntity.ok("Product Not found");
        return ResponseEntity.ok(product);
    }

    @PutMapping
    public ResponseEntity<?> updateProduct(Product product){
        return ResponseEntity.ok(productService.updateProduct(product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long id){
        return ResponseEntity.ok(productService.deleteProductById(id));
    }
}
