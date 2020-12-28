package com.vsu.by.generation.kernel.settings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GenerationSettings {
    private boolean useDbStatistic;
    private long entitiesToGenerate;
    private Map<String, Double> genChance;

    public Double entityGenChance(final String name) {
        Double probability = this.genChance.get(name);
        if (Objects.isNull(probability)) {
            return 0.0;
        }
        return probability;
    }

    public void putEntityGenChance(final String name, Double probability) {
        this.genChance.put(name, probability);
    }
}
