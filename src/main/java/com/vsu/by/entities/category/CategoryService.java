package com.vsu.by.entities.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public Optional<Category> getCategory(final Long id) {
        return this.repository.findById(id);
    }

    @Transactional(readOnly = true)
    public Optional<Category> getCategory(final String name) {
        return this.repository.findByName(name);
    }

    @Transactional
    public Category saveCategory(final Category category) {
        return this.repository.save(category);
    }

    @Transactional
    public Category updateCategory(final Category category) {
        return this.repository.save(category);
    }

    @Transactional
    public void deleteCategory(final Long id) {
        this.repository.deleteById(id);
    }

    @Transactional
    public void deleteCategory(final Category category) {
        this.repository.delete(category);
    }

    @Transactional(readOnly = true)
    public List<Category> findAll() {
        return this.repository.findAll();
    }
}
