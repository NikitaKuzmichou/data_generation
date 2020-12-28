package com.vsu.by.generation.entities.seller;

import com.vsu.by.entities.product.Product;
import com.vsu.by.entities.seller.Seller;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public final class SellerBuilder {
    private Seller seller;

    public SellerBuilder setId(final Long id) {
        if (Objects.isNull(this.seller)) {
            this.seller = new Seller();
        }
        this.seller.setId(id);
        return this;
    }

    public SellerBuilder setName(final String name) {
        if (Objects.isNull(this.seller)) {
            this.seller = new Seller();
        }
        this.seller.setName(name);
        return this;
    }

    public SellerBuilder setSurname(final String surname) {
        if (Objects.isNull(this.seller)) {
            this.seller = new Seller();
        }
        this.seller.setSurname(surname);
        return this;
    }

    public SellerBuilder setPatronymic(final String patronymic) {
        if (Objects.isNull(this.seller)) {
            this.seller = new Seller();
        }
        this.seller.setPatronymic(patronymic);
        return this;
    }

    public SellerBuilder setOrganization(final String organization) {
        if (Objects.isNull(this.seller)) {
            this.seller = new Seller();
        }
        this.seller.setOrganization(organization);
        return this;
    }

    public SellerBuilder addProduct(final Product product) {
        if (Objects.isNull(this.seller)) {
            this.seller = new Seller();
        }
        this.seller.addProduct(product);
        return this;
    }

    public Seller build() {
        final Seller seller = this.seller;
        this.seller = null;
        return seller;
    }
}
