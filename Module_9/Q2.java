// Question 2 : Write a program that reads a set of integers, and then prints the sum of the
// even and odd integers.
import java.util.*;

public class Q2{
    public static void main(String Args[])
    {
        int num=0;
        int Choice=0;
        int evensum=0;
        int oddsum=0;
        Scanner sc = new Scanner(System.in);

        do{
        System.out.println("Enter the integers: ");
        num = sc.nextInt();
        if(num%2 == 0)
        {
            evensum += num;
        }
        else
        {
            oddsum += num;
        }
        System.out.println("Press 1 to continue 0 to exit");
        Choice = sc.nextInt();

        }while(Choice == 1);

        System.out.println("Sum of even numbers: " + evensum);
        System.out.println("Sum of odd numbers: " + oddsum);
    }
}