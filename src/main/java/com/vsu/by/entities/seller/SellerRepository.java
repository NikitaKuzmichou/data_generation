package com.vsu.by.entities.seller;

import com.vsu.by.entities.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SellerRepository extends JpaRepository<Seller, Long> {
    Optional<Seller> findByOrganization(final String organization);
    Optional<Seller> findByProduct(final Product product);
}
