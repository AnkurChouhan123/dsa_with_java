package DynamicProgramming.Frog_Jump_With_K_Distance;

import java.util.Arrays;

public class Recursive {
    public static void main(String[] args) {
        int arr[]={10,5,20,0,15};

        System.out.println(helper(arr,2));

    }

    static int helper(int [] arr,int k){
        int dp[]=new int[arr.length+1];
          dp[0]=0;
        for(int i=1;i<arr.length;i++){
            int minSteps=Integer.MAX_VALUE;
            for(int j=1;j<=k;j++){
                if(i-j>=0){
                 int jump=dp[i-j]+Math.abs(arr[i]-arr[i-j]);
                 minSteps=Math.min(minSteps,jump);
                }

            }
            dp[i]=minSteps;


        }
        return dp[arr.length-1];
    }
}
