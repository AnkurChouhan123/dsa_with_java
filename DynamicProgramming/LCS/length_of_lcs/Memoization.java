package DynamicProgramming.LCS.length_of_lcs;

import java.util.Arrays;

public class Memoization {
    public static void main(String[] args) {
        // call main function here
    }

    static int lcs(String s1, String s2) {
        int idx1=s1.length();
        int idx2=s2.length();
        dp=new int[idx1+1][idx2+1];

        for(int a[]:dp) Arrays.fill(a,-1);

        return helper(s1,s2,idx1-1,idx2-1);

    }

    static int dp[][];

    static int helper(String s1,String s2,int idx1 , int idx2){

        if(idx1<0||idx2<0) return 0;

        if(dp[idx1][idx2]!=-1) return dp[idx1][idx2];

        char ch1=s1.charAt(idx1);
        char ch2=s2.charAt(idx2);

        if(ch1==ch2){
            return 1+helper(s1,s2,idx1-1,idx2-1);
        }

        dp[idx1][idx2]= Math.max(helper(s1,s2,idx1-1,idx2),helper(s1,s2,idx1,idx2-1));
        return dp[idx1][idx2];
    }
}
