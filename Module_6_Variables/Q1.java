//Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers

import java.util.*;
public class Q1 {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A");
        int A = sc.nextInt();
        System.out.println("Enter value of B");
        int B = sc.nextInt();
        System.out.println("Enter value of C");
        int C = sc.nextInt();

        System.out.println("Average of three numbers is: " + (int)(A+B+C)/3 );
    }
}