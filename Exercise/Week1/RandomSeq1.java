package Frankfurt.Exercise.Week1;

import java.util.*;

public class RandomSeq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of sequence\n");
        int size = sc.nextInt();
        System.out.print("Generating random sequence from 0 to 100 with " + size + " number...\n");

        // create array
        int RandomArr[] = new int[size];

        int min = 0;
        int max = 100;
        for (int i = 0; i < size; i++) {
            // reading array elements from the user
            RandomArr[i] = (int)(Math.random()*(max-min+1)+min);
        }
        System.out.print("Array elements are: ");
        // accessing array elements using the for loop
        for (int i = 0; i < size; i++) {
            System.out.print(" " + RandomArr[i]);
        }
        sc.close();
    }
}