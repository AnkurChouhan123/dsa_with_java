package ExceptionHandling.ThrowsKeyword;
class VowelException extends RuntimeException{
    VowelException(String msg){
        super(msg);
    }
}
public class CheckVowels  {
    boolean isContainsVowel(String s) throws VowelException{
        //  System.out.println("vowel found");
        return s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains("u");
    }
    public static void main(String[] args) {
         CheckVowels obj=new CheckVowels();
         obj.isContainsVowel("Ankuri");
    }
}
