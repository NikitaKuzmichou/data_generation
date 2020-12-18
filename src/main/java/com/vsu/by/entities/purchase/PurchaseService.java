package com.vsu.by.entities.purchase;


import com.vsu.by.entities.customer.Customer;
import com.vsu.by.entities.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {
    @Autowired
    private PurchaseRepository repository;

    @Transactional(readOnly = true)
    public Optional<Purchase> getPurchase(final Long id) {
        return this.repository.findById(id);
    }

    @Transactional
    public Purchase savePurchase(final Purchase purchase) {
        return this.repository.save(purchase);
    }

    @Transactional
    public Purchase updatePurchase(final Purchase purchase) {
        return this.repository.save(purchase);
    }

    @Transactional
    public void deletePurchase(final Long id) {
        this.repository.deleteById(id);
    }

    @Transactional
    public void deletePurchase(final Purchase purchase) {
        this.repository.delete(purchase);
    }

    @Transactional(readOnly = true)
    public List<Purchase> findAll() {
        return this.repository.findAll();
    }

    @Transactional(readOnly = true)
    public List<Purchase> findAll(final Product product) {
        return this.repository.findAllByProduct(product);
    }

    @Transactional(readOnly = true)
    public List<Purchase> findAll(final Customer customer) {
        return this.repository.findAllByCustomer(customer);
    }

    @Transactional(readOnly = true)
    public List<Purchase> findAll(final Date purchaseDate) {
        return this.repository.findAllByPurchaseDate(purchaseDate);
    }
}
