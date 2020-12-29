package com.vsu.by.generation.entities.human;

import com.vsu.by.service.util.Files;
import com.vsu.by.service.util.PathsStorage;
import com.vsu.by.service.util.Random;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class NameGenerator {
    private List<String> names;
    private List<String> surnames;
    private List<String> patronymics;

    public NameGenerator() {
        this.initNames();
        this.initSurnames();
        this.initPatronymics();
    }

    public String generate() {
        return this.generateSurname() + " "
                + this.generateName() + " "
                + this.generatePatronymic();
    }

    private void initNames() {
        try {
            this.names = Arrays.asList(Files
                    .readFile(PathsStorage.humanPath() + "names.txt")
                                                                 .split("\r\n"));
        } catch (final Exception e) {
            System.err.println("Unable to load names from file");
        }
    }

    private void initSurnames() {
        try {
            this.surnames = Arrays.asList(Files
                    .readFile(PathsStorage.humanPath() + "surnames.txt")
                                                                 .split("\r\n"));
        } catch (final Exception e) {
            System.err.println("Unable to load surnames from file");
        }
    }

    private void initPatronymics() {
        try {
            this.patronymics = Arrays.asList(Files
                    .readFile(PathsStorage.humanPath() + "patronymic.txt")
                                                                 .split("\r\n"));
        } catch (final Exception e) {
            System.err.println("Unable to load patronymics from file");
        }
    }

    private String generateName() {
        if (Objects.nonNull(this.names) && !this.names.isEmpty()) {
            int roll = Random.intRoll(0, this.names.size() - 1);
            return this.names.get(roll);
        }
        return "";
    }

    private String generateSurname() {
        if (Objects.nonNull(this.surnames) && !this.surnames.isEmpty()) {
            int roll = Random.intRoll(0, this.surnames.size() - 1);
            return this.surnames.get(roll);
        }
        return "";
    }

    private String generatePatronymic() {
        if (Objects.nonNull(this.patronymics) && !this.patronymics.isEmpty()) {
            int roll = Random.intRoll(0, this.patronymics.size() - 1);
            return this.patronymics.get(roll);
        }
        return "";
    }
}
