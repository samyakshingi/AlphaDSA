// Question 5 :
// Write a Java method to compute the sum of the digits in an integer.


import java.util.*;
public class Q5 {
    public static int SumDigit(int n){
        int sum = 0;
        while(n != 0){
            sum = sum + (n%10);
            n = n/10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Sum of digits in number is: " + SumDigit(num));

    }
}
