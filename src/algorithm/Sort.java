package algorithm;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return array;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }



        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return array;
    }

    public int[] bubbleSort(int [] array){

        for (int i = 0; i < array.length-1; i++)
            for (int j = 0; j < array.length-i-1; j++)
                if (array[j] > array[j+1]) {

                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

        return array;
    }


    public int [] mergeSort(int [] array, int n){

        if (n < 2) {
            return array;
        }
        int mid = array.length / 2;
        int[] l = new int[mid];
        int[] r = new int[array.length - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < array.length; i++) {
            r[i - mid] = array[i];
        }
        mergeSort(l, mid);
        mergeSort(r, array.length - mid);

        merge(array, l, r, mid, array.length - mid);



        return array;
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }


    public int [] quickSort(int [] array, int start, int end){

        int partition = partition(array, start, end);

        if(partition-1>start) {
            quickSort(array, start, partition - 1);
        }
        if(partition+1<end) {
            quickSort(array, partition + 1, end);
        }
        return array;
    }

    public static int partition(int[] array, int start, int end){
        int pivot = array[end];

        for(int i=start; i<end; i++){
            if(array[i]<pivot){
                int temp= array[start];
                array[start]=array[i];
                array[i]=temp;
                start++;
            }
        }

        int temp = array[start];
        array[start] = pivot;
        array[end] = temp;

        return start;
    }

    public int [] heapSort(int [] array){

        for (int i = array.length / 2 - 1; i >= 0; i--)
            heapify(array, array.length, i);

        // One by one extract an element from heap
        for (int i=array.length-1; i>=0; i--)
        {
            // Move current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // call max heapify on the reduced heap
            heapify(array, i, 0);
        }
        return array;
    }

    void heapify(int arr[], int n, int i)
    {
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;


        if (l < n && arr[l] > arr[largest])
            largest = l;


        if (r < n && arr[r] > arr[largest])
            largest = r;


        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }


    public int [] bucketSort(int [] array, int noOfBuckets){


        List[] buckets = new List[noOfBuckets];

        for(int i = 0; i < noOfBuckets; i++){
            buckets[i] = new LinkedList<>();
        }

        for(int num : array){

            buckets[hash(num)].add(num);
        }
        // sort buckets
        for(List bucket : buckets){
            Collections.sort(bucket);
        }
        int i = 0;
        // Merge buckets to get sorted array
        for(List<Integer> bucket : buckets){
            for(int num : bucket){
                array[i++] = num;
            }
        }
        return array;
    }

    public static int hash(int num){
        return num/10;
    }

    public int [] shellSort(int [] array){

        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int key = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > key) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = key;
            }
        }
        return array;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}