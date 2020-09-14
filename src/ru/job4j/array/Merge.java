package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int lInd = 0, rInd = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (lInd < left.length && rInd < right.length) {
                rsl[i] = left[lInd] <= right[rInd] ? left[lInd++] : right[rInd++];
            } else if (rInd >= right.length) {
                rsl[i] = left[lInd++];
            } else if (lInd >= left.length) {
                rsl[i] = right[rInd++];
            }
        }
        return rsl;
    }
}

