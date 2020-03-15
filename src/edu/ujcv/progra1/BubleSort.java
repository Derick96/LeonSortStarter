package edu.ujcv.progra1;

public class BubleSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        bubbleSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int c = 0; c < arr.length; c++) {
                if (arr[i] < arr[c]) {
                    int temp = arr[i];
                    arr[i] = arr[c];
                    arr[c] = temp;
                }
            }
        }
        return arr;
    }

}
