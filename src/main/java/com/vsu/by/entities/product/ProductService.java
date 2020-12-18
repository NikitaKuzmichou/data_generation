package com.vsu.by.entities.product;

import com.vsu.by.entities.category.Category;
import com.vsu.by.entities.seller.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public Optional<Product> getProduct(final Long id) {
        return this.repository.findById(id);
    }

    @Transactional
    public Product saveProduct(final Product product) {
        return this.repository.save(product);
    }

    @Transactional
    public Product updateProduct(final Product product) {
        return this.repository.save(product);
    }

    @Transactional
    public void deleteProduct(final Long id) {
        this.repository.deleteById(id);
    }

    @Transactional
    public void deleteProduct(final Product product) {
        this.repository.delete(product);
    }

    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return this.repository.findAll();
    }

    @Transactional(readOnly = true)
    public List<Product> findAll(final Seller seller) {
        return this.repository.findAllBySeller(seller);
    }

    @Transactional(readOnly = true)
    public List<Product> findAll(final Category category) {
        return this.repository.findAllByCategory(category);
    }
}
