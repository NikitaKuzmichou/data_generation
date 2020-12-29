package com.vsu.by.service.util;

public class PathsStorage {
    public static String absPath() {
        return "E:\\my_programms\\java\\learning\\big_data\\data_generation\\";
    }

    public static String categoryPath() {
        return absPath() + "src\\main\\resources\\" +
                           "generation\\category\\";
    }

    public static String humanPath() {
        return absPath() + "src\\main\\resources\\" +
                           "generation\\human\\";
    }
}
