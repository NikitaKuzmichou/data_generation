package com.vsu.by.service.util;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Paths;

import static java.nio.file.Files.newBufferedReader;

public class GsonFiles {

    public static Object read(final String path, Class<?> clazz) throws IOException {
        final Reader reader = newBufferedReader(Paths.get(path));
        final Gson gson = new Gson();
        return gson.fromJson(reader, clazz);
    }

    public static void write(final String path, Object obj) throws IOException {
        final Gson gson = new Gson();
        Files.writeFile(path, gson.toJson(obj));
    }
}
