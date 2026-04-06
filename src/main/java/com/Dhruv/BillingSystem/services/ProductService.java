package com.Dhruv.BillingSystem.services;

import com.Dhruv.BillingSystem.DTO.product.ProductDTO;
import com.Dhruv.BillingSystem.entities.Product;
import com.Dhruv.BillingSystem.repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setBarcode(productDTO.getBarcode());
        product.setCategory(productDTO.getCategory());
        product.setCostPrice(productDTO.getCostPrice());
        product.setDescription(productDTO.getDescription());
        product.setStockQuantity(productDTO.getStockQuantity());

        productRepository.save(product);
        return product;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        Optional<Product> opt = productRepository.findById(id);
        return opt.orElse(null);
    }

    public Product updateProduct(Long productId, ProductDTO productUp) {
        Product product = getProductById(productId);
        product.setName(productUp.getName());
        product.setPrice(productUp.getPrice());
        product.setBarcode(productUp.getBarcode());
        product.setCategory(productUp.getCategory());
        product.setCostPrice(productUp.getCostPrice());
        product.setDescription(productUp.getDescription());
        product.setStockQuantity(productUp.getStockQuantity());

        productRepository.save(product);
        return product;
    }

    public String deleteProductById(Long id) {
        Product product = getProductById(id);
        product.setActive(false);

        productRepository.save(product);
        return "Deleted Successfully";
    }
}
