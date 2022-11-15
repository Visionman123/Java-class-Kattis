package Frankfurt.Exercise.Week1;

import java.util.*;

public class RandomSeqAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input A \n");
        int min = sc.nextInt();
        System.out.print("Input B \n");
        int max = sc.nextInt();
        System.out.print("Input N (number of sequence)\n");
        int size = sc.nextInt();
        System.out.format("Generating random sequence from %d to %d with %d number...",min,max,size);

        // create array
        int RandomArr[] = new int[size];

        for (int i = 0; i < size; i++) {
            // reading array elements from the user
            RandomArr[i] = (int)(Math.random()*(max-min+1)+min);
        }
        System.out.print("\nArray elements are: ");
        // accessing array elements using the for loop
        for (int i = 0; i < size; i++) {
            System.out.print(" " + RandomArr[i]);
        }
        sc.close();
    }
}

