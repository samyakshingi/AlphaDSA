// Question 3 : Write a Java program to check if a number is a palindrome in Java? ( 121 is a
// palindrome, 321 is not)
// A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
// palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
// palindrome because the reverse of 321 is 123, which is not equal to 321.

import java.util.*;
public class Q3 {
    
    public static boolean isPalindrome(int n){
        int temp = n;
        int rev = 0;
        
        while(temp != 0){
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp/10; 
        }
        if (n == rev) return true;
        else{return false;}

    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if(isPalindrome(num)){
            System.out.println(num + " is a palindrom");
        }
        else{
            System.out.println(num +" isn't a palindrom");}
        }
        
    }

