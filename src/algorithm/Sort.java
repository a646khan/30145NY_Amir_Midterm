package algorithm;

public class Sort {

    long executionTime = 0;

    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */


    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
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
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here

        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        int[] list = array;
        //implement here

        final long startTime = System.currentTimeMillis();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    private int[] tempMergArr;

    public int[] mergeSort(int[] array) {
        int[] list = array;
        //implement here

        final long startTime = System.currentTimeMillis();
        this.arr = list;
        this.length = list.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            doMergeSort(lowerIndex, middle);
            doMergeSort(middle + 1, higherIndex);
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = arr[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                arr[k] = tempMergArr[i];
                i++;
            } else {
                arr[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            arr[k] = tempMergArr[i];
            k++;
            i++;
        }

    }

    private int arr[];
    private int length;

    public int[] quickSort(int[] array) {
        int[] list = array;
        //implement here


        final long startTime = System.currentTimeMillis();//
        this.arr = list;
        length = list.length;
        quickSort(0, length - 1);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    private void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;

        int pivot = arr[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {

            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }

        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }

    private void exchangeNumbers(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public int[] heapSort(int[] array) {
        int[] list = array;
        //implement here

        final long startTime = System.currentTimeMillis();

        int n = list.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapy(array, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapy(array, i, 0);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    void heapy(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapy(arr, n, largest);
        }
    }

    public int[] bucketSort(int[] array) {
        int[] list = array;
        //implement here

        final long startTime = System.currentTimeMillis();


        int maxVal = getMax(array);
        int[] bucket = new int[maxVal + 1];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = 0;
        }
        for (int i = 0; i < array.length; i++) {
            bucket[array[i]]++;
        }
        int outPos = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                array[outPos++] = i;
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }

    public int getMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    public int[] shellSort(int[] array) {
        int[] list = array;
        //implement here


        final long startTime = System.currentTimeMillis();
        int inner, outer;
        int temp;
        int h = 1;
        while (h <= array.length / 3)
            h = h * 3 + 1;
        while (h > 0) {
            for (outer = h; outer < array.length; outer++) {
                temp = list[outer];
                inner = outer;
                while (inner > h - 1 && list[inner - h] >= temp) {
                    list[inner] = list[inner - h];
                    inner -= h;
                }
                list[inner] = temp;
            }
            h = (h - 1) / 3;
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}