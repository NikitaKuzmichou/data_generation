package com.vsu.by.service.files;

import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@Service
public class Serializer {
    private Gson gson;

    public Serializer() {
        this.gson = new Gson();
    }

    public boolean serialize(String path, Object obj) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(this.gson.toJson(obj));
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return false;
        }
        return true;
    }

}
