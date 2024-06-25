//Trapping Rain Water (Medium Level Question)
// Given n non-negative integers representing an elevation
// map where the width of each bar is 1, compute how much
// water it can trap after raining.
public class Q8 {
    public static int trapping(int arr[]){
        //left max boundary
        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            leftMax[i] = Math.max(leftMax[i-1],arr[i]);
        }
        //right max boundary
        int rightMax[] = new int[arr.length];
        rightMax[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1],arr[i]);
        }
        int twr=0;
        //loop
        for(int i=0;i<arr.length;i++){
            twr += (Math.min(rightMax[i],leftMax[i])-arr[i]);
        }
        return twr;
    }

    public static void main(String Args[]){
        int arr[] = {4,2,0,6,3,2,5};
        System.out.println("Water trapped is: " + trapping(arr));
        
    }    
}
