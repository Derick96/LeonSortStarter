package edu.ujcv.progra1;

import static edu.ujcv.progra1.HeapSort.heap;
import static edu.ujcv.progra1.QuickSort.qSort;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int array[] = {3,6,7,12,1,9};



        HeapSort ob = new HeapSort();
        ob.heap(array);



        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        System.out.println("\n\n algortimo tarda "+ ob.sort(array)+ " nanosegundos");

    }
}
