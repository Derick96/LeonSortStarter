package edu.ujcv.progra1;
import java.util.*;

    public class QuickSort {
        static int partition(int arr[], int low, int high)
        {
            int pivot = arr[high];
            int i = (low - 1); // índice de elemento más pequeño
            for (int j = low; j <= high - 1; j++) {
                // si el elemento es menor que o
                // igual al pivote
                if (arr[j] <= pivot) {
                    i++;

                    // intercambia arr [i] y arr [j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            // intercambiar arr [i + 1] y arr [alto] (o pivote)
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            return i + 1;
        }
        static void qSort(int arr[], int low, int high){
            if (low < high) {
                int pi = partition(arr, low, high);
                qSort(arr, low, pi - 1);
                qSort(arr, pi + 1, high);
            }
        }
    }


