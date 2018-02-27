package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 */
public class Fit {

    private double constanta100 = 100;
    private double constanta110 = 110;
    private double constanta115 = 1.15;

    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double manWeight(double height) {
        double weightMan;
        return weightMan = (height - constanta100) * constanta115;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double womanWeight(double height) {
        double weightWoman;
        return weightWoman = (height - constanta110) * constanta115;
    }
}