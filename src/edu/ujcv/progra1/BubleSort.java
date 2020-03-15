package edu.ujcv.progra1;

public class BubleSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        bubbleSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public static int[] bubbleSort(int[] array) {
        for (int k = 0; k < array.length; k++) {
            for (int j = 0; j < array.length; j++) {
                if (array[k] < array[j]) {
                    int temp = array[k];
                    array[k] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}
