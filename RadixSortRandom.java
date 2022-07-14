import java.util.Random;

public class RadixSortRandom {
    private static final int MAX = 0;

    public static void main(String[] args) {
        Random rand = new Random();
        int MAX;
        Long[] numbers = new Long[MAX];
        for (int i = 0; i < MAX; i++) {
            numbers[i] = Math.abs(rand.nextLong()) % MAX;
        }

        printResult(Main::radixSort, numbers.clone(), "Radix Sort");
        printResult(arr -> Arrays.stream(arr).sorted().toArray(Long[]::new), numbers.clone(), "Java Default Sort");
        printResult(Main::bubbleSort, numbers.clone(), "Bubble Sort");
    }

    public static Long[] bubbleSort(Long[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    long temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        return arr;
    }

    public static Long[] radixSort(Long[] arr) {
        long[] radixSorter = new long[MAX];

        for (long number :
                arr) {
            radixSorter[(int) number]++;
        }

        Long[] sorted = new Long[MAX];
        int arrPointer = 0;
        for (int i = 0; i < radixSorter.length; i++) {
            for (int j = 0; j < radixSorter[i]; j++) {
                sorted[arrPointer++] = (long) i;
            }
        }

        return sorted;
    }
}
