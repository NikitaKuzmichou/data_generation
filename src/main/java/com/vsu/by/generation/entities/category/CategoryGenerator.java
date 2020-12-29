package com.vsu.by.generation.entities.category;

import com.vsu.by.service.util.GsonFiles;
import com.vsu.by.service.util.PathsStorage;
import com.vsu.by.service.util.Random;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CategoryGenerator {
    private List<GeneratedCategory> available;
    private List<GeneratedCategory> used;

    public CategoryGenerator() {
        this.available = new ArrayList<>();
        this.used = new ArrayList<>();
        this.initUsedItems();
        this.initAvailableItems();
    }

    public GeneratedCategory generate() {
        final GeneratedCategory category =
                this.available.remove(Random.intRoll(0, this.available.size() - 1));
        this.used.add(category);
        this.updateJsons();
        return category;
    }

    public List<GeneratedCategory> getGeneratedCategories() {
        return this.used;
    }

    private void updateJsons(){
        try {
            GsonFiles.write(PathsStorage.categoryPath() + "categories.json", available.toArray());
            GsonFiles.write(PathsStorage.categoryPath() + "used.json", used.toArray());
        } catch (final Exception e) {
            System.err.println("Unable to update category generation files");
            System.err.println(e);
        }
    }

    private void initAvailableItems() {
        try {
            GeneratedCategory[] categories = (GeneratedCategory[]) GsonFiles.read(
                    PathsStorage.categoryPath() + "categories.json",
                    GeneratedCategory[].class);
            for (GeneratedCategory category : categories) {
                if (!this.used.contains(category)) {
                    this.available.add(category);
                }
            }
        } catch (final Exception e) {
            System.err.println(e);
        }
    }

    private void initUsedItems() {
        try {
            GeneratedCategory[] categories = (GeneratedCategory[]) GsonFiles.read(
                    PathsStorage.categoryPath() + "used.json",
                    GeneratedCategory[].class);
            this.used = Arrays.asList(categories);
        } catch (final Exception e) {
            System.err.println(e);
        }
    }
}
