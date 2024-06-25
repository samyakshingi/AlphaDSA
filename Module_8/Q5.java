// Question 5 : Write a Java program that takes a year from the user and print whether that
// year is a leap year or not.
import java.util.*;
public class Q5 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int y = sc.nextInt();

        if(y%4 == 0)
        {
            if(y%100 == 0)
            {
                if(y%400 == 0)
                {
                    System.out.println("Leap Year");
                }
                else
                {
                    System.out.println("Not a Leap Year");
                }
            }
            else
            {
                System.out.println("Leap Year");
            }
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }
}
