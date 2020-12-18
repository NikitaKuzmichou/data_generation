package com.vsu.by.entities.category;

import com.vsu.by.entities.customer.Customer;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    /**TODO ОШИБКА: отношение "prefences" не существует*/
    @ManyToMany(mappedBy = "preferences")
    private List<Customer> customers;
}
