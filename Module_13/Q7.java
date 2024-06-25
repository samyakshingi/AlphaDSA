//Kadans algorithm

public class Q7 {

    public static void kadans(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                flag = true;
                break;
            }
        }
        int maxNegative = Integer.MIN_VALUE;
        if(flag){
            for(int i=0;i<arr.length;i++){
                if(maxNegative<arr[i]){
                    maxNegative = arr[i];
                }
            }
            System.out.println("Max Negative value is: " + maxNegative);
        }
        for (int i=0;i<arr.length;i++){
            currSum += arr[i];
            if(currSum<0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
            }
        System.out.println("Max Sum is: "+maxSum);
        
    }
    
    public static void main(String Arg[]){
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        //int brr[] = {-2,-5,-4,-8,-6,-4};
        kadans(arr);
    }
}