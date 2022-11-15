package Frankfurt.Exercise.Week4.Question_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

//This program demonstrates how to write characters to a text file.

public class Writefile {
    
    // Main driver method
    public static void main(String[] args)
        throws IOException
    {
        // Assigning the content of the file
        String text
            = "Wiet frot in eienm katlen Lnad shett Wnaajs Huas am Wnsalreadd. In lgnean Zpaefn hngät das Eis, und rgins hruem ist aells wieß.";
 
        // Defining the file name of the file
        Path fileName = Path.of(
            "/Users/namng/Desktop/Java/Frankfurt/Exercise/Week4/Question_4/text_in.txt");
 
        // Writing into the file
        Files.writeString(fileName, text);
 
        // Reading the content of the file
        String file_content = Files.readString(fileName);
 
        // Printing the content inside the file
        System.out.println(file_content);
    }
}
