// Hunter Antal
// Bubble Sort

public class BubbleSort implements Comparable<BubbleSort> {
    // data members
    Integer[] array;

    // Constructor
    public BubbleSort(Integer[] array) {
        this.array = array;
    }

    // Bubble sort function
    public void bubbleSort() {
        boolean sorted = false;
        for (int last = array.length - 1; (last >= 1) && (!sorted); last--) {
            sorted = true;
            for (int i = 0; i < last; i++) {
                // Using compareTo() to compare Integer elements
                if (array[i].compareTo(array[i + 1]) > 0) {
                    // Swap if elements are out of order
                    Integer tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    sorted = false;
                }
            }
        }
    }

    // Override compareTo method if you want to compare BubbleSort objects
    @Override
    public int compareTo(BubbleSort other) {
        // For demonstration, let's compare based on the sum of the array elements
        int sumThis = 0;
        int sumOther = 0;

        for (Integer num : this.array) {
            sumThis += num;
        }
        for (Integer num : other.array) {
            sumOther += num;
        }
        return Integer.compare(sumThis, sumOther);
    }

    // A function to print the sorted array
    public void printArray() {
        for (Integer num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
