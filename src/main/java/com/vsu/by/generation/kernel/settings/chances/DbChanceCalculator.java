package com.vsu.by.generation.kernel.settings.chances;

import com.vsu.by.entities.category.CategoryService;
import com.vsu.by.entities.customer.CustomerService;
import com.vsu.by.entities.product.ProductService;
import com.vsu.by.entities.purchase.PurchaseService;
import com.vsu.by.entities.seller.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DbChanceCalculator {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ProductService productService;
    @Autowired
    private PurchaseService purchaseService;
    @Autowired
    private SellerService sellerService;
    private long totalEntities;

    public Map<String, Double> getGenerationChances() {
        this.setTotalEntities();
        Map<String, Double> genChances = new HashMap<>();
        genChances.put("category",
                       this.getCategoryGenerationChance());
        genChances.put("customer",
                       this.getCustomerGenerationChance());
        genChances.put("product",
                       this.getProductGenerationChance());
        genChances.put("purchase",
                       this.getPurchaseGenerationChance());
        genChances.put("seller",
                       this.getSellerGenerationChance());
        return genChances;
    }

    private void setTotalEntities() {
        this.totalEntities = 0L;
        this.totalEntities += this.categoryService.findAll().size();
        this.totalEntities += this.customerService.findAll().size();
        this.totalEntities += this.productService.findAll().size();
        this.totalEntities += this.purchaseService.findAll().size();
        this.totalEntities += this.sellerService.findAll().size();
    }

    private Double getCategoryGenerationChance() {
        return 1.0 * this.categoryService.findAll().size() / this.totalEntities;
    }

    private Double getCustomerGenerationChance() {
        return 1.0 * this.customerService.findAll().size() / this.totalEntities;
    }

    private Double getProductGenerationChance() {
        return 1.0 * this.productService.findAll().size() / this.totalEntities;
    }

    private Double getPurchaseGenerationChance() {
        return 1.0 * this.purchaseService.findAll().size() / this.totalEntities;
    }

    private Double getSellerGenerationChance() {
        return 1.0 * this.sellerService.findAll().size() / this.totalEntities;
    }
}
