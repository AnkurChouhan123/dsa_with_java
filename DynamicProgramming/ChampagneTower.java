package DynamicProgramming;
class ChampagneTower {
    public double champagneTower(int poured, int query_row, int query_glass) {
        dp = new Double[query_row+1][query_glass+1];
        return Math.min(1.0,solve(poured,query_row,query_glass));
    }

    Double[][] dp;

    double solve(int poured , int i ,int j){
        if(i<0 || j<0 || i<j) return 0;

        if(i==0 && j==0) return poured;

        if(dp[i][j] != null) return dp[i][j];

        double leftTop = (solve(poured,i-1,j-1)-1)/2.0;
        double rightTop = (solve(poured,i-1,j)-1)/2.0;

        if(leftTop<0) leftTop =  0.0;
        if(rightTop<0) rightTop = 0.0;

        dp[i][j] = leftTop + rightTop;
        return dp[i][j];
    }
}