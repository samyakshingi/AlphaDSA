//Binary Search Code

public class Q1{
    public static int BinSer(int arr[], int k){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start + end)/2; 
            
            if(k == arr[mid]){
                return mid;
            }
            if(arr[mid]<k){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }


    public static void main(String args[]){
        int arr[] = {2,8,9,12,18,26};
        int key = 18;
        

        System.out.println("Index of number found is: " + BinSer(arr,key));
    }
}