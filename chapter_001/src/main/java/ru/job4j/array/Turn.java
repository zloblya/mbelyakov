package ru.job4j.array;

public class Turn {

    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) { //допустим массив длиной в 6 элементов
            int temp = array[array.length - i - 1];    //присваиваем temp значение, которое лежит в ячейке с индексом 5
            array[array.length - i - 1] = array[i];   //ячейке с индексом 5 присваиваем элемент ячейки с индексом 0
            array[i] = temp;                          //присваиваем ячейке с индексом 0 элемент ячейки с индексом 5
        }
        return array;
    }
}
