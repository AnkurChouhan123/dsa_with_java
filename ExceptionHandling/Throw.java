package ExceptionHandling;
import java.util.Scanner;
/*
class AgeException extends RuntimeException{
   // Scanner sc=new Scanner(System.in);
    AgeException(String msg){
        super(msg);
    }

}
class AgeValidator{
    int age;
    void setAge(int age){
        if(age<18){
            throw new AgeException("not elgible");
        }
        this.age=age;
        System.out.println("eligible");
    }
}

public class Throw {
    public static void main(String[] args) {
          AgeValidator obj=new AgeValidator();
          obj.setAge(18);
    }
}
 */
class OddNumberException extends RuntimeException{
    OddNumberException(){
        System.out.println("odd number found");
    }
}

class CheckValidNumber{
    int n;
    void checkNumber(int n){
        if(n%2==1){
            throw new OddNumberException();
        }
        this.n=n;
        System.out.println("number is even");
    }

}

public class Throw {
    public static void main(String[] args) {
    }
}