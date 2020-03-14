package edu.ujcv.progra1;

import edu.ujcv.progra1.SortTester;



public  class HeapSort implements SortTester {

    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        heap(array);

        long end = System.currentTimeMillis();

        return end - start;
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


