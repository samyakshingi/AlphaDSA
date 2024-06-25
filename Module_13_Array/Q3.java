//pairs in array

public class Q3 {
    public static void pairs(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print("("+arr[i]+","+arr[j]+")"+ " ");
            }
            System.out.println();
        }
    }


    public static void main(String Arg[]){
        int arr[] = {51,33,2,1,4,55,1};
        pairs(arr);
    }
}
