package com.vsu.by.generation.kernel.settings.chances;

import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Service
public class JsonChanceReader {

    public Map<String, Double> getGenerationChances(String path) {
        try (FileInputStream fis = new FileInputStream(path)) {
            final Properties props = new Properties();
            props.load(fis);
            Map<String, Double> genChances = new HashMap<>();
            genChances.put("category",
                           Double.parseDouble(props.get("category")));
            genChances.put("customer",
                           Double.parseDouble(props.get("customer")));
            genChances.put("product",
                           Double.parseDouble(props.get("product")));
            genChances.put("purchase",
                           Double.parseDouble(props.get("purchase")));
            genChances.put("seller",
                           Double.parseDouble(props.get("seller")));
            return genChances;
        } catch (final Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
