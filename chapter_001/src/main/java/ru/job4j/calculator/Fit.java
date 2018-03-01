package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 */
public class Fit {

    public static final double CONSTANTA100 = 100;
    public static final double CONSTANTA110 = 110;
    public static final double CONSTANTA115 = 1.15;

    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double manWeight(double height) {
        return (height - CONSTANTA100) * CONSTANTA115;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double womanWeight(double height) {
        return (height - CONSTANTA110) * CONSTANTA115;
    }
}