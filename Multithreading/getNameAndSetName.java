package Multithreading;
class Thread1 extends Thread{
    public void run(){

        System.out.println(Thread.currentThread().isAlive()); // true because is at running stage
//        System.out.println("thread 1");
//        System.out.println(Thread.currentThread().getName());//Thread-0 (By default by JVM)
//        Thread.currentThread().setName("Ankur-1");  //Thread-0 <---> Ankur-1
//        System.out.println("After changing name "+Thread.currentThread().getName());
      //  System.out.println(10/0); //Exception in thread "Ankur-1" java.lang.ArithmeticException: / by zero
        //at Multithreading.Thread1.run(getNameAndSetName.java:7)
    }
        }
public class getNameAndSetName {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
//        System.out.println(t1.isAlive());//false because thread is not started yet
        t1.start();
//        System.out.println(Thread.currentThread().getName());// main
//        Thread.currentThread().setName("Ankur-Main");// main  <---> Ankur-Main
//        System.out.println(Thread.currentThread().getName()); // Ankur-Main
        //System.out.println(Thread.currentThread().isAlive());//true
       // System.out.println(t1.isAlive());//false because thread is not started yet
    }
}
