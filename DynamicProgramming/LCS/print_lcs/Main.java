package DynamicProgramming.LCS.print_lcs;

import static DynamicProgramming.LCS.length_of_lcs.Tabulation.lcs;

public class Main {

    public static void main(String[] args) {
        String s1="abcde";
        String s2="bdgek";
        int [][] dp=new int[s1.length()+1][s2.length()+1];

        System.out.println(lcs(s1,s2,dp));
        int val=0;
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){

//                if(dp[i][j]>val) {
//                    System.out.print(s2.charAt(j-1));
//                    val++;
//                }
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }

}
