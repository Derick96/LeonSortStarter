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

    public static int[] merge(int[] a, int[] b ){

        int[] retval = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (j < a.length && k < b.length) {
            if (a[j] < b[k]) {
                retval[i++] = a[j++];
            } else {
                retval[i++] = b[k++];
            }
        }
        while (j < a.length) {
            retval[i++] = a[j++];
        }
        while (k < b.length) {
            retval[i++] = b[k++];
        }
        return retval;
    }


}
