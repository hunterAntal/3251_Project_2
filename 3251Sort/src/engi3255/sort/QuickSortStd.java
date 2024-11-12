package engi3255.sort;

public class QuickSortStd implements Sort{
    public <T extends Comparable<T>> void QuickSort(T[] a) {
        quicksort(a, 0, a.length - 1);
    }

    private static final int CUTOFF = 10;

    /**
     * Method to swap to elements in an array.
     *
     * @param a      an array of objects.
     * @param index1 the index of the first object.
     * @param index2 the index of the second object.
     */
    public <T extends Comparable<T>> void swapReferences(T[] a, int index1, int index2) {
        T tmp = a[index1];
        a[index1] = a[index2];
        a[index2] = tmp;
    }

    /**
     * Internal quicksort method that makes recursive calls.
     * Uses median-of-three partitioning and a cutoff of 10.
     *
     * @param a    an array of Comparable items.
     * @param low  the left-most index of the subarray.
     * @param high the right-most index of the subarray.
     */
    private<T extends Comparable<T>> void quicksort(T[] a, int low, int high) {
        if (low + CUTOFF > high)
            insertionSort(a, low, high);
        else {
            // engi3255.sort.Sort low, middle, high
            int middle = (low + high) / 2;
            if (a[middle].compareTo(a[low]) < 0)
                swapReferences(a, low, middle);
            if (a[high].compareTo(a[low]) < 0)
                swapReferences(a, low, high);
            if (a[high].compareTo(a[middle]) < 0)
                swapReferences(a, middle, high);

            // Place pivot at position high - 1
            swapReferences(a, middle, high - 1);
            T pivot = a[high - 1];

            // Begin partitioning
            int i, j;
            for (i = low, j = high - 1; ; ) {
                while (a[++i].compareTo(pivot) < 0)
                    ;
                while (pivot.compareTo(a[--j]) < 0)
                    ;
                if (i >= j)
                    break;
                swapReferences(a, i, j);
            }

            // Restore pivot
            swapReferences(a, i, high - 1);

            quicksort(a, low, i - 1);    // engi3255.sort.Sort small elements
            quicksort(a, i + 1, high);   // engi3255.sort.Sort large elements
        }
    }

    /**
     * Internal insertion sort routine for subarrays
     * that is used by quicksort.
     *
     * @param a   an array of Comparable items.
     * @param low the left-most index of the subarray.
     * @param n   the number of items to sort.
     */
    private <T extends Comparable<T>> void insertionSort(T[] a, int low, int high) {
        for (int p = low + 1; p <= high; p++) {
            T tmp = a[p];
            int j;

            for (j = p; j > low && tmp.compareTo(a[j - 1]) < 0; j--)
                a[j] = a[j - 1];
            a[j] = tmp;
        }
    }

    @Override
    public void sort(Comparable[] a) {
        QuickSort(a);
    }

    @Override
    public long getCompares() {
        return 0;
    }
}


