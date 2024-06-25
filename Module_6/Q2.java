//Question 2: In a program, input the side of a square. You have to output the area of the square.

import java.util.*;
public class Q2 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the side of square: ");
        int side = sc.nextInt();

        System.out.println("Area of square is: " + side*side);
    }
}
