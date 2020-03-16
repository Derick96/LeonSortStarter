package edu.ujcv.progra1;

public class MergeSort  implements SortTester{
    @Override
    public long sort(int[] array) {
        long start = System.nanoTime();
        mergeSort(array);

        long end = System.nanoTime();

        return end - start;
    }

    public static int[] mergeSort(int[] arr){
        if (arr.length <= 1) {
            return arr;
        }
        int medio = arr.length / 2;

        int[] abajo = new int[medio];
        int[] arriba = new int[arr.length - medio];
        for (int a = 0; a < medio; a++) {
            abajo[a] = arr[a];
        }

        for (int a = 0; a < arriba.length; a++) {
            arriba[a] = arr[a + abajo.length];
        }
        return merge(mergeSort(abajo), mergeSort(arriba));
    }

    public static int[] merge(int[] inf, int[] sup ){
        return new int[5];
    }


}
