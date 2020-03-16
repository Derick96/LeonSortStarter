package edu.ujcv.progra1;

import static edu.ujcv.progra1.QuickSort.qSort;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int array[] = {7,4,9,23,66,1,10};
        int n = array.length;


        QuickSort ob = new QuickSort();
        ob.qSort(array,0,n-1);



        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        System.out.println("\n\ntarda "+ ob.sort(array)+ " nanosegundos");

    }
}
