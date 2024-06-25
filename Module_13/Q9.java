
// Buy and sell stocks
// You are given an array prices where prices[il is the price of a given stock
// on the ith day. You want to maximize your profit by choosing a single day to
// buy one stock and choosing a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you
// cannot achieve any profit, return 0.
public class Q9{
    public static int stock(int arr[]){
        int bp = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<arr.length;i++){
            if(bp<arr[i]){
                int profit = arr[i] - bp;
                maxProfit = Math.max(profit,maxProfit);
            }
            else{
                bp = arr[i];
            }
        }
        return maxProfit;
    }
    
    public static void main(String Args[]){
        int arr[] = {7,1,5,3,6,4};
        System.out.println("Maximum Profit is: " + stock(arr));
        
    }
}