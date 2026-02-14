package DynamicProgramming.O_1_KnapSack;

import java.util.Arrays;

public class O2_Memoization {
    public static void main(String[] args) {
        int wt[]={1,3,4,5};
        int val[]={1,4,5,7};
        int w=7;
        for(int [] rows:table) Arrays.fill(rows,-1); //Initialization with -1
        System.out.println(knapsack(wt,val,w,4));

    }
    private static int [][] table=new int[1002][1002];

    static int knapsack(int [] wt,int [] val,int w,int n){
        if(n==0||w==0) return 0;
        if(table[n][w]!=-1){
            return table[n][w];
        }
        if(wt[n-1]<=w){
            table[n][w]= Math.max(val[n-1]+knapsack(wt,val,w-wt[n-1],n-1),knapsack(wt,val,w,n-1));
            return table[n][w];
        }
        else{
            table[n][w]= knapsack(wt,val,w,n-1);
            return table[n][w];
        }
    }
}
