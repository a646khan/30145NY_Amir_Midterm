package algorithm;


import org.testng.annotations.Test;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class UnitTestSorting {

    private int [] unSortedArray = {6,9,2,5,1,0,4};
    private int [] sortedArray =   {0,1,2,4,5,6,9};

    //Create Sort object
    private Sort sort = new Sort();

    @Test
    public void testSelectionSort() {

        int[] result = sort.selectionSort(unSortedArray);
        assertArrayEquals(result, sortedArray);
    }

    @Test
    public void testInsertionSort() {

        int[] result = sort.insertionSort(unSortedArray);
        assertArrayEquals(result, sortedArray);
    }

    @Test
    public void testBubbleSort() {

        int[] result = sort.bubbleSort(unSortedArray);
        assertArrayEquals(result, sortedArray);
    }

    @Test
    public void testMergeSort() {

        int[] result = sort.mergeSort(unSortedArray, unSortedArray.length);
        assertArrayEquals(result, sortedArray);
    }

    @Test
    public void testQuickSort() {

        int[] result = sort.quickSort(unSortedArray, 0, unSortedArray.length - 1);
        assertArrayEquals(result, sortedArray);
    }

    @Test
    public void testHeapSort() {

        int[] result = sort.heapSort(unSortedArray);
        assertArrayEquals(result, sortedArray);
    }

    @Test
    public void testBucketSort() {

        int[] result = sort.bucketSort(unSortedArray, 10);
        assertArrayEquals(result, sortedArray);
    }

    @Test
    public void testShellSort() {

        int[] result = sort.shellSort(unSortedArray);
        assertArrayEquals(result, sortedArray);
    }


}