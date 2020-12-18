package com.vsu.by.entities.customer;

import com.vsu.by.entities.category.Category;
import com.vsu.by.entities.purchase.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findAllBySurname(final String surname);
    Optional<Customer> findByPurchases(final Purchase purchase);
    List<Customer> findAllByPreferences(final Category category);
}
