package Frankfurt.Exercise.Week4.Question_4_and_5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Conversion_of_text {
    private static String shuffle(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            List<Character> letters = new ArrayList<Character>();
            for (char letter : word.toCharArray()) {
                letters.add(letter);
            }
            if (letters.size() > 2) {
                Collections.shuffle(letters.subList(1, letters.size() - 1));
            }
            for (char letter : letters) {
                builder.append(letter);
            }
            builder.append(" ");
        }
        return builder.toString();
    }

    // Main driver method
    public static void main(String[] args) throws Exception {

        // File path is passed as parameter
        File file = new File(
                "/Users/namng/Desktop/Java/Frankfurt/Exercise/Week4/Question_4_and_5/text_in.txt");

        // Note: Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)

        // Creating an object of BufferedReader class
        BufferedReader br = new BufferedReader(new FileReader(file));

        Scanner sc = new Scanner(file);
        String textin;

        // Defining the file name of the file
        Path fileName = Path.of(
                "/Users/namng/Desktop/Java/Frankfurt/Exercise/Week4/Question_4_and_5/text_out.txt");

        // Read and write
        while (sc.hasNextLine()) {
            textin = sc.nextLine();
            System.out.println(textin);
            String textout = shuffle(textin);
            Files.writeString(fileName, textout); // Writing into the file
        }

        // Reading the content of the file
        String file_content = Files.readString(fileName);

        // Printing the content inside the file
        System.out.println(file_content);

    }
}
