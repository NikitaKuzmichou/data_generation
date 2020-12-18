package com.vsu.by.entities.product;

import com.vsu.by.entities.category.Category;
import com.vsu.by.entities.seller.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByCategory(final Category category);
    List<Product> findAllBySeller(final Seller seller);
}
