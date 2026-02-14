package ExceptionHandling.ThrowKeyword;

class OddNumberException extends RuntimeException{
    OddNumberException(String msg){
      //  System.out.println("odd number found");
        super(msg);
    }
}

public class CheckValidNumber {
    int n;
    void checkNumber(int n){
        if(n%2==1){
            throw new OddNumberException("odd number found");
        }
        this.n=n;
        System.out.println("number is even");
    }
    public static void main(String[] args) {
       CheckValidNumber obj=new CheckValidNumber();
       obj.checkNumber(3);
    }
}
