package ExceptionHandling.ThrowKeyword;

import java.util.Scanner;

class VowelException extends RuntimeException{
    VowelException(String msg){
        super(msg);
    }
}
public class CheckVowels {
  //  Scanner sc=new Scanner(System.in);
    CheckVowels(String s){

        if(checkVowel(s)){
            System.out.println("vowel found");
        }
        else{
            throw new VowelException("vowel not found");
        }

    }
    String s;
    boolean checkVowel( String s){
         if(s.contains("a")||s.contains("e")||s.contains("i")||s.contains("o")||s.contains("u")){
           //  System.out.println("vowel found");
             return true;
         }
         else{
             throw new VowelException("vowels not found");
         }
    }
    public static void main(String[] args) {
            CheckVowels obj=new CheckVowels("bjsdh");
           // obj.checkVowel("ankur");
    }
}
