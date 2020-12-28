package com.vsu.by.generation.entities.customer;

import com.vsu.by.entities.category.Category;
import com.vsu.by.entities.customer.Customer;
import com.vsu.by.entities.purchase.Purchase;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class GeneratedCustomer {
    private String name;
    private String surname;
    private String patronymic;
    /**TODO GeneratedPurchase && -//- Category mb?*/
    private List<Purchase> purchases;
    private List<Category> preferences;

    public GeneratedCustomer() {
        this.purchases = new ArrayList<>();
        this.preferences = new ArrayList<>();
    }

    public Customer toCustomer() {
        final Customer customer = new Customer();
        customer.setName(this.name);
        customer.setSurname(this.surname);
        customer.setPatronymic(this.patronymic);
        customer.setPurchases(this.purchases);
        customer.setPreferences(this.preferences);
        return customer;
    }
}
