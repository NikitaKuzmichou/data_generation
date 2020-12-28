package com.vsu.by.entities.seller;

import com.vsu.by.entities.product.Product;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
@Entity
@Table(name = "seller")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String patronymic;
    private String organization;
    @OneToMany(mappedBy = "seller")
    private List<Product> product;

    public void addProduct(final Product product) {
        if (Objects.isNull(this.product)) {
            this.product = new ArrayList<>();
        }
        this.product.add(product);
    }
}
