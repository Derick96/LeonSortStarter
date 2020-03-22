package edu.ujcv.progra1;
import java.util.Random;
public class Promedio {
    public static void main(String[] args){
        int [] arr1 = new int[1000];
        int [] arr2 = new int[1000];
        int [] arr3 = new int[1000];
        int [] arr4 = new int[1000];

        Random random = new Random();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Math.abs(random.nextInt(1000));
            arr2[i] = Math.abs(random.nextInt(1000));
            arr3[i] = Math.abs(random.nextInt(1000));
            arr4[i] = Math.abs(random.nextInt(1000));


        }
        //BubleSort s = new BubleSort();
        HeapSort s = new HeapSort();
        //QuickSort s = new QuickSort();
        //MergeSort s = new MergeSort();

        System.out.println("arr 1");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " , " );
        }

        System.out.println("arr 2");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + " , ");
        }

        System.out.println("arr 3");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i] + " , ");
        }

        System.out.println("arr 4");
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i] + " , ");
        }

        long time1 = s.sort(arr1);
        long time2 = s.sort(arr2);
        long time3 = s.sort(arr3);
        long time4 = s.sort(arr4);
        double Promedio = time1+time2+time3+time4;

        System.out.println("arr1: " + time1 + "arr2: "+ time2 + "arr3: " + time3+ "arr4: " + time4);
        System.out.println("\nPromedio");
        System.out.println(Promedio/4 + " milisegundos");
    }
}
