
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
//
//
//        checkCompressed("GEEKSFORGEEKS","G7G3S");
//
//    }
//    static void checkCompressed(String s, String t) {
//        int i=0;
//        int j=0;
//        while(i<s.length()&&j<t.length()){
//            char ch1=s.charAt(i);
//            char ch2=s.charAt(j);
//
//
//
//            if(ch1==ch2){
//                i++;
//                j++;
//                // System.out.println(i+"......"+j);
//            }
//            else if(Character.isDigit(ch2)){
//                int num=0;
//                while(Character.isDigit(t.charAt(j))){
//                    num=num*10+(t.charAt(j)-'0');
//                    System.out.println(num+"...");
//                    j++;
//                }
//                i+=num;
//                System.out.println(i+"......"+j);
//
//            }
//            else{
//                break;
//            }
//        }
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[]={1,2,3,4,5};
        boolean isFound=false;
        for(int element:arr){
            if(element==a) {
                isFound = true;
                break;
            }
        }
          if(isFound){
              System.out.println("mil gya");
          }
          else{
              System.out.println("nhi mila");
          }
    }
}


