package edu.ujcv.progra1;

import static edu.ujcv.progra1.QuickSort.qSort;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int arr[] = {3,2,7,5,4,1,6};


        HeapSort ob = new HeapSort();
        ob.heap(arr);



        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        System.out.println("\n\ntarda "+ ob.sort(arr)+ " milisegundos");

    }
}
