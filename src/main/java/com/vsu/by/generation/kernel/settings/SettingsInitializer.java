package com.vsu.by.generation.kernel.settings;

import com.vsu.by.generation.kernel.settings.chances.DbChanceCalculator;
import com.vsu.by.generation.kernel.settings.chances.JsonChanceReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.util.Properties;

@Service
public class SettingsInitializer {
    private final String PROPS_PATH =
                              "./src/resources/generation_settings.properties";
    private final String PROPS_CHANCES_PATH =
                    "./src/resources/generation/generation_chances.properties";
    @Autowired
    private DbChanceCalculator dbChances;
    @Autowired
    private JsonChanceReader jsonChances;

    public GenerationSettings initSettings() {
        try (FileInputStream fis = new FileInputStream(this.PROPS_PATH)) {
            final Properties props = new Properties();
            props.load(fis);
            final GenerationSettings settings = new GenerationSettings();
            settings.setUseDbStatistic(
                    Boolean.getBoolean(props.getProperty("use_db_statistic")));
            settings.setEntitiesToGenerate(
                      Long.getLong(props.getProperty("entities_to_generate")));
            if (settings.isUseDbStatistic()) {
                settings.setGenChance(this.dbChances.getGenerationChances());
            } else {
                settings.setGenChance(
                        this.jsonChances.getGenerationChances(
                                                     this.PROPS_CHANCES_PATH));
            }
            return settings;
        } catch (final Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
