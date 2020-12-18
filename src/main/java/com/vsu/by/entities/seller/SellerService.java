package com.vsu.by.entities.seller;

import com.vsu.by.entities.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class SellerService {
    @Autowired
    private SellerRepository repository;

    @Transactional(readOnly = true)
    public Optional<Seller> getSeller(final Long id) {
        return this.repository.findById(id);
    }

    @Transactional(readOnly = true)
    public Optional<Seller> getSeller(final String organization) {
        return this.repository.findByOrganization(organization);
    }

    @Transactional(readOnly = true)
    public Optional<Seller> getSeller(final Product product) {
        return this.repository.findByProduct(product);
    }

    @Transactional
    public Seller saveSeller(final Seller seller) {
        return this.repository.save(seller);
    }

    @Transactional
    public Seller updateSeller(final Seller seller) {
        return this.repository.save(seller);
    }

    @Transactional
    public void deleteSeller(final Long id) {
        this.repository.deleteById(id);
    }

    @Transactional
    public void deleteSeller(final Seller seller) {
        this.repository.delete(seller);
    }

    @Transactional(readOnly = true)
    public List<Seller> findAll() {
        return this.repository.findAll();
    }
}
