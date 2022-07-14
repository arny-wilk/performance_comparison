import java.util.Arrays;
import java.util.Random;

public class BubbleSortRandom {
    public static void main(String[] args) {
        Random g = new Random();
        
        int [] number = new int [10000];

        System.out.println("Random Numbers:");
        for (int d = 0; d < number.length; d++) {
            number[d] = g.nextInt(10000)+1;
        }

        long start = System.currentTimeMillis();
    
        System.out.println("\nSorted Numbers"+Arrays.toString(BubbleSortAsceMethods(number)));

        long end = System.currentTimeMillis();
        System.out.println("elapsed time: " + (end - start) + "ms"); 
    }

    public static int[] BubbleSortAsceMethods(int[] x){
        int temp; 
        boolean swapped;

        for (int i = 0; i < x.length-1; i++) {
            swapped = false;
            for ( int j = 1 ; j < x.length-i-1; j++){
                if ( x[j+1] < x[j]){
                    temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                    swapped = true;
                }
        }  
    }
    return x;    
    }
    
}
