//Max Sum Prefix Array 

public class Q6 {
    public static void PrefixArraySum(int arr[]){
        int n = arr.length;
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int PrefixSum[] = new int[arr.length];
        PrefixSum[0] = arr[0];
        for(int i=1;i<PrefixSum.length;i++){
            PrefixSum[i] = PrefixSum[i-1] + arr[i];
        }
        
        for(int i=0;i<n;i++){
            int start = i;
            for(int j=i;j<n;j++){
                int end = j;
                currsum = start == 0 ? PrefixSum[end] : PrefixSum[end] - PrefixSum[start-1];  
                
                if(maxsum < currsum){
                    maxsum = currsum;
                }               
            }
        }
        System.out.println("Max Sum: "+ maxsum);
    }

    public static void main(String args[]){
    int arr[] = {2,-4,1,6,-3};
    PrefixArraySum(arr);
    }
}
