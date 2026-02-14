package DynamicProgramming.n_stair;

import java.util.Arrays;

public class O1_Recursive {
    public static void main(String[] args) {
        System.out.println(nStair(5));
    }

    static int nStair(int n) {
        if (n <= 1) return 1;
        return nStair(n - 1) + nStair(n - 2);

    }
}
