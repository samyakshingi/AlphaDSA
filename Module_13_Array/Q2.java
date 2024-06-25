//reverse of array

public class Q2 {
    public static void Rev(int arr[]){
        int first = 0;
        int last = arr.length-1;
        while(first<last){
            int temp = arr[first];
            arr[first]=arr[last];
            arr[last] = temp ;
            first++;
            last--;
        }
    }

    public static void main(String args[]){
        int arr[] = {5,14,2,565,2,51};
        System.out.println("Reverse of array is: ");
        Rev(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
