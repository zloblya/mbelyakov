package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 */
public class Fit {

    public static final double WEIGHT_MAN = 100, WEIGHT_WOMAN = 110, WEIGHT_COMMON = 1.15;

    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double manWeight(double height) {
        return (height - WEIGHT_MAN) * WEIGHT_COMMON;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double womanWeight(double height) {
        return (height - WEIGHT_WOMAN) * WEIGHT_COMMON;
    }
}