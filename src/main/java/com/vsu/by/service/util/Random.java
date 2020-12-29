package com.vsu.by.service.util;

public class Random {
    public static double roll(double min, double max) {
        return Math.random() * (max - min + 1) + min;
    }

    public static int intRoll(double min, double max) {
        return (int) roll(min, max);
    }
}
