package com.vsu.by.generation.entities.product;

import com.vsu.by.entities.category.Category;
import com.vsu.by.entities.product.Product;
import com.vsu.by.entities.seller.Seller;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public final class ProductBuilder {
    private Product product;

    public ProductBuilder setId(Long id) {
        if (Objects.isNull(this.product)) {
            this.product = new Product();
        }
        this.product.setId(id);
        return this;
    }

    public ProductBuilder setName(String name) {
        if (Objects.isNull(this.product)) {
            this.product = new Product();
        }
        this.product.setName(name);
        return this;
    }

    public ProductBuilder setCategory(Category category) {
        if (Objects.isNull(this.product)) {
            this.product = new Product();
        }
        this.product.setCategory(category);
        return this;
    }

    public ProductBuilder setSeller(Seller seller) {
        if (Objects.isNull(this.product)) {
            this.product = new Product();
        }
        this.product.setSeller(seller);
        return this;
    }

    public ProductBuilder setPrice(Double price) {
        if (Objects.isNull(this.product)) {
            this.product = new Product();
        }
        this.product.setPrice(price);
        return this;
    }

    public Product build() {
        final Product product = this.product;
        this.product = null;
        return product;
    }
}
