package DynamicProgramming.n_stair;

import java.util.Arrays;

public class O2_Memoization {
    public static void main(String[] args) {
        Arrays.fill(table,-1);
        System.out.println(nStair(5));

    }
     static int[] table =new int[1001];


   static int nStair(int n){
        if(n<=1) return 1;
        if(table[n-1]!=-1) return table[n-1];
        table[n-1]= nStair(n-1)+nStair(n-2);
        return table[n-1];
    }
}
