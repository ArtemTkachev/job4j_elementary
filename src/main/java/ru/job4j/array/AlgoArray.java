package ru.job4j.array;

public class AlgoArray {
    /**
     * Сортировка массива перебором элементов
     * @param args
     */
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int temp1 = array[0];
        array[0] = array[3];
        array[3] = temp1;
        int temp2 = array[1];
        array[1] = array[2];
        array[2] = temp2;
        int temp3 = array[3];
        array[3] = array[4];
        array[4] = temp3;
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}