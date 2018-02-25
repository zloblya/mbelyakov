package ru.job4j.calculator;

/**
 * Корвертор валюты.
 */
public class Converter {

    private int result;

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public double rubleToEuro(int value) {
        return this.result = value / 70;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры
     */
    public double rubleToDollar(int value) {
        return this.result = value / 60;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return Рубли
     */
    public double dollarToRuble(int value) {
        return this.result = value * 60;
    }

    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return Рубли
     */
    public double euroToRuble(int value) {
        return this.result = value * 70;
    }
}