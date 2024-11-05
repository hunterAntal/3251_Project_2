package engi3255.sort;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Integer[] testArray = {4,3,2,5,7,9,10};

        BubbleSort bub = new BubbleSort(testArray);
        bub.bubbleSort();
        bub.printArray();
    }
}