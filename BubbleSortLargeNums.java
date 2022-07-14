import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSortLargeNums {

    public static void bubbleSort(Long[] arr) {
        long temp;
        boolean swapped;
        for(int i=0;i<arr.length-1;i++){
            swapped = false;
            for(int j=0;j<arr.length-i-1; j++){
                if (arr[j+1]<arr[j]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }
             // IF no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
            printArray(arr);        // use method printArray
    }
} 
    
    public static void printArray(Long[] arr){
        int i;
        for (i = 0; i < arr.length-1; i++){
            System.out.printf("%3d", arr[ i ] );
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException 
    {   
        // Create a scanner inFile1
        Scanner inFile1 = new Scanner(new File("numbers.txt")).useDelimiter(",\\s*");

        List<Long> temps = new ArrayList<Long>();
        
        //while loop
        while (inFile1.hasNext()) {
            // Find next line
            long token1 = inFile1.nextLong();
            temps.add(token1);
        }
        inFile1.close();

        Long[] tempsArray = temps.toArray(new Long[0]);

        long start = System.currentTimeMillis();

        bubbleSort(tempsArray);

        for (Long s : tempsArray) {
            System.out.println(s);
        }

        long end = System.currentTimeMillis();
        System.out.println("elapsed time: " + (end - start) + "ms"); 
        
    }
}