package engi3255.sort;

public class SelectionSortStd implements Sort{
    int compare;

    public <T extends Comparable<T>> void SelectionSort(T[] a) {
        for (int last = a.length - 1; last >= 1; last--) {
            int max = 0;
            for (int i = 1; i <= last; i++){
                if (a[i].compareTo(a[max]) > 0)
                    max = i;
                this.compare++;
            }


            T tmp = a[max];
            a[max] = a[last];
            a[last] = tmp;
        }
    }

    @Override
    public void sort(Comparable[] a) {
        this.SelectionSort(a);
    }

    @Override
    public long getCompares() {
        return compare;
    }
}

	