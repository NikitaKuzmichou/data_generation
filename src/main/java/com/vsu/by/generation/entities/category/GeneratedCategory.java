package com.vsu.by.generation.entities.category;

import com.vsu.by.entities.category.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeneratedCategory {
    private String name;

    public Category toCategory() {
        final Category category = new Category();
        category.setName(name);
        return category;
    }
}
