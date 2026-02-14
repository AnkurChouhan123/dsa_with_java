package Multithreading.Interruption;
class Demo extends Thread{
    public void run(){

        try{
          //  System.out.println(isInterrupted());
            for(int i=1;i<=5;i++){
                interrupt();
                Thread.interrupted();
                Thread.sleep(1000);
                System.out.println(i);
                System.out.println(Thread.interrupted());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
public class InterruptedMethod {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.start();
        d.interrupt();
    }
}
