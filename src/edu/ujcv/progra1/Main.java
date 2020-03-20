package edu.ujcv.progra1;

import static edu.ujcv.progra1.HeapSort.heap;
import static edu.ujcv.progra1.QuickSort.qSort;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	// write your code here

        int array[] = new int [100000];
        Random R = new Random();
        for (int i= 0; i < array.length; i++) {
            array[i] = Math.abs(R.nextInt(100000));
        }



        QuickSort ob = new QuickSort();
        int n = array.length;
        qSort(array,0,n-1);




        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        System.out.println("\n\n algortimo tarda "+ ob.sort(array)+ " milisegundos");

    }
}
