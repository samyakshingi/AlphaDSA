// Question 1 : Write a Java program to get a number from the user and print whether it is
// positive or negative.
import java.util.*;

public class Q1
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        if(n<0)
        {
            System.out.println("The Number is Negative");
        }
        else
        {
            System.out.println("The Number is Positive");
        }
    }
}