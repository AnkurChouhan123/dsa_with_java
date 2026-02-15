package Recursion;

public class LongestAlmostPalindromicSubstring {

    public int almostPalindromic(String s) {

        int max = 0;

        for(int i = 0;i<s.length();i++){
            max = Math.max(max,
                    Math.max(
                            solve(s,i,i,0),
                            solve(s,i,i+1,0)
                    )
            );
        }

        return max;
    }

    int solve(String s,int i,int j,int delete){

        while(i>=0 && j<s.length()){

            if(s.charAt(i)==s.charAt(j)){
                i--;
                j++;
            }
            else{
                break;
            }
        }

        if(delete==1){
            return j-i-1;
        }

        // try deleting left or right
        int deleteLeft = 0;
        int deleteRight = 0;

        if(i>=0) deleteLeft = solve(s,i-1,j,1);
        if(j<s.length()) deleteRight = solve(s,i,j+1,1);

        return Math.max(deleteLeft, deleteRight);
    }

}
//
//
//You are given a string s consisting of lowercase English letters.
//
//A substring is almost-palindromic if it becomes a palindrome after removing exactly one character from it.
//
//Return an integer denoting the length of the longest almost-palindromic substring in s.
//
//
//
//Example 1:
//
//Input: s = "abca"
//
//Output: 4
//
//Explanation:
//
//Choose the substring "abca".
//
//Remove "abca".
//The string becomes "aba", which is a palindrome.
//Therefore, "abca" is almost-palindromic.
//        Example 2:
//
//Input: s = "abba"
//
//Output: 4
//
//Explanation:
//
//Choose the substring "abba".
//
//Remove "abba".
//The string becomes "aba", which is a palindrome.
//Therefore, "abba" is almost-palindromic.
//        Example 3:
//
//Input: s = "zzabba"
//
//Output: 5
//
//Explanation:
//
//Choose the substring "zzabba".
//
//Remove "zabba".
//The string becomes "abba", which is a palindrome.
//Therefore, "zabba" is almost-palindromic.
//
