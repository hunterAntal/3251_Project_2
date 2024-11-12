public class BubbleSortStd {
    public <T extends Comparable<T>> void BubbleSort(T[] a) {
        boolean sorted = false;
        for (int last = a.length - 1; (last >= 1) && (!sorted); last--) {
            sorted = true;
            for (int i = 0; i < last; i++)
                if (a[i].compareTo(a[i + 1]) > 0) {
                    T tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                    sorted = false;
                }
        }
    }
}

