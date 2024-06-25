// Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
// an eraser. You have to output the total cost of the items back to the user as their bill
import java.util.*;

public class Q3 {
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of pensil: ");
        float pencilCost = sc.nextFloat();
        System.out.println("Enter the cost of pen: ");
        float penCost = sc.nextFloat();
        System.out.println("Enter the cost of eraser: ");
        float eraserCost = sc.nextFloat();
        
        System.out.println("Total Bill of Customer with 18% gst is:" + ((pencilCost + penCost + eraserCost)+((pencilCost + penCost + eraserCost))*0.18) );
    }
}
