//subarrays

public class Q4 {
    public static void Subarr(int arr[]){
        int ts = 0;
        int n = arr.length;
        for (int i=0 ;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<j;k++){
                    System.out.print(arr[k] + " ");
                    ts++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub Arrays: "+ts);
    } 

    public static void main(String Arg[]){
        int arr[] = {2,4,6,8,10};
        Subarr(arr);        
    }
}
