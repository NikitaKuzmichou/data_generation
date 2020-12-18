package com.vsu.by.entities.customer;

import com.vsu.by.entities.category.Category;
import com.vsu.by.entities.purchase.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    @Transactional(readOnly = true)
    public Optional<Customer> getCustomer(final Long id) {
        return this.repository.findById(id);
    }

    @Transactional(readOnly = true)
    public Optional<Customer> getCustomer(final Purchase purchase) {
        return this.repository.findByPurchases(purchase);
    }

    @Transactional
    public Customer saveCustomer(final Customer customer) {
        return this.repository.save(customer);
    }

    @Transactional
    public Customer updateCustomer(final Customer customer) {
        return this.repository.save(customer);
    }

    @Transactional
    public void deleteCustomer(final Long id) {
        this.repository.deleteById(id);
    }

    @Transactional
    public void deleteCustomer(final Customer customer) {
        this.repository.delete(customer);
    }

    @Transactional(readOnly = true)
    public List<Customer> findAll() {
        return this.repository.findAll();
    }

    @Transactional(readOnly = true)
    public List<Customer> findAll(final String surname) {
        return this.repository.findAllBySurname(surname);
    }

    @Transactional(readOnly = true)
    public List<Customer> findAll(final Category category) {
        return this.repository.findAllByPreferences(category);
    }
}
