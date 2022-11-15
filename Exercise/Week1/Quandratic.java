package Frankfurt.Exercise.Week1;

import java.util.*;

public class Quandratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input a,b,c with ax^2 + bx + c
        System.out.print("Input a,b,c with ax^2 + bx + c\n");
        System.out.print("Input a: ");
        double a = sc.nextDouble();
        System.out.print("Input b: ");
        double b = sc.nextDouble();
        System.out.print("Input c: ");
        double c = sc.nextDouble();

        double x1, x2;

        // Calculating delta
        double Delta = b * b - 4 * a * c;
        System.out.print("\nDelta = " + Delta + "\n");

        // If Delta > 0
        if (Delta > 0) {
            x1 = (-b + Math.sqrt(Delta)) / 2 * a;
            x2 = (-b - Math.sqrt(Delta)) / 2 * a;
            System.out.print("The quadratic have two solution \nx1 = " + x1 + "\nx2 = " + x2);
        }

        // If Delta = 0
        else if (Delta == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.print("The quadratic have one solution \nx1 = x2 = " + x1);
        }

        // If Delta < 0
        else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-Delta) / (2 * a);
            System.out.print("The quadratic have two solution \n");
            System.out.format("x1 = %.2f+%.2f \n", real, imaginary);
            System.out.format("x2 = %.2f-%.2f \n", real, imaginary);
        }

        sc.close();

    }
}
