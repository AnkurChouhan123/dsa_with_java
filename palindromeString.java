import java.util.*;
public class palindromeString {
    public static Boolean main(String[] args) {
        String s="abcdcba";
      //  name.toLowerCase();

      //  char s []=name.toCharArray();

        int start=0;
        int end=s.length()-1;

        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        
  return true;

    }
}
