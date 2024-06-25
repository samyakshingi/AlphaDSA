// Question 4 : READ & CODE EXERCISE
// Search about(Google) & use the following methods of the Math class in Java:
// a. Math.min( )
// b. Math.max( )
// c. Math.sqrt( )
// d. Math.pow( )
// e. Math.avg( )
// f. Math.abs( )

import java.util.*;
public class Q4{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number: ");
        int b = sc.nextInt();

        System.out.println("Minimum of the numbers is: " + Math.min(a,b));
        System.out.println("Maximum of the numbers is: " + Math.max(a,b));
        System.out.println("sqrt of A is: " + Math.sqrt(a));
        System.out.println("a pow b is: " + Math.pow(a,b));
        System.out.println("abs of the numbers is: " + Math.abs(a));
    }
}