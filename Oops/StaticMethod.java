package Oops;
class Demo extends StaticMethod{
    static int count=0;
}
public class StaticMethod {

    public static void main(){
        System.out.println("abc");
        Demo.count++;
        if(Demo.count==10){
            return;
        }
       Demo.main();
        System.out.println("returning");
    }

}
