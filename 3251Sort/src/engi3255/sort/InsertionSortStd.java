package engi3255.sort;

public class InsertionSortStd implements Sort {
    int compare;
    public <T extends Comparable<T>> void InsertionSort(T[] a) {
        for (int p = 0; p < a.length; p++) {
            int i = p;
            boolean sorted = false;
            while ((i > 0) && (!sorted)) {
                if (a[i].compareTo(a[i - 1]) < 0) {
                    T tmp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = tmp;
                    i--;
                } else
                    sorted = true;
                this.compare++;
            }
        }
    }

    @Override
    public void sort(Comparable[] a) {
        this.InsertionSort(a);
    }

    @Override
    public long getCompares() {
        return compare;
    }
}


