// Question 3 : Write a program to find the factorial of any number entered by the user.
import java.util.*;
public class Q3 {
    public static void main(String arg[])
    {
        int n = 0;
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            fact *= i;
        }
        System.out.println("Factorial of number is: " + fact);

    }
}
