
import edu.ujcv.progra1.SortTester;

import java.util.Arrays;
import java.util.Scanner;
public abstract class HeapSort implements SortTester {
    private static Scanner sc;

    public static void main(String args[]) {

        sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de elementos que desea ordenar");
        int n = sc.nextInt();


        System.out.println("Ingrese los numeros a ordenar: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("El arreglo sin ordenar es: ");
        System.out.println(Arrays.toString(arr));

        heap(arr);

        System.out.println("El arreglo ordenado es: ");
        System.out.println(Arrays.toString(arr));
    }

    static void heapify(int a[], int n, int i) {
        int max, child;
        child = 2 * i + 1;
        max = i;
        if (child < n)
            if (a[child] > a[max])
                max = child;
        if (child + 1 < n)
            if (a[child + 1] > a[max])
                max = child + 1;
        if (max != i) {
            int temp = a[i];
            a[i] = a[max];
            a[max] = temp;
            heapify(a, n, max);
        }
    }

    static void buildheap(int a[]) {
        for (int i = a.length / 2 - 1; i >= 0; i--)
            heapify(a, a.length, i);
    }

    static void heap(int a[]) {
        buildheap(a);
        for (int i = a.length - 1; i >= 1; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a, i, 0);
        }
    }

}


