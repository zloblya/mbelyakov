package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 */
public class Fit {

    private double weightMan;
    private double weightWoman;

    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double manWeight(double height) {
        return weightMan = (height - 100) * 1.15;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double womanWeight(double height) {
        return weightWoman = (height - 110) * 1.15;
    }
}