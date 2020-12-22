package com.vsu.by.service.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Files {

    public static void writeFile(String filePath, byte[] bytes)
                                                           throws IOException {
        java.nio.file.Files.write(Paths.get(filePath), bytes);
    }

    public static void writeFile(String filePath, String content)
                                                           throws IOException {
        writeFile(filePath, content.getBytes(Charset.forName("UTF-8")));
    }

    public static String readFile(String fileName) throws IOException {
        try (BufferedReader br = new BufferedReader(
                                     new InputStreamReader(
                                         new FileInputStream(fileName),
                                                  Charset.forName("UTF-8")))) {

            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
            }

            return sb.toString();
        }
    }

    public static byte[] readRawFile(String fileName) throws IOException {
        return java.nio.file.Files.readAllBytes(getPath(fileName));
    }

    private static Path getPath(String path) throws IOException {
        try {
            return Paths.get(path);
        } catch (InvalidPathException e) {
            throw new IOException(e);
        }
    }
}
