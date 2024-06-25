// Question 1 : Write a Java method to compute the average of three numbers..
import java.util.*;

public class Q1{

    public static int avg(int a, int b, int c){
        return (int)(a+b+c)/3;
    }

    public static void main(String[] args){
        int average = avg(5,8,9);

        System.out.println("Average is: " + average);
    }
}