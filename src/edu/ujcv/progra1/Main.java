package edu.ujcv.progra1;

import static edu.ujcv.progra1.HeapSort.heap;
import static edu.ujcv.progra1.QuickSort.qSort;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int array[] = {1,3,6,4,9,10,17,7};



        MergeSort ob = new MergeSort();
        int [] tmp = new int[array.length];
        ob.mergeSort(array, tmp, 0, array.length-1);



        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        System.out.println("\n\n algortimo tarda "+ ob.sort(array)+ " nanosegundos");

    }
}
