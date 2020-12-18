package com.vsu.by.entities.purchase;

import com.vsu.by.entities.customer.Customer;
import com.vsu.by.entities.product.Product;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "purchase")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "id_customer")
    private Customer customer;
    @Column(name = "purchase_date")
    private Date purchaseDate;
}
