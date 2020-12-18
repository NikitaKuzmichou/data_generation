package com.vsu.by.entities.customer;

import com.vsu.by.entities.category.Category;
import com.vsu.by.entities.purchase.Purchase;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String patronymic;
    @OneToMany(mappedBy = "customer")
    private List<Purchase> purchases;
    @ManyToMany
    @JoinTable(
            name = "prefences",
            joinColumns = {
                    @JoinColumn(name = "id_customer")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "id_category")
            }
    )
    private List<Category> preferences;

    public String getFio() {
        return this.name + " " + this.surname + " " + this.patronymic;
    }
}
