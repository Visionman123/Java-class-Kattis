package Frankfurt.Exercise.Week4.Question_4_and_5;

import java.io.*;
import java.util.*;

public class Verification {

    // Main driver method
    public static void main(String[] args) throws Exception {

        // READ FILE
        File file1 = new File(
                "/Users/namng/Desktop/Java/Frankfurt/Exercise/Week4/Question_4_and_5/text_in.txt");

        File file2 = new File(
                "/Users/namng/Desktop/Java/Frankfurt/Exercise/Week4/Question_4_and_5/text_out.txt");

        Scanner sc1 = new Scanner(file1);
        Scanner sc2 = new Scanner(file2);
        // verification
        while (sc1.hasNextLine()) {
            String text1 = sc1.nextLine();
            String text2 = sc2.nextLine();

            System.out.println(text1);
            System.out.println(text2);

            if (text1 == text2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc1.close();
        sc2.close();
    }
}
