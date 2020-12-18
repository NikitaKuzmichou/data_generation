package com.vsu.by.entities.purchase;

import com.vsu.by.entities.customer.Customer;
import com.vsu.by.entities.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
    List<Purchase> findAllByProduct(final Product product);
    List<Purchase> findAllByCustomer(final Customer customer);
    List<Purchase> findAllByPurchaseDate(final Date purchaseDate);
}
