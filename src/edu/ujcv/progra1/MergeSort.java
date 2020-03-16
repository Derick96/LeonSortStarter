package edu.ujcv.progra1;

public class MergeSort  implements SortTester{
    @Override
    public long sort(int[] array) {
        long start = System.nanoTime();
        int [] tmp = new int[array.length];
        mergeSort(array, tmp, 0, array.length-1);


        long end = System.nanoTime();

        return end - start;
    }


     static void mergeSort(int[] a, int[] tmp,int left, int right){
        if(left < right){
            int centre = (left + right)/2;
            mergeSort(a, tmp, left, centre);
            mergeSort(a, tmp, centre+1, right);
            merge(a, tmp, left, centre+1, right);
        }
    }
     static void merge(int [] a, int [] tmp, int left, int right, int rend){
        int lend = right-1;
        int tpos = left; int lbeg = left;

        while(left <= lend && right <= rend){
            if(a[left] < a[right]){
                tmp[tpos++] = a[left++];
            }else{
                tmp[tpos++] = a[right++];
            }
        }
        while(left <= lend){
            tmp[tpos++] = a[left++];
        }
        while(right <= rend){
            tmp[tpos++] = a[right++];
        }
        for(tpos = lbeg; tpos <= rend; tpos++){
            a[tpos] = tmp[tpos];
        }}
}
