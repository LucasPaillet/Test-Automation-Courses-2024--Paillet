import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ordering algorithms");
        long startTime;
        long endTime;
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        var number = 0;

        System.out.println();
        System.out.print("Enter the array length: ");
        int length = Integer.parseInt(console.next());
        int[] unorderedArray = new int[length];
        System.out.println();
        System.out.print("Enter the highest value: ");
        System.out.println();
        int highest = Integer.parseInt(console.next());
        StringBuilder output = new StringBuilder("Unordered array: ");
        var word = "";
        for (int i = 0; i <= length - 1; i++)
        {
            unorderedArray[i] = random.nextInt(highest);
            word = ", %d".formatted(unorderedArray[i]);
            output.append(word);
        }
        System.out.println(output);
        System.out.println();

        // To use a diferent algorithm, just decomment the line and re-run
        // Once an algorithm run's, the unorderedArray it's ordered, so the other algorithms will do nothing

        //inserter(unorderedArray);
        //selecter(unorderedArray);
        //bubbler(unorderedArray);
        //merger(unorderedArray);
        quicker(unorderedArray);

    }

    static void printer(int[] array, String title, long startTime, long endTime)
    {
        StringBuilder output = new StringBuilder(title + " ordered array: ");
        var length = array.length;
        String word;
        for (int i = 0; i < length; i++)
        {
            word = ", %d".formatted(array[i]);
            output.append(word);
        }
        System.out.println(output);
        System.out.printf("Time elapsed: %d nanoseconds", (endTime - startTime));
        System.out.println();
    }

    static void inserter(int[] unorderedArray)
    {
        System.out.println();
        System.out.println("Insertion Sort");
        InsertionSort insertion = new InsertionSort();

        var startTime = (System.nanoTime());
        int[] insertionOrderedArray = insertion.insertionSort(unorderedArray);
        var endTime = (System.nanoTime());

        printer(insertionOrderedArray, "Insertion", startTime, endTime);
    }

    static void selecter(int[] unorderedArray)
    {
        System.out.println();
        System.out.println("Selection Sort");
        SelectionSort selection = new SelectionSort();

        var startTime = (System.nanoTime());
        int[] selectionOrderedArray = selection.selectionSort(unorderedArray);
        var endTime = (System.nanoTime());

        printer(selectionOrderedArray, "Selection", startTime, endTime);
    }

    static void bubbler(int[] unorderedArray)
    {
        System.out.println();
        System.out.println("Bubble Sort");
        BubbleSort bubble = new BubbleSort();

        var startTime = (System.nanoTime());
        int[] bubbleOrderedArray = bubble.bubbleSort(unorderedArray);
        var endTime = (System.nanoTime());

        printer(bubbleOrderedArray, "Bubble", startTime, endTime);
    }

    static void merger(int[] unorderedArray)
    {
        System.out.println();
        System.out.println("Merge Sort");
        MergeSort merge = new MergeSort();

        var startTime = (System.nanoTime());
        int[] mergeOrderedArray = merge.mergeSort(unorderedArray);
        var endTime = (System.nanoTime());

        printer(mergeOrderedArray, "Merge", startTime, endTime);
    }

    static void quicker(int[] unorderedArray)
    {
        System.out.println();
        System.out.println("Quick Sort");
        QuickSort quick = new QuickSort();

        var startTime = (System.nanoTime());
        quick.quickSort(unorderedArray, 0, unorderedArray.length - 1);
        var endTime = (System.nanoTime());

        printer(unorderedArray, "Quick", startTime, endTime);
    }
}
