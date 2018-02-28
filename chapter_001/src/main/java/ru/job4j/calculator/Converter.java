package ru.job4j.calculator;

/**
 * Корвертор валюты.
 */
public class Converter {

    public static final int EURO = 70;
    public static final int DOLLAR = 60;
    private int result;

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return this.result = value / EURO;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры
     */
    public int rubleToDollar(int value) {
        return this.result = value / DOLLAR;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return Рубли
     */
    public int dollarToRuble(int value) {
        return this.result = value * DOLLAR;
    }

    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return Рубли
     */
    public int euroToRuble(int value) {
        return this.result = value * EURO;
    }
}