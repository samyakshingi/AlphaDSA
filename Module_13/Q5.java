//Max Sum brutforce

public class Q5 {
    public static void Subarr(int arr[]){
        int n = arr.length;
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i=0 ;i<n;i++){
            int start = i;
            for(int j=i;j<n;j++){
                int end = j;
                currsum = 0;
                for(int k=start;k<=end;k++){
                    currsum += arr[k];
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
                if(maxsum < currsum){
                    maxsum = currsum;
                }
            }
            System.out.println();
        }

        System.out.println("Maxsum Sub Arrays: "+maxsum);

    } 

    public static void main(String Arg[]){
        int arr[] = {-2,4,-6,8,10};
        Subarr(arr);        
    }
}