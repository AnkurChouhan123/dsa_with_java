package Multithreading;


class Testt1 implements Runnable{
    public void run(){
        System.out.println("test1");
    }
}
class Testt2 extends Testt1 implements Runnable{
    public void run(){
        System.out.println("test2");
    }
}
public class UsingRunnable {
    public static void main(String[] args) {
        Thread t1=new Thread(new Testt1());
        Thread t2=new Thread(new Testt2());
        t1.start();
        t2.start();
    }
}
