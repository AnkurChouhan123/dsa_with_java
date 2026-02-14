package DynamicProgramming.O_1_KnapSack;

import java.util.Arrays;

public class O3_Topdown {
    public static void main(String[] args) {
        int wt[]={1,3,4,5};
        int val[]={1,4,5,7};
        int w=7;

        System.out.println(knapsack(wt,val,w,4));

    }


    static int knapsack(int [] wt,int [] val,int w,int n){
         int [][] table=new int[n+1][w+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=w;j++){
                if(i==0||j==0){
                    table[i][j]=0;
                }
            }
        }
       for(int i=1;i<=n;i++){
           for(int j=1;j<=w;j++){
               if(wt[i-1]<=j){
                   table[i][j]= Math.max(val[i-1]+table[i-1][j-wt[i-1]],table[i-1][j]);

               }
               else{
                   table[i][j]= table[i-1][j];

               }
           }
       }

       return table[n][w];

    }
}
