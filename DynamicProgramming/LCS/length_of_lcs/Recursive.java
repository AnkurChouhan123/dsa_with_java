package DynamicProgramming.LCS.length_of_lcs;

public class Recursive {

    public static void main(String[] args) {

        System.out.println(lcs("aftij","fahtj"));

    }

    static int lcs(String s1, String s2) {
        int idx1 = s1.length();
        int idx2 = s2.length();

        return helper(s1, s2, idx1 - 1, idx2 - 1);

    }

    static int helper(String s1, String s2, int idx1, int idx2) {

        if (idx1 < 0 || idx2 < 0) return 0;

        char ch1 = s1.charAt(idx1);
        char ch2 = s2.charAt(idx2);

        if (ch1 == ch2) {
            return 1 + helper(s1, s2, idx1 - 1, idx2 - 1);
        }

        return Math.max(helper(s1, s2, idx1 - 1, idx2), helper(s1, s2, idx1, idx2 - 1));

    }
}

