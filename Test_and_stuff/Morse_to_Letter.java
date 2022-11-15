package Frankfurt.Test_and_stuff;

// Java Program to Convert English
// Text to Morse Code and Vice Versa
import java.util.*;

public class Morse_to_Letter {

    public static void englishToMorse(String[] code,
            String message,
            char[] letter, 
            int numlenght[]) {
        for (int i = 0; i < message.length(); i++) {
            for (int j = 0; j < letter.length; j++) {
                if (message.charAt(i) == letter[j]) {
                    System.out.print(code[j]);
                    numlenght[i] = code[j].length();
                    break;
                }

            }
        }
        System.out.print(" ");
        for (int i = 0; i < message.length(); i++) {
            System.out.print(numlenght[i]);
        }
    }

    public static void morseToEnglish(String[] code,
            String morseCode, 
            int numlenght[]) {

        String[] array = morseCode.split(" ");
        System.out.print("Morse code " + morseCode
                + " to English is ");
        // Morse code to English
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < code.length; j++) {
                if (array[i].compareTo(code[j]) == 0) {
                    System.out.print((char) (j + 'a') + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        // store the all the alphabet in an array
        char[] letter = { 'A', 'B', 'C', 'D', 'E', 'F',
                'G', 'H', 'I', 'J', 'K', 'L',
                'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X',
                'Y', 'Z', '_', '.', ',', '?' };
        // Morse code by indexing
        String[] code = { ".-", "-...", "-.-.", "-..", ".",
                "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--",
                "--..", "..--", "---.", ".-.-", "----" };

        int numlenght[] = new int[3000];

        // Input Strings
        Scanner sc = new Scanner(System.in);
        String message = sc.next();

        // English to morse code
        englishToMorse(code, message, letter, numlenght);

        sc.close();
    }
}
