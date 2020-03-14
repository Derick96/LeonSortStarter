package edu.ujcv.progra1;

import static edu.ujcv.progra1.QuickSort.qSort;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int arr[] = {10,7,8,9,1,5};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.qSort(arr,0,n-1);



        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        System.out.println("\n\ntarda "+ ob.sort(arr)+ " milisegundos");

    }
}
