package Frankfurt.Exercise.Week4.Question_2;

import java.util.*;

public class Shuffle {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(args);
        Collections.shuffle(list);
        System.out.println(list);
    }
}


// import java.util.*;

// public class Shuffle {
//     public static void main(String[] args) {
//         List<String> list = new ArrayList<String>();
//         for (String a : args)
//             list.add(a);
//         Collections.shuffle(list, new Random());
//         System.out.println(list);
//     }
// }
