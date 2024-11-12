package engi3255.sort;

public class BubbleSortStd implements Sort {
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

    @Override
    public void sort(Comparable[] a) {
        BubbleSort(a);
    }

    @Override
    public long getCompares() {
        return 0;
    }
}

