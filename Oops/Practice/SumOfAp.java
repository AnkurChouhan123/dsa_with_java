package Oops.Practice;

public class SumOfAp {
       public SumOfAp(int n){
         //  int diff=2;

           int sum=(n*(2+(n-1)*2))/2;
           System.out.println("you sum is :"+sum);
       }
    public static void main(String[] args) {
        new SumOfAp(5);
    }
}
