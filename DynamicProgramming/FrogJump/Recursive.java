package DynamicProgramming.FrogJump;

public class Recursive {
    public static void main(String[] args) {
        int arr[]={10,30,40,20,50};
        System.out.println(minCost(arr,arr.length));
    }
    static int minCost(int arr[],int n){
        if(n==1){
            return 0;
        }

        int left=Math.abs(arr[n]-arr[n-1])+minCost(arr,n-1);
        int right=Math.abs(arr[n]-arr[n-2])+minCost(arr,n-2);
        return Math.min(left,right);
    }
}
