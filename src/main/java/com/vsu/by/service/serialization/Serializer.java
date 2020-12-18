package com.vsu.by.service.serialization;

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
        try {
            BufferedWriter writer = this.getWriter(path);
            writer.write(this.gson.toJson(obj));
            writer.close();
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    private BufferedWriter getWriter(String path) throws IOException {
        return new BufferedWriter(new FileWriter(path));
    }
}
