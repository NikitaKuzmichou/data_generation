package com.vsu.by.generation.entities.purchase;

import com.vsu.by.entities.customer.Customer;
import com.vsu.by.entities.product.Product;
import com.vsu.by.entities.purchase.Purchase;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeneratedPurchase {
    private Product product;
    private Customer customer;
    private Date purchaseDate;

    public Purchase toPurchase() {
        final Purchase purchase = new Purchase();
        purchase.setProduct(this.product);
        purchase.setCustomer(this.customer);
        purchase.setPurchaseDate(this.purchaseDate);
        return purchase;
    }
}
