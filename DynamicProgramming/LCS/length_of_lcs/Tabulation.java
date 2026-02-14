package DynamicProgramming.LCS.length_of_lcs;

public class Tabulation {

    public static void main(String[] args) {
        //call lcs function here
    }

    public static int lcs(String s1, String s2,int [][] dp) {
        int idx1 = s1.length();
        int idx2 = s2.length();
//        int[][] dp = new int[idx1 + 1][idx2 + 1];

        // for(int a[]:dp) Arrays.fill(a,-1);

        // return helper(s1,s2,idx1-1,idx2-1);


        for (int i = 1; i <= idx1; i++) {
            for (int j = 1; j <= idx2; j++) {

                char ch1 = s1.charAt(i - 1);

                char ch2 = s2.charAt(j - 1);

                if (ch1 == ch2) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }

            }
        }

        return dp[idx1][idx2];
    }
}