package com.vsu.by.service.util;

public class Random {
    public static double roll(double min, double max) {
        return Math.random() * (max - min + 1) + min;
    }
}
