package Multithreading;
class Test extends Thread{
   public void run(){
       Thread.currentThread().setPriority(10);
       for(int i=1;i<=5;i++){
           System.out.println("test");
       }
   }
}
public class YieldMethod {
    public static void main(String[] args) {
        Test t= new Test();
        t.start();
       Thread.yield();
        for(int i=1;i<=5;i++){
            System.out.println("main");
        }
    }
}
